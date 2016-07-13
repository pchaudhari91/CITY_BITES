/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ANYONE
 */
public class Select extends HttpServlet {
   
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
            out.println("<title>Servlet payinf</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet payinf at " + request.getContextPath () + "</h1>");
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
        PrintWriter out = response.getWriter();

            try {
                    //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Class.forName("oracle.jdbc.driver.OracleDriver");
  //      String rrname =request.getParameter("name");
//        String rrname =request.getParameter("rrcuisnie");
//String rrname =request.getSession().getAttribute("name").toString();
//String rcuisine =request.getSession().getAttribute("Italian").toString();
//String rid = request.getParameter("parameter");
//out.println("The sample value is " + rrname);


      //   String rcuisine = request.getParameter("Italian");
                        String id = request.getParameter("textfield");

  int rid  =Integer.parseInt(id);  
//out.println("The sample value is " + rid);         
//out.println(rrname);
                    //String url = "jdbc:odbc:paym";
  	Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@Prerana:1521:XE", "project",
					"project");
           
//Statement s2 = con.createStatement();

//out.println("The sample value is " + rrname);


Statement s = con.createStatement();
    String query="delete from address where address_restro_id = '"+rid+"' ";
  s.executeQuery(query);
Statement s1 = con.createStatement();
    String query1="delete from restro_details where details_restro_id = '"+rid+"' ";
  s1.executeQuery(query1);
Statement s2 = con.createStatement();
    String query2="delete from restro where restro_id = '"+rid+"' ";
  s2.executeQuery(query2);
    
    /*
Statement s1 = con.createStatement();  
ResultSet rss = s1.executeQuery("select state,country,zipcode from rdetails where state='ca'");

ResultSet rsss = s2.executeQuery("select takeaway,wifi,timings,parking,alcohol,website from rfacility where takeaway='yes'");
*/
/*
//out.println("<body background='images\graphic.jpg'>");
out.println("<html>");
        //out.println("<link rel='stylesheet' type='text/css' href='css/style.css' />");
                 while(rs.next())
        {
//String rowner= rs.getString(3);
//out.println("The sample value is " + rowner);
      
                    out.println("<br><br><br><br><br>");
                    out.println("<table border=0>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Restaurant Name :");
                    out.println( "\t"+rs.getString(1));
                    out.println(" </tr> ");
                    out.println("</td>");
                  
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Cuisine :");
                    out.println( "\t"+rs.getString(2));
                    out.println(" </tr> ");
                    out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Owner's Name :");
                    out.println( "\t"+rs.getString(3));
                    out.println(" </tr> ");
                    out.println("</td>");                    
                  
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Contact :");
                    out.println( "\t"+rs.getString(4));
                    out.println(" </tr> ");
                    out.println("</td>");
                    
                    
                    out.println("<tr>"); 
                    out.println("<td>");
                    out.println("Address :");
                    out.println( "\t"+rs.getString(5));
                    out.println(" </tr> ");
                    out.println("</td>");
                    
                  out.println("<tr>");
                  out.println("<td>");
                  out.println("City :");
                  out.println( "\t"+rs.getString(6));
                  out.println(" </tr> ");
                  out.println("</td>");
                
                  //out.println("</td>");


            //      out.println("</tr>");
        }*/
 /*              while(rss.next())
        {out.println("<tr>");
                              out.println("<td>");
                 
                  out.println("State :");
                  out.println( "\t"+rss.getString(1));
                     out.println(" </tr> ");
    out.println("</td>");
    
    out.println("<tr>");
            
    out.println("<td>");
                
                  out.println("Country :");
                  out.println( "\t"+rss.getString(2));
                     out.println(" </tr> ");
                  out.println("<tr>");
    out.println("</td>");
                  out.println("<td>");
                
                  out.println("Zipcode :");
                   out.println( "\t"+rss.getString(3));
                     out.println(" </tr> ");
    out.println("</td>");

/*                     out.println(" <tr> ");
                  //   out.println(" <td align= center > ");
                     out.println( "\t"+rs.getString(1));
                   //  out.println("</td>");
              //       out.println("<td align = center >");
        	     out.println("\t"+rs.getString(2));
                //     out.println("</td>");
                  //   out.println("<td align = center >");
        	     out.println("\t"+rs.getString(3));
//                     out.println("</td>");
  //                   out.println("<td align = center >");
        	     out.println("\t"+rs.getString(4));
    //                 out.println("</td>");

      //               out.println("<td align = center >");
        	     out.println("\t"+rs.getString(5));
        //             out.println("</td>");
          //           out.println("<td align = center >");
        	     out.println("\t"+rs.getString(6));
//                     out.println("</td>");
  //                   out.println("<td align = center >");
        	     out.println("\t"+rs.getString(7));
    //                 out.println("</td>");
      //               out.println("<td align = center >");
        	     out.println("\t"+rs.getString(8));
        //             out.println("</td>");
          //           out.println("<td align = center >");
        	     out.println("\t"+rs.getString(9));
            //         out.println("</td>");
              //       out.println("<td align = center >");
        	     out.println("\t"+rs.getString(10));
                //     out.println("</td>");

                  //   out.println("</td>");
//                     out.println(" </tr> ");
            } */
/*               while(rsss.next())
        {           out.println("<br><br><br><br><br>");
                    out.println("<center><table border=0>");

                    out.println("<td>");
            out.println("<tr>");
                 
                  out.println("Takeaway :");
                  out.println( "\t"+rsss.getString(1));
                     out.println(" </tr> ");
    out.println("</td>");
    
            
    out.println("<td>");
    out.println("<tr>");
                
                  out.println("Wifi :");
                  out.println( "\t"+rsss.getString(2));
                     out.println(" </tr> ");
    out.println("</td>");
                  out.println("<td>");
                  out.println("<tr>");
                
                  out.println("Timings :");
                   out.println( "\t"+rsss.getString(3));
                     out.println(" </tr> ");
    out.println("</td>");
                      out.println("<td>");
                  out.println("<tr>");
                
                  out.println("Parking :");
                   out.println( "\t"+rsss.getString(4));
                     out.println(" </tr> ");
    out.println("</td>");
                      out.println("<td>");
                  out.println("<tr>");
                
                  out.println("Alcohol :");
                   out.println( "\t"+rsss.getString(5));
                     out.println(" </tr> ");
    out.println("</td>");
                      out.println("<td>");
                  out.println("<tr>");
                
                  out.println("Website :");
                   out.println( "\t"+rsss.getString(6));
                     out.println(" </tr> ");
    out.println("</td>");
        }
                       request.getRequestDispatcher("regist.jsp").forward(request, response);  

                  // out.println("</table>");
*/        request.getRequestDispatcher("first.jsp").forward(request, response);
            }
        catch(Exception e)
        {

        }


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
        processRequest(request, response);




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
