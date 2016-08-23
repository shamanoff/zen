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
    <title>Ok, ${inputData} fine today!</title>
    <link rel="stylesheet" href="./css/app.css">
    <link rel="stylesheet" href="./css/reset.css">
  </head>
  <body>
  <div id="wrapper">
    <h1 id="title">Ok, ${name} is fine today!</h1>
    <div id="pic">
      <img src="${imgSrc}" alt="" id="picON" width="100%" height="auto">
    </div>
    <form method="post" action="ServletTwo">

      <ul id="input">
<%--
        <li><input type="text" name="name" id="name"  placeholder="Write your name and click a button"></li>
--%>
        <li><button id="submit" value="GO!" <%--onclick="myF()"--%> >Generate!</button>
        </li>
        <li>
          <br><br><div class="fb-share-button" data-href="http://default-environment.msvnafqzxr.us-west-2.elasticbeanstalk.com/" data-layout="button_count" data-size="small" data-mobile-iframe="true"><a class="fb-xfbml-parse-ignore" target="_blank" href="https://www.facebook.com/sharer/sharer.php?u=http%3A%2F%2Fdefault-environment.msvnafqzxr.us-west-2.elasticbeanstalk.com%2F&amp;src=sdkpreparse">Поделиться</a></div>


        </li>
      </ul>

    </form>

  </div>

  <div class="hiddenPics">

  </div>



  <script src="jquery/dist/jquery.js"></script>
  <script src="js/app.js"></script>
  <script>
    window.fbAsyncInit = function() {
      FB.init({
        appId      : 'your-app-id',
        xfbml      : true,
        version    : 'v2.7'
      });
    };

    (function(d, s, id){
      var js, fjs = d.getElementsByTagName(s)[0];
      if (d.getElementById(id)) {return;}
      js = d.createElement(s); js.id = id;
      js.src = "//connect.facebook.net/en_US/sdk.js";
      fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'facebook-jssdk'));
  </script>

  <div id="fb-root"></div>
  <script>(function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/ru_RU/sdk.js#xfbml=1&version=v2.7&appId=223601590992389";
    fjs.parentNode.insertBefore(js, fjs);
  }(document, 'script', 'facebook-jssdk'));</script>
  </body>
</html>
