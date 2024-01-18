import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String jdbcURL = "jdbc:mysql://localhost:3306/sai?useUnicode=true&characterEncoding=utf8";
        String jdbcUsername = "root";
        String jdbcPassword = "keerthi@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

            InputStream inputStream = null;
            Part filePart = request.getPart("file");

            if (filePart != null) {
                inputStream = filePart.getInputStream();
            }
            String midValue = "\uFE67\uEC01\u0000\u0000..."; // Unicode escape sequence
            PreparedStatement statement = connection.prepareStatement("INSERT INTO marks4 (demomid) VALUES (?)");
            statement.setString(1, midValue);
            statement.executeUpdate();
            

            //String sql = "INSERT INTO marks1 (MID) VALUES (?)";
            //PreparedStatement statement = connection.prepareStatement(sql);
            //statement.setBlob(1, inputStream);
            

            int result = statement.executeUpdate();
            if (result > 0) {
                response.getWriter().println("File uploaded and saved in database.");
                
            } else {
                response.getWriter().println("Error in uploading file.");
            }
            

            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
