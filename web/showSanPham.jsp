<%-- 
    Document   : showSanPham
    Created on : Jun 14, 2020, 9:19:23 AM
    Author     : AhihiDoNgoc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="model.SanPhamModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>View Product!</h1>

        <table border="1">
            <tr>
                <th>Tên sản phẩm</th>
                <th>Giá</th>
                <th>Số lượng</th>
                <th>Hình</th>
                <th>Mã danh mục</th>
            </tr>

            <% ArrayList sp_list = new SanPhamModel().getList();%>

            <c:forEach var="sp" items="<%= sp_list%>">
                <tr>
                    <td>${sp.getMaSP()}</td>
                    <td>${sp.getTenSP()}</td>
                    <td>${sp.getDonGia()}</td>
                    <td>${sp.getSoLuong()}</td>
                    <td><img src="Images/${sp.getHinh()}" width="200px" height="200px"></td>
                    <td>${sp.getMaDM()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
