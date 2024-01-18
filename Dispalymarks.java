
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dispalymarks")
public class Dispalymarks extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String jdbcURL = "jdbc:mysql://localhost:3306/sai?useUnicode=true&characterEncoding=utf8";
        String jdbcUsername = "root";
        String jdbcPassword = "keerthi@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

            String sql = "SELECT * FROM marks3";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<html><head><title>Marks Table</title></head><body>");
            out.println("<h2>Marks Table</h2>");
            out.println("<table border='1'>");
            out.println("<tr><th>MID</th></tr>");

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String Demoid=resultSet.getString("demomid");
                out.println("<tr><td>" + id + "</td></tr>");
                out.println("<tr><td>" + Demoid + "</td></tr>");
            }

            out.println("</table></body></html>");

            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
