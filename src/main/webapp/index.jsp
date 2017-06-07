<%--
  Created by IntelliJ IDEA.
  User: Fer
  Date: 6/6/17
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! String nameClass = "Pinnacles"; %>
<%! String role = ""; %>
<html>

<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Index" />
</jsp:include>

<body class="container">

<%-- This is a comment --%>

<% role = ${param.role} %>

<c:choose>
    <c:when test="${role == "admin"}">
        <h3>You are an Admin</h3>
    </c:when>
    <c:when test="${role == "user"}">
        <h3>You are an User</h3>
    </c:when>
    <c:when test="${role == "manager"}">
        <h3>You are a Manager</h3>
    </c:when>
    <c:when test="${role == null}">
        <h3>You are a Guest</h3>
    </c:when>
</c:choose>

<div class="row">
    <div class="col-lg-6">
        It's nice to see you again!!! <%= nameClass %>
    </div>
    <div class="col-lg-6">
        Second text
    </div>
</div>

</body>
</html>
