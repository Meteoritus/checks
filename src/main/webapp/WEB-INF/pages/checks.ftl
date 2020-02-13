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
        </tr>
    </thead>
        <#list 0..checkList?size-1 as i>
        <tr>
                <td>${plantList[i].plantName}</td>
                <td>${checkList[i].checkDate}</td>
                <td>${checkList[i].commentCheck}</td>
                <td>${checkList[i].repeatedViolation?string('Повторно', '')}</td>
                <td>${(checkList[i].events)!"Отсутствует"}</td>
                <td>${(checkList[i].photoBefore)!"Отсутствует"}</td>
                <td>${(checkList[i].photoAfter)!"Отсутствует"}</td>
                <td>${checkList[i].termOfElimination}</td>
                <td>${inspectorList[i].fio}</td>
                <td>${executorList[i].fio}</td>
                <td>${(objectOfControlList[i].objectOfControl)!"Отсутствует"}</td>
                <td>${(detailList[i].detailObjectOfControl)!"Отсутствует"}</td>
        </tr>
        </#list>
</table>
</@c.page>