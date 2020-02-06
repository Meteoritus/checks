<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Объекты контроля</title>
</head>
<body>
<a href="/">На главную</a>
<table class="table table-striped">
    <tr>
        <th>Объект контроля</th>
    </tr>
    <c:forEach var="objectOfControl" items="${objectsOfControlList}">
        <tr>
            <td>${objectOfControl.objectOfControl}</td>
            <td>
                <a href="/objectsofcontrol/edit/${objectOfControl.id}">редактировать</a>
                <a href="/objectsofcontrol/delete/${objectOfControl.id}">удалить</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/objectsofcontrol/add">Добавить новый объект контроля</a>
</body>
</html>
