<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Замечания</title>
</head>
<body>
<a href="/">На главную</a>
<table class="table table-striped">
    <tr>
        <th>Завод</th>
        <th>Дата проверки</th>
        <th>Замечание</th>
        <th>Вид нарушения</th>
        <th>Мероприятия</th>
        <th>Фото "до"</th>
        <th>Фото "после"</th>
        <th>Срок устранения</th>
        <th>Проверяющий</th>
        <th>Исполнитель</th>
        <th>Объект контроля</th>
        <th>Детали объекта контроля</th>
    </tr>
    <tr>
    <c:forEach var="plant" items="${plantList}">
            <td>${plant.plantName}</td>
    </c:forEach>
    <c:forEach var="check" items="${checkList}">
            <td>${check.checkDate}</td>
            <td>${check.commentCheck}</td>
            <td>${check.repeatedViolation}</td>
            <td>${check.events}</td>
            <td>${check.photoBefore}</td>
            <td>${check.photoAfter}</td>
            <td>${check.termOfElimination}</td>
    </c:forEach>
    <c:forEach var="inspector" items="${inspectorList}">
            <td>${inspector.fio}</td>
    </c:forEach>
    <c:forEach var="executor" items="${executorList}">
            <td>${executor.fio}</td>
    </c:forEach>
    <c:forEach var="objectOfControl" items="${objectOfControlList}">
            <td>${objectOfControl.objectOfControl}</td>
    </c:forEach>
    <c:forEach var="detail" items="${detailList}">
            <td>${detail.detailObjectOfControl}</td>
    </c:forEach>
    </tr>
</table>
<a href="/details">Детали объекта контроля</a>
<p/><a href="/employees">Сотрудники</a>
<p/><a href="/objectsofcontrol">Объекты контроля</a>
<p/><a href="/plants">Заводы</a>
</body>
</html>
