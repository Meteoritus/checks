<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:if test="${empty employee.tabNumber}">
        <title>Добавить</title>
    </c:if>
    <c:if test="${!empty employee.tabNumber}">
        <title>Редактировать</title>
    </c:if>
</head>
<body>
<a href="/">На главную</a>
<c:if test="${empty employee.tabNumber}">
    <c:url value="/employees/add" var="var"/>
</c:if>
<c:if test="${!empty employee.tabNumber}">
    <c:url value="/employees/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty employee.tabNumber}">
        <input type="hidden" name="id" value="${employee.tabNumber}">
    </c:if>
    <label for="tabNumber">Табельный номер</label>
    <input type="text" name="tabNumber" id="tabNumber">
    <label for="fio">ФИО</label>
    <input type="text" name="fio" id="fio">
    <label for="department">Отдел</label>
    <input type="text" name="department" id="department">
    <label for="employeeRole">Роль</label>
    <input type="text" name="employeeRole" id="employeeRole">
    <c:if test="${empty employee.tabNumber}">
        <input type="submit" value="Добавить нового сотрудника">
    </c:if>
    <c:if test="${!empty employee.tabNumber}">
        <input type="submit" value="Редактировать УЗ сотрудника">
    </c:if>
</form>
</body>
</html>
