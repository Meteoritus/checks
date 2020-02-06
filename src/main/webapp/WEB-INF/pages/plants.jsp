<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Заводы</title>
</head>
<body>
<a href="/">На главную</a>
<table class="table table-striped">
    <tr>
        <th>Код завода</th>
        <th>Название</th>
    </tr>
    <c:forEach var="plant" items="${plantsList}">
        <tr>
            <td>${plant.codePlant}</td>
            <td>${plant.plantName}</td>
            <td>
                <a href="/plants/edit/${plant.codePlant}">редактировать</a>
                <a href="/plants/delete/${plant.codePlant}">удалить</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/plants/add">Добавить новый завод</a>
</body>
</html>
