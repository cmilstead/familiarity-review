import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SimpleServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Start each line of HTML for output
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Career Info</title>");
            out.println("</head>");
            out.println("<body>");
            // Show context path
            out.println("<h1>Servlet Career at " + request.getContextPath() + "</h1>");
            // Take in form data
            String name = request.getParameter("name");
            String title = request.getParameter("title");
            String company = request.getParameter("company");
            String industry = request.getParameter("industry");
            // Output form data
            out.println("<p>Name: " + name + "</p>");
            out.println("<p>Title: " + title + "</p>");
            out.println("<p>Company: " + company + "</p>");
            out.println("<p>Industry: " + industry + "</p>");
            out.println("</body>");
            out.println("</html>");
            // End of HTML output
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet Info";
    }

}
