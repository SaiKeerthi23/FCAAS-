

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("/CourseServlet")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        // Get form parameters
	        String regulation = request.getParameter("regulation");
	        int year = Integer.parseInt(request.getParameter("year"));
	        int semester = Integer.parseInt(request.getParameter("semester"));
	        String[] subjectCodes = request.getParameterValues("subject_code");
	        String[] subjectNames = request.getParameterValues("subject_name");
		
		
		
		try {
         // Establish a database connection
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sai","root","keerthi@123");
         // Insert data into the database
         
        	
         String sql = "INSERT INTO subjects VALUES (?, ?, ?, ?, ?)";
         PreparedStatement preparedStatement = connection1.prepareStatement(sql);
         for (int i = 0; i < subjectCodes.length; i++) {
             preparedStatement.setString(1, regulation);
             preparedStatement.setInt(2, year);
             preparedStatement.setInt(3, semester);
             preparedStatement.setString(4, subjectCodes[i]);
             preparedStatement.setString(5, subjectNames[i]);
             preparedStatement.executeUpdate();
         }
         out.println("Subjects inserted successfully!");
     
         preparedStatement.close();
         connection1.close();
         
         
     } catch (Exception e) {
     	out.println("Error: " + e.getMessage());
     	
       
     }
		
	}



	}


