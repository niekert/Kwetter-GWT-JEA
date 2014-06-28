<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<!-- The DOCTYPE declaration above will set the    -->
<!-- browser's rendering engine into               -->
<!-- "Standards Mode". Replacing this declaration  -->
<!-- with a "Quirks Mode" doctype may lead to some -->
<!-- differences in layout.                        -->
<!-- allthough a JSP, nothing really happens here  -->
<!-- on the server.                                -->
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <!--                                                               -->
    <!-- Consider inlining CSS to reduce the number of requested files -->
    <!--                                                               -->
    <link type="text/css" rel="stylesheet" href="Kwetter.css">

    <!--                                           -->
    <!-- Any title is fine                         -->
    <!--                                           -->
    <title>GWT-Kwetter</title>

    <!--                                           -->
    <!-- This script loads your compiled module.   -->
    <!-- If you add any GWT meta tags, they must   -->
    <!-- be added before this line.                -->
    <!--                                           -->
    <script type="text/javascript" language="javascript" src="Main/Main.nocache.js"></script>
    
    <!-- <script type="text/javascript" language="javascript" src="js/charts/highcharts.js"></script> -->
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/charts/highstock.js"></script>
    <script src="js/charts/themes/dark-blue.js"></script>
    
    
    
  </head>

  <!--                                           -->
  <!-- The body can have arbitrary html, or      -->
  <!-- you can leave the body empty if you want  -->
  <!-- to create a completely dynamic UI.        -->
  <!--                                           -->
  <body>
    <!-- OPTIONAL: include this if you want history support -->
    <iframe src="javascript:''" id="__gwt_historyFrame" tabIndex='-1' style="position:absolute;width:0;height:0;border:0"></iframe>

    <!-- RECOMMENDED if your web app will not function without JavaScript enabled -->
    <noscript>
      <div style="width: 22em; position: absolute; left: 50%; margin-left: -11em; color: red; background-color: white; border: 1px solid red; padding: 4px; font-family: sans-serif">
        Your web browser must have JavaScript enabled
        in order for this application to display correctly.
      </div>
    </noscript>
    <p align="right"><button id="logout">logout</button></p> 
    <!-- placeholder for Kwetter dashboard -->
    <div id="dashboard" style="width: 800px; height: 600px; position: absolute; left: 50%; right: 50%; margin: 200px 0 0 -400px;"/>
  </body>
</html>
