<#import "parts/common.ftl" as c>

<@c.page>
<table class="table table-sm table-hover">
    <thead class="thead-dark">
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
            <th></th>
        </tr>
    </thead>
        <#list checkList as check>
        <tr>
                <td>${check.plant.plantName}</td>
                <td>${check.checkDate}</td>
                <td>${check.commentCheck}</td>
                <td>${check.repeatedViolation?string('Повторно', '')}</td>
                <td>${(check.events)!"Отсутствует"}</td>
                <td>${(check.photoBefore)!"Отсутствует"}</td>
                <td>${(check.photoAfter)!"Отсутствует"}</td>
                <td>${check.termOfElimination}</td>
                <td>${check.inspector.fio}</td>
                <td>${check.executor.fio}</td>
                <td>${(check.objectOfControl.objectOfControl)!"Отсутствует"}</td>
                <td>${(check.detailsObjectOfControl.detailObjectOfControl)!"Отсутствует"}</td>
                <td>
                    <a href="/check/edit/#{check.id}">Редактировать</a>
                    <a href="/check/delete/#{check.id}">Удалить</a>
                </td>
        </tr>
        </#list>
</table>
<a href="/check/add" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Добавить новое замечание</a>
</@c.page>