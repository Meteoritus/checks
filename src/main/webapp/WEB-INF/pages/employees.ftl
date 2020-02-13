<#import "parts/common.ftl" as c>

<@c.page>
<table class="table table-sm table-hover">
    <thead class="thead-dark">
        <tr>
            <th>Таб. номер</th>
            <th>ФИО</th>
            <th>Отдел</th>
            <th>Роль</th>
        </tr>
    </thead>
        <#list employeeList as employee>
            <tr>
                <td>#{employee.tabNumber}</td>
                <td>${employee.fio}</td>
                <td>${employee.department}</td>
                <td>${employee.employeeRole}</td>
                <td>
                    <a href="/employees/edit/#{employee.tabNumber}">Редактировать</a>
                    <a href="/employees/delete/#{employee.tabNumber}">Удалить</a>
                </td>
            </tr>
        </#list>
</table>
<a href="/employees/add" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Добавить нового сотрудника</a>
</@c.page>