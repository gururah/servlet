import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet
{
    @Override
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
    
    int number1 = Integer.parseInt(req.getParameter("first-number"));
    int number2 = Integer.parseInt(req.getParameter("second-number"));

PrintWriter out=res.getWriter();
out.println("Welcome to my First Servlet APP multiple of two number is :" + (number1 * number2));
}
}