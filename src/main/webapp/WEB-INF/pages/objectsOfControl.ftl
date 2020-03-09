<#import "parts/common.ftl" as c>

<@c.page>
<table class="table table-sm table-hover">
    <thead class="thead-dark">
        <tr>
            <th>Объект контроля</th>
            <th></th>
        </tr>
    </thead>
        <#list objectsOfControlList as objectOfControl>
            <tr>
                <td>${objectOfControl.objectOfControl}</td>
                <td>
                    <a href="/objectsofcontrol/edit/#{objectOfControl.id}">редактировать</a>
                    <a href="/objectsofcontrol/delete/#{objectOfControl.id}">удалить</a>
                </td>
            </tr>
        </#list>
</table>
<a href="/objectsofcontrol/add" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Добавить новый объект контроля</a>
</@c.page>
