<#import "parts/common.ftl" as c>

<@c.page>
<table class="table table-sm table-hover">
    <thead class="thead-dark">
        <tr>
            <th>Детали объекта контроля</th>
        </tr>
    </thead>
        <#list detailList as details>
        <tr>
            <td>${details.detailObjectOfControl}</td>
            <td>
                <a href="/details/edit/#{details.id}">Редактировать</a>
                <a href="/details/delete/#{details.id}">Удалить</a>
            </td>
        </tr>
        </#list>
</table>
<a href="/details/add" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Добавить новую деталь объекта контроля</a>
</@c.page>
