<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Сотрудники</title>
</head>
<body>
<a href="/">На главную</a>
<table class="table table-striped">
    <tr>
        <th>Таб. номер</th>
        <th>ФИО</th>
        <th>Отдел</th>
        <th>Роль</th>
    </tr>
    <c:forEach var="employee" items="${employeeList}">
        <tr>
            <td>${employee.tabNumber}</td>
            <td>${employee.fio}</td>
            <td>${employee.department}</td>
            <td>${employee.employeeRole}</td>
            <td>
                <a href="/employees/edit/${employee.tabNumber}">редактировать</a>
                <a href="/employees/delete/${employee.tabNumber}">удалить</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/employees/add">Добавить нового сотрудника</a>
</body>
</html>
