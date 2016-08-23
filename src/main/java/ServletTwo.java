import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

//@WebServlet(name = "ServletOne", urlPatterns = "/ServletOne")
public class ServletTwo extends javax.servlet.http.HttpServlet {



    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        //final String inputData = request.getParameter("name");

        //session.setAttribute("inputData", inputData);
        //------------------------------


        ArrayList<String> res = (ArrayList<String>) session.getAttribute("list");




        int index =new Random().nextInt(res.size());
        String img = res.get(index);
        request.setAttribute("imgSrc", img);




        //-------------
        //response.sendRedirect("indexAfter.jsp");
        request.getRequestDispatcher("indexAfter.jsp").forward(request,response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
