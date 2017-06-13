<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="View all the ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
<div class="container">
    <div class="row">
        <h1>Review all the ads</h1>
    </div>
    <c:forEach var="ad" items="${ads}">
        <section class="col-xs-6">
            <h1>${ad.title}</h1>
            <p>${ad.description}</p>
        </section>
    </c:forEach>
</div>
</body>
</html>
