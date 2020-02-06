
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Детали объекта контроля</title>
</head>
<body>
<a href="/">На главную</a>
<table class="table table-striped">
    <tr>
        <th>Детали объекта контроля</th>
    </tr>
    <c:forEach var="details" items="${detailList}">
        <tr>
            <td>${details.detailObjectOfControl}</td>
            <td>
                <a href="/details/edit/${details.id}">редактировать</a>
                <a href="/details/delete/${details.id}">удалить</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/details/add">Добавить новую деталь объекта контроля</a>
</body>
</html>
