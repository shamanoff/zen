<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 19/08/2016
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>How are you today?</title>
    <link rel="stylesheet" href="./css/app.css">
    <link rel="stylesheet" href="./css/reset.css">
  </head>
  <body>
  <div id="wrapper">
    <h1 id="title" name>How are you today?</h1>
    <div id="pic">

    </div>
    <form method="post" action="ServletOne">
      <ul id="input">
        <li><input type="text" name="name" id="name" onkeypress="return onlyAlphabets(event,this);" placeholder="Write your name and click a button"></li>
        <li><button id="submit" value="GO!" onclick="myF()" >Generate!</button>
        </li>
      </ul>
    </form>

  </div>

  <div class="hiddenPics">
    <ul class="imageList">

    </ul>

  </div>

  <script src="jquery/dist/jquery.js"></script>
<%--
  <script src="js/app.js"></script>
--%>
  </body>
</html>
