import func.Func;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

//@WebServlet(name = "ServletOne", urlPatterns = "/ServletOne")
public class ServletOne extends javax.servlet.http.HttpServlet {



    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();


        String inputData = request.getParameter("name");
        String defData = "Lol";


        if(!inputData.equals("")){session.setAttribute("name", inputData);}
        if(inputData.equals("")){session.setAttribute("name", defData);}

        //------------------------------


        ArrayList<String> res =new Func().jsMet( inputData);

        session.setAttribute("list", res);
         int index =new Random().nextInt(res.size());
        String img = res.get(index);

        request.setAttribute("imgSrc", img);
        request.setAttribute("name", inputData);




        //-------------
        //response.sendRedirect("indexAfter.jsp");
        request.getRequestDispatcher("indexAfter.jsp").forward(request,response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
