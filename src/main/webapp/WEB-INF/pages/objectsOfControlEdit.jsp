<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:if test="${empty objectsOfControl.objectOfControl}">
        <title>Добавить</title>
    </c:if>
    <c:if test="${!empty objectsOfControl.objectOfControl}">
        <title>Редактировать</title>
    </c:if>
</head>
<body>
<a href="/">На главную</a>
<c:if test="${empty objectsOfControl.objectOfControl}">
    <c:url value="/objectsofcontrol/add" var="var"/>
</c:if>
<c:if test="${!empty objectsOfControl.objectOfControl}">
    <c:url value="/objectsofcontrol/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty objectsOfControl.objectOfControl}">
        <input type="hidden" name="id" value="${objectsOfControl.id}">
    </c:if>
    <label for="objectOfControl">Детали объекта контроля</label>
    <input type="text" name="objectOfControl" id="objectOfControl">
    <c:if test="${empty objectsOfControl.objectOfControl}">
        <input type="submit" value="Добавить новый объект контроля">
    </c:if>
    <c:if test="${!empty objectsOfControl.objectOfControl}">
        <input type="submit" value="Редактировать объект контроля">
    </c:if>
</form>
</body>
</html>
