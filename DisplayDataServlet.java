// DisplayDataServlet.java
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/displayData")
public class DisplayDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the MySQL database
            String jdbcUrl = "jdbc:mysql://localhost:3306/sai";
            String username = "root";
            String password = "keerthi@123";
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);

            // Execute SQL query to fetch data
            String sqlQuery = "SELECT * FROM sai.mark32";
            PreparedStatement statement = conn.prepareStatement(sqlQuery);
            ResultSet resultSet = statement.executeQuery();

            // Display data in HTML
            out.println("<html><head><title>Data Display</title></head><body><h2>Data Display</h2><table border='1'><thead><tr>");

            // Display column headers
            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                out.println("<th>" + resultSet.getMetaData().getColumnName(i) + "</th>");
            }
            out.println("</tr></thead><tbody>");

            // Display data rows
            while (resultSet.next()) {
                out.println("<tr>");
                for (int i = 1; i <= columnCount; i++) {
                    out.println("<td>" + resultSet.getString(i) + "</td>");
                }
                out.println("</tr>");
            }

            out.println("</tbody></table></body></html>");
            

            // Close resources
            resultSet.close();
            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            out.println("An error occurred: " + e.getMessage());
            
        }
    }
}
