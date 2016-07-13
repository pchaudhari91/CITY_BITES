

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIGN-UP</title>
    </head>
    <body>


<body background="images/food15.jpg">

        <center><h1>Account Details</h1></center>



<form method="get" action="payinf">
                 <blockquote>

                    <p class="restro"></p>
<%String name = (String)request.getAttribute("myname"); %>
         <h2>Restaurant ID :</h2>  <h4> <%= name%></h4>
<p class="restro">&nbsp;</p>
<%String rcuisine = (String)request.getAttribute("mycuisine"); %>
         <h2>Cuisine :</h2>  <h4> <%= rcuisine%></h4>
 <!--passing variable from jsp to servlet-->  
<%session.setAttribute("name",name);%>

<p></p>
<p class="restro">&nbsp;</p>
                   <p class="restro">&nbsp;</p>
                   
                    <input type="submit" value="View Profile"  />
                   <p class="restro">&nbsp;</p>
 </blockquote>
</form>

<form action="first.jsp">
&emsp;&emsp;     <input type="submit" value="Sign Out"/>
</form>


</body>
</html>



