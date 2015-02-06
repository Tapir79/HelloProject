<%-- 
    Document   : form
    Created on : Jan 11, 2015, 2:27:02 PM
    Author     : Saara Pakarinen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>Form Page</title>
    </head>
    <body>
        <h1>Hello World! This is WEB-INF/jsp/form.jsp</h1>
         <h2>Input1 = “good”</h2>
         <h2>Input2 = “stuff” </h2>
         <h3>Try other inputs too. See what happens. </h3>
         <h4>Message: ${message}</h4>
       
            <form method="POST" action="http://localhost:8084/HelloProject/application/form">
              <label>Input1 to send: <input type="text" name="input1" /></label>
              <label>Input2 to send: <input type="text" name="input2" /></label>
              <input type="submit" />
            </form>
    </body>
</html>
