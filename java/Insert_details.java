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
public class Insert_details extends HttpServlet {
   
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
               String rname = request.getParameter("textfield");
        String cuisine  =request.getParameter("select");
         String owner  =request.getParameter("textfield3");
        int contact  =Integer.parseInt(request.getParameter("textfield5"));
        String street  =request.getParameter("textfield6");
      String city  =request.getParameter("textfield7");
        String state  =request.getParameter("textfield8");
        String country  =request.getParameter("textfield9");
        int zipcode  =Integer.parseInt(request.getParameter("textfield10"));
        String takeaway  =request.getParameter("textfield11");
        String wifi  =request.getParameter("textfield12");
        String restro_time  =request.getParameter("textfield13");
        String parking  =request.getParameter("textfield14");
        String alcohol  =request.getParameter("textfield15");
        String website  =request.getParameter("textfield16");
//int r_id=140;
      
     //   String url = "jdbc:odbc:regis";
      	Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@Prerana:1521:XE", "project",
					"project");

         String insertStoreProc = "{call INSERT_DATA(?,?,?,?)}";
CallableStatement s1;
s1 = con.prepareCall(insertStoreProc);
s1.setString(1, rname);
//s1.setInt(2, r_id);
s1.setString(2, cuisine);
s1.setInt(3, contact);
s1.setString(4, owner);
s1.executeUpdate();


Statement s2 = con.createStatement();

//out.println("The sample value is " + rrname);


    String qury="select restro_id from restro where restro_name ='"+rname+"' ";

    ResultSet rs = s2.executeQuery(qury);
                   while(rs.next())
                   {
                        int r_id=Integer.parseInt(rs.getString(1));
                   

  
String insertStoreProc3 = "{call INSERT_DATA_ADDRESS(?,?,?,?,?,?)}";
CallableStatement s3;
s3 = con.prepareCall(insertStoreProc3);
s3.setString(1, street);
//s1.setInt(2, r_id);
s3.setString(2, city);
s3.setString(3, state);
s3.setString(4, country);
s3.setInt(5, zipcode);
s3.setInt(6, r_id);
s3.executeUpdate();

String insertStoreProc4 = "{call INSERT_DATA_RESTRO_DETAILS(?,?,?,?,?,?,?)}";
CallableStatement s4;
s4 = con.prepareCall(insertStoreProc4);
s4.setString(1, takeaway);
//s1.setInt(2, r_id);
s4.setString(2, wifi);
s4.setString(3, parking);
s4.setString(4, website);
s4.setString(5, restro_time);
s4.setString(6, alcohol);
s4.setInt(7, r_id);
s4.executeUpdate();

        out.println("<html>");
        out.println("<l0ink rel='stylesheet' type='text/css' href='css/style.css' />");
        out.println("<h1>Your account has been created successfully</h1>");
        ////passing from servlet to jsp
       //int i = 5;
String strI = "" + r_id;
        request.setAttribute("myname",strI);

        request.setAttribute("mycuisine",cuisine);
        request.getRequestDispatcher("regist.jsp").forward(request, response);  
                   }
        

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
