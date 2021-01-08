<%-- 
    Document   : Error
    Created on : Jun 14, 2020, 9:11:05 AM
    Author     : AhihiDoNgoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Error Page!</h1>
        <p><%=request.getAttribute("thongbao")%></p>
    </body>
</html>
