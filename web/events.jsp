
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EVENTS</title>
    </head>
    <body>



  <title>Gallery - Gallery Page | Design Company - Free Website Template from Templatemonster.com</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
  <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
  <script type="text/javascript" src="js/jquery-1.4.2.min.js" ></script>
 	<script type="text/javascript" src="js/roundabout.js"></script>
  <script type="text/javascript" src="js/roundabout_shapes.js"></script>
  <script type="text/javascript" src="js/gallery_init.js"></script>
  <script type="text/javascript" src="js/loopedslider.min.js"></script>
  <script type="text/javascript">
		$(function(){
			// Option set as a global variable
			$('#loopedSlider').loopedSlider({
				container: ".wrap",
				containerClick: false
			});
		});
	</script>
  
  <header>
    <div class="container">
    	<h1><a href="index.jsp">CITY BITES</a></h1>
      <nav>
        <ul>
        	<li><a href="index.jsp">Home</a></li>
          <li><a href="about.jsp">About</a></li>
          <li><a href="disparticle.jsp">Cuisine</a></li>
          <li><a href="events.jsp" class="current">Events</a></li>
          <li><a href="contacts.jsp">Contact</a></li>
          <li><a href="blogs.jsp">Blog</a></li>
          <li><a href="first.jsp">New Restaurant</a></li>
        </ul>
      </nav>
    </div>
	</header>
  <!-- #gallery -->
  <section id="gallery">
  	<div class="container">
    	<ul id="myRoundabout">
      	<li><img src="images/food1.jpg" alt=""></li>
        <li><img src="images/food2.jpg" alt=""></li>
        <li><img src="images/food3.jpg" alt=""></li>
        <li><img src="images/food4.jpg" alt=""></li>
        <li><img src="images/food5.jpg" alt=""></li>
      </ul>
  	</div>
  </section>
  <!-- /#gallery -->
  <div class="main-box">
    <div class="container">
      <div class="inside">
        <div class="wrapper">
        	<!-- aside -->
          <aside>
            <h2>Upcoming <span>Events</span></h2>
            <!-- loopedSlider begin -->
            <div id="loopedSlider">
              <div class="wrap">
                <div class="slides">
                  <div><a href="#"><img src="images/thumb/event1.jpg" alt=""></a></div>
                  <div><a href="#"><img src="images/thumb/event2.jpg" alt=""></a></div>
                  <div><a href="#"><img src="images/thumb/event3.jpg" alt=""></a></div>
                  <div><a href="#"><img src="images/thumb/event4.jpg" alt=""></a></div>
                  <div><a href="#"><img src="images/thumb/event5.jpg" alt=""></a></div>
                </div>
              </div>
              <ul class="nav-controls">
              	<li><a href="#" class="previous">Previous Page</a></li>
              	<li><a href="#" class="next">Next Page</a></li>
              </ul>
            </div>
            <!-- loopedSlider end -->
          </aside>
          <!-- content -->
          <section id="content">
              <h3><a href=" ">New Year’s Eve with the Monophonics and delicious buffet</a><br></h3>
                  December 31, Sierra Nevada big room, Livermore<br><br>
                  <h3><a href=" ">Wine Tasting at Long Creek Winery</a><br></h3>
                    Saturday, December 20, 2015, Long Creek Winery - 323 Ward Blvd., Vacaville<br><br>
              <h3><a href=" ">Livermore Contra Dance Live music by the PUB SCOUTS</a><br></h3>
                    Saturday, December 13, 2015, 2775 Nord Ave. Info: Mark . Grace 877-2930 . Joy 891-8789<br><br>
              <h3><a href=" ">Shop, Dine & Save Friday, This Friday night's entertainment includes Seamless Magic by Kris Bentz and Michael Taylor offering balloon art</a><br></h3>
                    December 5, Downtown Livermore<br><br>
                    <h3><a href=" ">Community Christmas Tree Lighting, Performances by Children's Choir of Livermore and Sounds of the Valley Chorus, a presentation by the Mayor, and a visit with Santa Claus!</a><br></h3>
                   Tue, December 2 - 9:01am<br>
               
          </section>
        </div>
      </div>
    </div>
  </div>
  <!-- footer -->
  <footer>
    <div class="container">
    	<div class="wrapper">
        <div class="fleft">Copyright© CITY BITES!!!</div>
        <div class="fright"><!--<a rel="nofollow" href="http://www.templatemonster.com/" target="_blank">Website template</a> designed by TemplateMonster.com&nbsp; &nbsp; |&nbsp; &nbsp; <a href="http://templates.com/product/3d-models/" target="_blank">3D Models</a> provided by Templates.com--></div>
      </div>
    </div>
  </footer>
  <script type="text/javascript"> Cufon.now(); </script>
</body>
</html>
