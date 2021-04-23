<%-- 
    Document   : arithmethiccalculator
    Created on : Apr 23, 2021, 5:04:22 PM
    Author     : rizz4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmethic" method="post">
        First: <input type="text" name="value_1"><br>
        Second: <input type="text" name="value_2"><br>
        <input type="submit" name="operation" value="+">
        <input type="submit" name="operation" value="-">
        <input type="submit" name="operation" value="*">
        <input type="submit" name="operation" value="%">
        </form>
        <br><br>
        
        
        ${message}<br>
        <a href="age">Age Calculator</a>
    </body>
</html>
