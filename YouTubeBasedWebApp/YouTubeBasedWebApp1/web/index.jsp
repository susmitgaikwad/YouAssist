<%-- 
    Document   : index
    Created on : Mar 10, 2016, 11:05:17 PM
    Author     : SHRIYA JAISWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="no-js oldie ie8" lang="en"> <![endif]-->
<!--[if IE 9 ]><html class="no-js oldie ie9" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <!--- basic page needs (Tab header)
    ================================================== -->
            <meta charset="utf-8">
            <title>YouAssist</title>
            <meta name="description" content="">  
            <meta name="author" content="">

            <!-- mobile specific metas
            ================================================== -->
            <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

            <!-- CSS
       ================================================== -->
            <link rel="stylesheet" href="css/base.css">  
            <link rel="stylesheet" href="css/main.css">
            <link rel="stylesheet" href="css/vendor.css">     

            <!-- script
            ================================================== -->
            <script src="js/modernizr.js"></script>

            <!-- favicons (logo)
                 ================================================== -->
            <link rel="icon" type="image/png" href="favicon.png">

        </head>
        <body>

        <body id="top">

            <!-- header 
       ================================================== -->
            <header>

                <div class="row">

                    <div class="logo">
                        <a href="index.html">Lhander</a>
                    </div>

                    <nav id="main-nav-wrap">
                        <ul class="main-navigation">
                            <li class="current"><a class="smoothscroll"  href="#intro" title="">Home</a></li>
                            <li><a class="smoothscroll"  href="#features" title="">About</a></li>
                            <li><a class="smoothscroll"  href="#process" title="">Process</a></li>
                            <li><a class="smoothscroll"  href="#pricing" title="">Form</a></li>
                            <li><a class="smoothscroll"  href="#testimonials" title="">Contact</a></li>
                            <li><a class="smoothscroll"  href="#faq" title="">FAQ</a></li>



                        </ul>
                    </nav>

                    <a class="menu-toggle" href="#"><span>Menu</span></a>

                </div>   	

            </header> <!-- /header -->

            <!-- intro section (Video on home page)
       ================================================== -->
            <section id="intro">

                <div class="shadow-overlay"></div>

                <div class="intro-content">
                    <div class="row">

                        <div class="col-twelve">

                            <div class='video-link'>
                                <a href="#video-popup"><img src="images/play-button.png" alt=""></a>
                            </div>

                            <h5>Hey there,</h5>
                            <h5></h5>
                            <h1>YouAssist will make your video surfing experience a lot better.</h1>

                            <a class="button stroke smoothscroll" href="#process" title="">Learn More</a>

                        </div>  

                    </div>   		 		
                </div> 

                <!-- Modal Popup (for video)
                   ========================================================= -->
              <!--  
                <div id="video-popup" class="popup-modal mfp-hide">

                    <div class="fluid-video-wrapper">
                        <iframe src="http://player.vimeo.com/video/14592941?title=0&amp;byline=0&amp;portrait=0&amp;color=faec09" width="500" height="281" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe> 
                    </div>		     

                    <a class="close-popup">Close</a>         

                </div> <!-- /video-popup -->  	 	
                
            </section> <!-- /intro -->


            <!-- features Section (About)
            ================================================== -->
            <section id="features">

                <div class="row section-intro">
                    <div class="col-twelve with-bottom-line">

                        <h5>About</h5>
                        <h1>YouAssist</h1>

                        <p class="lead">B.E level project by a team of 4 from Smt. Kashibai Navale College of Engineering and guided by Prof. Pramod.B.Mali 
                        </p>

                    </div>   		
                </div>

                <div class="row features-content">

                    <div class="features-list block-1-3 block-s-1-2 block-tab-full group">

                        <div class="bgrid feature">	

                            <span class="icon"><i class="icon-window"></i></span>            

                            <div class="service-content">	

                                <h3 class="h05">What is Spam?</h3>

                                <p>Spam is content that may cause a negative user experience by making it difficult to find more relevant and substantive material. It can sometimes be used to indiscriminately propagate unsolicited bulk messages through media to users.
                                <p>On YouTube video spamming occurs very frequently in the form of artificial traffic spam, misleading metadata, misleading or racy thumbnails, scams and comment spamming.</p>

                                </p>

                            </div> 	         	 

                        </div> <!-- /bgrid -->

                        <div class="bgrid feature">	

                            <span class="icon"><i class="icon-eye"></i></span>                          

                            <div class="service-content">	
                                <h3 class="h05">Why is Spam bad?</h3>  

                                <p>Spam causes users to waste substantial time while browsing spam. It may also cause overheads due to the cost of excess bandwidth. Not to mention annoyance due to irrelevant and misleading results. There is also a risk of malware links being hidden as a link to a supposedly deleted video. Other than damage to user system, may also lead to illegal websites thus causing user unnecessary trouble.

                                </p>


                            </div>	                          

                        </div> <!-- /bgrid -->

                        <div class="bgrid feature">

                            <span class="icon"><i class="icon-paint-brush"></i></span>		            

                            <div class="service-content">
                                <h3 class="h05">How will this Systen help you?</h3>

                                <p>YouAssist works on the basis of a probabilistic classifier that will determine the estimated legitimacy of a video based on the attributes provided by you. This will help you get an idea of the relevance of the video instead of wasting your time.

                                </p> 


                            </div> 	            	               

                        </div> <!-- /bgrid -->

                    </div> <!-- features-list -->

                </div> <!-- features-content -->

            </section> <!-- /features -->



            <!-- Process Section (Process)
            ================================================== -->
            <section id="process">  

                <div class="row section-intro">
                    <div class="col-twelve with-bottom-line">

                        <h5>Process</h5>
                        <h1>How it works?</h1>

                        <p class="lead"> </p>

                    </div>   		
                </div>

                <div class="row process-content">

                    <div class="left-side">

                        <div class="item" data-item="1">

                            <h5>Crawler</h5>

                            <p>Use any video crawler to gather set of attributes which will be required to classify a video.</p>

                        </div>

                        <div class="item" data-item="2">

                            <h5>Form</h5>

                            <p>Enter the required set of attributes obtained after crawling a video for its classification.</p>

                        </div>

                    </div> <!-- /left-side -->

                    <div class="right-side">

                        <div class="item" data-item="3">

                            <h5>Submit</h5>

                            <p>Click submit button for analysis to begin and result will be displayed accordingly.</p>

                        </div>

                        <div class="item" data-item="4">

                            <h5>Feedback</h5>

                            <p>Fill the form with correct details and help us improve.</p>

                        </div>

                    </div> <!-- /right-side -->  

                    <div class="image-part"></div>  			

                </div> <!-- /process-content --> 

            </section> <!-- /process-->    

            <!-- pricing (SPAM DETECTION FORM)
    ================================================== -->

            <section id="pricing">

                <div class="row section-intro">
                    <div class="col-twelve with-bottom-line">

                        <h5>FORM</h5>
                        <h1>Try Us</h1>

                        <p class="lead"> </p>

                    </div>   		
                </div>

                <div class="row pricing-content">  

                    <div class="bgrid">


                        <div class="top-part"> 
                            
                            <form name="spam detection form" action="response.jsp" method="POST">
                                <h5>Enter video id :</h5> <input type="text" name="vid" required="" value="" size="60" />
                                <h5>Enter title :</h5> <input type="text" name="title" required="" value="" size="60" />
                                <h5>Enter username :</h5> <input type="text" name="user" required="" value="" size="60" />
                                <h5>Enter category :</h5> <input type="text" name="category" required="" value="" size="60" />
                                <h5>Enter day :</h5> <select name="day" required>
                                    <option value="">None</option>
                                    <option>01</option>
                                    <option>02</option>
                                    <option>03</option>
                                    <option>04</option>
                                    <option>05</option>
                                    <option>06</option>
                                    <option>07</option>
                                    <option>08</option>
                                    <option>09</option>
                                    <option>10</option>
                                    <option>11</option>
                                    <option>12</option>
                                    <option>13</option>
                                    <option>14</option>
                                    <option>15</option>
                                    <option>16</option>
                                    <option>17</option>
                                    <option>18</option>
                                    <option>19</option>
                                    <option>20</option>
                                    <option>21</option>
                                    <option>22</option>
                                    <option>23</option>
                                    <option>24</option>
                                    <option>25</option>
                                    <option>26</option>
                                    <option>27</option>
                                    <option>28</option>
                                    <option>29</option>
                                    <option>30</option>
                                    <option>31</option>
                                </select>
                                <h5>Enter month :</h5> <select name="month" required="">
                                    <option value="">None</option>
                                    <option>01</option>
                                    <option>02</option>
                                    <option>03</option>
                                    <option>04</option>
                                    <option>05</option>
                                    <option>06</option>
                                    <option>07</option>
                                    <option>08</option>
                                    <option>09</option>
                                    <option>10</option>
                                    <option>11</option>
                                    <option>12</option>
                                </select>
                                <h5>Enter year :</h5> <select name="year" required >
                                    <option value="">None</option>
                                    <option>2000</option>
                                    <option>2001</option>
                                    <option>2002</option>
                                    <option>2003</option>
                                    <option>2004</option>
                                    <option>2005</option>
                                    <option>2006</option>
                                    <option>2007</option>
                                    <option>2008</option>
                                    <option>2009</option>
                                    <option>2010</option>
                                    <option>2011</option>
                                    <option>2012</option>
                                    <option>2013</option>
                                    <option>2014</option>
                                    <option>2015</option>
                                    <option>2016</option>
                                </select>
                                <h5>Enter length :</h5> <input type="number" min="1" name="length" required="" value="" size="60" />
                                <h5>Enter view :</h5> <input type="number" min="0" name="view" required="" value="" size="60" />
                                <h5>Enter average rating :</h5> <input type="number" min="0" name="avgrating" required="" value="" size="60" />
                                <h5>Enter no. of rating :</h5> <input type="number" min="0" name="noofrating" required="" value="" size="60" />
                                <h5>Enter comment :</h5> <input type="number" min="0" name="comment" required="" value="" size="60" />
                                <input type="submit" value="SUBMIT" name="SUBMIT" />
                            </form>               

                               
                            <div>
                            </div>
                        </div> <!-- /pricing-content --> 

                        </section> <!-- /pricing --> 

                        <!-- Testimonials Section
                           ================================================== -->
                        <section id="testimonials">

                            <div class="row section-intro">
                                <div class="col-twelve with-bottom-line">

                                    <h5>Contacts</h5>
                                    <h1>CONTACT US.</h1>

                                    <p class="lead"> </p>

                                </div>   		
                            </div>


                            <div class="row flex-container">

                                <div id="testimonial-slider" class="flexslider">

                                    <ul class="slides">

                                        <li>
                                            <div class="testimonial-author">
                                                <img src="images/avatars/shishir.jpg" alt="Author image">
                                                <div class="author-info">
                                                    Shishir Kurhade
                                                    <span class="position">BE Student, Smt Kashibai Navale College of Engineering.</span>
                                                </div>
                                            </div>

                                            <p>
                                                Email id : shi777shir@gmail.com                  </p>                  
                                        </li> <!-- /slide -->

                                        <li> 

                                            <div class="testimonial-author">
                                                <img src="images/avatars/sj.jpg" alt="Author image">
                                                <div class="author-info">
                                                    Shreeya Jaiswal
                                                    <span>BE Student, Smt Kashibai Navale College of Engineering.</span>
                                                </div>
                                            </div> 

                                            <p>
                                                Email id : jaiswalshreeya1@gmail.com
                                            </p>

                                        </li> <!-- /slide -->

                                        <li>
                                            <div class="testimonial-author">
                                                <img src="images/avatars/rio.jpg" alt="Author image">
                                                <div class="author-info">
                                                    Sushmit Gaikwad
                                                    <span class="position">BE Student, Smt Kashibai Navale College of Engineering.</span>
                                                </div>
                                            </div>

                                            <p>
                                                Email id : sgsushmit7@gmail.com
                                            </p>                  
                                        </li> <!-- /slide -->

                                        <li>
                                            <div class="testimonial-author">
                                                <img src="images/avatars/murtuza.jpg" alt="Author image">
                                                <div class="author-info">
                                                    Murtaza Khambaty
                                                    <span class="position">BE Student, Smt Kashibai Navale College of Engineering.</span>
                                                </div>
                                            </div>

                                            <p>
                                                Email id : murtazakhambaty202@gmail.com
                                            </p>                  
                                        </li> <!-- /slide -->

                                    </ul> <!-- /slides -->

                                </div> <!-- /testimonial-slider -->         

                            </div> <!-- /flex-container -->

                        </section> <!-- /testimonials -->



                        <!-- faq
                        ================================================== -->
                        <section id="faq">

                            <div class="row section-intro">
                                <div class="col-twelve with-bottom-line">

                                    <h5>Faq</h5>
                                    <h1>Questions and Answers.</h1>

                                    <p class="lead"> </p>

                                </div>   		
                            </div>

                            <div class="row faq-content">

                                <div class="q-and-a block-1-2 block-tab-full group">

                                    <div class="bgrid">

                                        <h3>The video I entered was wrongly classified as spam/non-spam. Why is that?</h3>

                                        <p>Our system works on the basis of probability and on reference of a training dataset. Thus while the accuracy yielded is pretty high, incorrect results are still possible. Although, you could provide a feedback to help improve our system.</p>

                                    </div>

                                    <div class="bgrid">

                                        <h3>I'm not able to acquire the attributes of a video to enter on a crawler. What should I do?</h3>

                                        <p>As of now, we have not included a crawler functionality in our system. Hence we suggest that you use an external crawler to get the video attributes and feed them as input to our system..</p>

                                    </div>
                                    
                                    

                                    <div class="bgrid">

                                        <h3>What types of external crawlers can I use?</h3>

                                        <p>We would suggest you to use YouTube APIs to collect the data. However there are many third party crawlers available such as<a href="http://peopleanlytics.org/socrates"> Socrates</a> and<a href="www.tubekit.org"> TubeKit</a> which would get you the required data.</p>

                                    </div>

                                </div> <!-- /q-and-a --> 

                            </div> <!-- /faq-content --> 



                        </section> <!-- /faq --> 


                        <!-- footer
                        ================================================== -->
                        <footer>
                            <div class="footer-bottom">

                                <div class="row">

                                    <div class="col-twelve">
                                        <div class="copyright">
                                            <span>YouAssist , SKNCOE BE PROJECT 2016.</span>		         	
                                        </div>

                                        <div id="go-top" style="display: block;">
                                            <a class="smoothscroll" title="Back to Top" href="#top"><i class="icon ion-android-arrow-up"></i></a>
                                        </div>         
                                    </div>

                                </div> <!-- /footer-bottom -->     	

                            </div>

                        </footer>  

                        <div id="preloader"> 
                            <div id="loader"></div>
                        </div> 

                        <!-- Java Script
                        ================================================== --> 
                        <script src="js/jquery-1.11.3.min.js"></script>
                        <script src="js/jquery-migrate-1.2.1.min.js"></script>
                        <script src="js/plugins.js"></script>
                        <script src="js/main.js"></script>

                        </body>

                        </html>
