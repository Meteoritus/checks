<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:if test="${empty plant.codePlant}">
        <title>Добавить</title>
    </c:if>
    <c:if test="${!empty plant.codePlant}">
        <title>Редактировать</title>
    </c:if>
</head>
<body>
<a href="/">На главную</a>
<c:if test="${empty plant.codePlant}">
    <c:url value="/plants/add" var="var"/>
</c:if>
<c:if test="${!empty plant.codePlant}">
    <c:url value="/plants/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty plant.codePlant}">
        <input type="hidden" name="id" value="${plant.codePlant}">
    </c:if>
    <label for="codePlant">Код завода</label>
    <input type="text" name="codePlant" id="codePlant">
    <label for="plantName">Название</label>
    <input type="text" name="plantName" id="plantName">
    <c:if test="${empty plant.codePlant}">
        <input type="submit" value="Добавить новый завод">
    </c:if>
    <c:if test="${!empty plant.codePlant}">
        <input type="submit" value="Редактировать завод">
    </c:if>
</form>
</body>
</html>
