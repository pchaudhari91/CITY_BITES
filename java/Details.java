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
public class Details extends HttpServlet {
   
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
String rrid =request.getSession().getAttribute("name").toString();
//String rcuisine =request.getSession().getAttribute("rrcuisine").toString();


  //      int zipcode  =Integer.parseInt(request.getParameter("textfield10"));
    //    String takeaway  =request.getParameter("textfield11");
//out.println("The sample value is " + rrname);
//out.println("The sample value is " + rcuisine);

//out.println(rrname);
                    //String url = "jdbc:odbc:paym";
            	Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@Prerana:1521:XE", "project",
					"project");
           
                Statement s = con.createStatement();
Statement s3 = con.createStatement();
Statement s2 = con.createStatement();

out.println("RESTAURANT DETAILS : " );


    String query="select restro_name, cusine, owner_name, rcontact_number from restro where restro_id ='"+rrid+"' ";

    ResultSet rs = s.executeQuery(query);
    
    String query2="select street,city,state,country,zipcode from address where address_restro_id ='"+rrid+"' ";

    ResultSet rss = s2.executeQuery(query2);
  //  ResultSet rss = s1.executeQuery("select state,country,zipcode from address where ADDRESS_RESTRO_ID =290");
    String query3="select takeaway,wifi,restro_time,parking,alchohol,website from restro_details where details_restro_id='"+rrid+"' ";
    
    ResultSet rsss = s3.executeQuery(query3);
//ResultSet rsss = s2.executeQuery("select restro_nme where restro_id=290");

//out.println("<body background='images\graphic.jpg'>");
out.println("<html>");
        //out.println("<link rel='stylesheet' type='text/css' href='css/style.css' />");
                 while(rs.next())
        {
//String rowner= rs.getString(3);
//out.println("The sample value is " + rowner);
      
                    out.println("<br><br>");
                    out.println("<table border=0>");
                  
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("RESTAURANT NAME :");
                    out.println( "\t"+rs.getString(1));
                    out.println(" </tr> ");
                    out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("CUISINE :");
                    out.println( "\t"+rs.getString(2));
                    out.println(" </tr> ");
                    out.println("</td>");
  
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("OWNER'S NAME :");
                    out.println( "\t"+rs.getString(3));
                    out.println(" </tr> ");
/*--*/              out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("CONTACT :");
                    out.println( "\t"+rs.getString(4));
                    out.println(" </tr> ");
                     
                  
                    
                    
             
  

                  
                
                  //out.println("</td>");


            //      out.println("</tr>");
        }
           
                 while(rss.next())
        {
            
        
                    out.println("<tr>");         
                    out.println("<td>");
                    out.println("STREET :");
                    out.println( "\t"+rss.getString(1));
                    out.println(" </tr> ");
                    out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("CITY :");
                    out.println( "\t"+rss.getString(2));
                    out.println(" </tr> ");
                    out.println("</td>");
                     
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("STATE :");
                    out.println( "\t"+rss.getString(3));
                    out.println(" </tr> ");
                    out.println("</td>");
    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("COUNTRY :");
                    out.println( "\t"+rss.getString(4));
                    out.println(" </tr> ");
                    out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("ZIPCODE :");
                    out.println( "\t"+rss.getString(5));
                    out.println(" </tr> ");
                    out.println("</td>");
        }
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
               while(rsss.next())
        {           out.println("<br><br>");
                    out.println("<table border=0>");
                  
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("TAKE AWAY :");
                    out.println( "\t"+rsss.getString(1));
                    out.println(" </tr> ");
                    out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("WIFI :");
                    out.println( "\t"+rsss.getString(2));
                    out.println(" </tr> ");
                    out.println("</td>");
  
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("PARKING :");
                    out.println( "\t"+rsss.getString(3));
                    out.println(" </tr> ");
/*--*/              out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("WEBSITE :");
                    out.println( "\t"+rsss.getString(4));
                    out.println(" </tr> ");
                    out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("TIMING :");
                    out.println( "\t"+rsss.getString(5));
                    out.println(" </tr> ");
                    out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("ALCOHOL :");
                    out.println( "\t"+rsss.getString(6));
                    out.println(" </tr> ");
                    out.println("</td>");
        }       
                  // out.println("</table>");
        
        
         /*                  while(rsss.next())
        {
//String rowner= rs.getString(3);
//out.println("The sample value is " + rowner);
                        
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Take away :");
                    out.println( "\t"+rsss.getString(1));
                    out.println(" </tr> ");
                    out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Wifi :");
                    out.println( "\t"+rsss.getString(2));
                    out.println(" </tr> ");
                    out.println("</td>");
  
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Timings :");
                    out.println( "\t"+rsss.getString(3));
                    out.println(" </tr> ");
            out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Parking :");
                    out.println( "\t"+rsss.getString(4));
                    out.println(" </tr> ");
                     out.println(" </td> ");
                  
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Alcohol :");
                    out.println( "\t"+rsss.getString(5));
                    out.println(" </tr> ");
              out.println("</td>");
                    
                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Website :");
                    out.println( "\t"+rsss.getString(6));
                    out.println(" </tr> ");
              out.println("</td>");
                    
             
  

                  
                
                  //out.println("</td>");


            //      out.println("</tr>");
        }
       */
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