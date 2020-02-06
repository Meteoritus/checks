<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:if test="${empty details.detailObjectOfControl}">
        <title>Добавить</title>
    </c:if>
    <c:if test="${!empty details.detailObjectOfControl}">
        <title>Редактировать</title>
    </c:if>
</head>
<body>
<a href="/">На главную</a>
<c:if test="${empty details.detailObjectOfControl}">
    <c:url value="/details/add" var="var"/>
</c:if>
<c:if test="${!empty details.detailObjectOfControl}">
    <c:url value="/details/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty details.detailObjectOfControl}">
        <input type="hidden" name="id" value="${details.id}">
    </c:if>
    <label for="detailObjectOfControl">Детали объекта контроля</label>
    <input type="text" name="detailObjectOfControl" id="detailObjectOfControl">
    <c:if test="${empty details.detailObjectOfControl}">
        <input type="submit" value="Add new Detail">
    </c:if>
    <c:if test="${!empty details.detailObjectOfControl}">
        <input type="submit" value="Edit Detail">
    </c:if>
</form>
</body>
</html>
