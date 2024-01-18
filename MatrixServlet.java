import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/MatrixServlet")
public class MatrixServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/sai";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "keerthi@123";
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the CO-PO matrix values from the form
    	
    	String[][] matrix = new String[5][14]; // Fixed 5x14 matrix (12 POs, pso1, pso2)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 14; j++) {
                String paramName = "matrix[co" + (i + 1) + "][";
                if (j < 12) {
                    paramName += "po" + (j + 1);
                } else if (j == 12) {
                    paramName += "pso1";
                } else if (j == 13) {
                    paramName += "pso2";
                }
                paramName += "]";
                
                String value = request.getParameter(paramName);
                matrix[i][j] = value;
            }
        }

        // Save the matrix data to the database
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Create the table if it doesn't exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS co_po_matrix ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "co VARCHAR(10) NOT NULL,"
                    + "po1 VARCHAR(10),"
                    + "po2 VARCHAR(10),"
                    + "po3 VARCHAR(10),"
                    + "po4 VARCHAR(10),"
                    + "po5 VARCHAR(10),"
                    + "po6 VARCHAR(10),"
                    + "po7 VARCHAR(10),"
                    + "po8 VARCHAR(10),"
                    + "po9 VARCHAR(10),"
                    + "po10 VARCHAR(10),"
                    + "po11 VARCHAR(10),"
                    + "po12 VARCHAR(10),"
                    +"pso1 VARCHAR(10),"
                    +"pso2 VARCHAR(10"
                    + "))";
            preparedStatement = connection.prepareStatement(createTableSQL);
            preparedStatement.executeUpdate();

            // Insert the matrix data into the database
            for (int i = 0; i < 5; i++) {
            	String insertSQL = "INSERT INTO co_po_matrix (co, po1, po2, po3, po4, po5, po6, po7, po8, po9, po10, po11, po12,pso1,pso2) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                preparedStatement = connection.prepareStatement(insertSQL);

                preparedStatement.setString(1, "co" + (i + 1)); // Set CO as "co1," "co2," etc.

                for (int j = 0; j < 14; j++) {
                    preparedStatement.setString(j + 2, matrix[i][j]); // Set PO values
                }
            
                preparedStatement.executeUpdate();
            }

            // Redirect back to a success page
            response.sendRedirect("success.jsp");
           
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or validation errors as needed
            // Redirect to an error page
            response.sendRedirect("error.jsp");
           
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
