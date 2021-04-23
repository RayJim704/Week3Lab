<%-- 
    Document   : agecalculator
    Created on : Apr 23, 2021, 5:00:41 PM
    Author     : rizz4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="post" action="age">
            Enter your age: <input type="text" name="answer"><br>
        <input type="submit" name="Submit" value="Age next birthday">
        </form>
        <br>
        ${message}
        <br>
        <a href="arithmethic">Arithmetic Calculator</a>
    </body>
</html>
