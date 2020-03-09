<#import "parts/common.ftl" as c>

<@c.page>
<table class="table table-sm table-hover">
    <thead class="thead-dark">
        <tr>
            <th>Код завода</th>
            <th>Название</th>
            <th></th>
        </tr>
    </thead>
    <#list plantsList as plant>
        <tr>
            <td>#{plant.codePlant}</td>
            <td>${plant.plantName}</td>
            <td>
                <a href="/plants/edit/#{plant.codePlant}">редактировать</a>
                <a href="/plants/delete/#{plant.codePlant}">удалить</a>
            </td>
        </tr>
    </#list>
</table>
<a href="/plants/add" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Добавить новый завод</a>
</@c.page>
