<%-- 
    Document   : response
    Created on : Mar 10, 2016, 11:28:34 PM
    Author     : SHRIYA JAISWAL
--%>

<%@page import="spam_detection.Naive1"%>
<%@page import="spam_detection.records3"%>
<%@page import="spam_detection.CsvWriterAppendExample"%>
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
            <title>YBSD</title>
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



            <!-- pricing (SPAM DETECTION FORM)
    ================================================== -->

            <section id="pricing">

                <div class="row section-intro">
                    <div class="col-twelve with-bottom-line">

                        <h5>OUTPUT</h5>
                        <h1>RESULT OF CURRENT INPUT</h1>

                        <p class="lead"> </p>

                    </div>   		
                </div>
            <%
                    String vidy = request.getParameter("vid");
                    String titley = request.getParameter("title");
                    String usery = request.getParameter("user");
                    String categoryy = request.getParameter("category");
                    String dayy  = request.getParameter("day");
                    String monthy = request.getParameter("month");
                    String yeary = request.getParameter("year");
                    String lengthy = request.getParameter("length");
                    String viewy = request.getParameter("view");
                    String avgratingy = request.getParameter("avgrating");
                    String noofratingy = request.getParameter("noofrating");
                    String commenty = request.getParameter("comment");

                    int da = Integer.parseInt(dayy);
                    int mo = Integer.parseInt(monthy);
                    int yr = Integer.parseInt(yeary);
                    String date = Integer.toString(da) + "/" + Integer.toString(mo)+ "/" + Integer.toString(yr);
                    
                    Double le = Double.parseDouble(lengthy);
                    Double vi = Double.parseDouble(viewy);
                    Double av = Double.parseDouble(avgratingy);
                    Double no = Double.parseDouble(noofratingy);
                    Double co = Double.parseDouble(commenty);

                %>

                <jsp:useBean id="r" scope="session" class="spam_detection.records3" />
                <jsp:useBean id="p" scope="session" class="spam_detection.Naive1" />
                <jsp:useBean id="t" scope="session" class="spam_detection.CsvWriterAppendExample" />

                <%                   
                    r.csvreader();
                    p.accept(date, le, vi, av, no, co);
                    p.calc_age();
                    p.mean();
                    p.variance();
                    p.probability();
                    String a = p.getResult();
                    String hasspam = p.getHasspamy();
                    String agey = Double.toString(p.getX_age());
                    
                    t.csvwriter(vidy, titley, usery, categoryy, agey, lengthy, viewy, avgratingy, noofratingy, commenty, hasspam);
                    
                %>

                <div class="row pricing-content">  

                    <div class="bgrid">


                        <div class="top-part">

                            <h1> <%=a%></h1>
                        </div>
                    </div>
                </div>


                <div class="bgrid">

                    <div class="price-block primary">

                        <div class="top-part" >
                             <br>
                             <br>
                             <br>
                             <br>
                            <h1 class="plan-title"><font color="white">FEEDBACK FORM</font></h1>
                            <p> Please, take a moment and provide us your feedback </p>
                            <p> Was the prediction provided by us correct? </p>

                            <a class="button large" href="#features">YES</a>
                            <a class="button large" href="#features">NO</a>

                        </div>
                    </div>
                </div> 
            </div>
        </div> <!-- /pricing-content --> 

    </section> <!-- /pricing --> 


















    <section id="features">

        <div class="row section-intro">
            <div class="col-twelve with-bottom-line">

                <h5>Thank You for using our system !</h5>
                <h1>Our team is constantly working to provide you with better results</h1>

                <p class="lead"> </p>

                <a  href="http://localhost:8080/YouAssist/" title="">Back to Home</a>
            </div>   		
        </div>
    </section>


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


