import java.io.IOException;
import javax.servlet.*;

/*
    Cache is not security
    Session scope is a secure way, such as bank system. terminate session after 5 min.
*/


public class day8_servlet  extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("name");
        String pass = req.getParameter("pass");
        System.out.println(username);
        System.out.println(pass);
        if(username.length()<=0 || pass.length()<=0)
        {
            RequestDispatcher red = req.getRequestDispatcher("/error.html");
            red.forward(req, resp);
        }

        else
        {
            RequestDispatcher red = req.getRequestDispatcher("/result.html");
            red.forward(req, resp);
        }
    }
}

