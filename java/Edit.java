/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ANYONE
 */
public class Edit extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet regserv</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet regserv at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();


                try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
//           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           }
        catch(ClassNotFoundException ce)
        {
                  out.println("<h1>driver</h1>");
    	System.out.println(ce);
    	}
//System.out.println("Oracle JDBC Driver Registered!");
        try
        {
        String street  =request.getParameter("textfield");
        String city  =request.getParameter("textfield2");
        String state  =request.getParameter("textfield3");
        String country  =request.getParameter("textfield4");
        String zpcode  =request.getParameter("textfield5");
        String id  =request.getParameter("textfield9");

 int rid =Integer.parseInt(id);
 int zipcode =Integer.parseInt(zpcode);
   
      	Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@Prerana:1521:XE", "project",
					"project");

         String insertStoreProc = "{call CHANGE_ADDRESS(?,?,?,?,?,?)}";
CallableStatement s1;
s1 = con.prepareCall(insertStoreProc);
s1.setString(1, street);
//s1.setInt(2, r_id);
s1.setString(2, city);
s1.setString(3, country);
s1.setString(4, state);
s1.setInt(5, zipcode);
s1.setInt(6, rid);
s1.executeUpdate();
//      request.getRequestDispatcher("regist.jsp").forward(request, response);  
        //request.setAttribute("mycuisine",cuisine);
String strI = "" + rid;
        request.setAttribute("myname",strI);
//      request.getRequestDispatcher("regist.jsp").forward(request, response);  
//        request.setAttribute("mycuisine",cuisine);
  //      request.getRequestDispatcher("regist.jsp").forward(request, response);  

request.getRequestDispatcher("first.jsp").forward(request, response);  


    	}
        catch(SQLException ce)
        {
            System.out.println("Connection Failed! Check output console");
    	    out.println(ce);
    	}
    }


    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
