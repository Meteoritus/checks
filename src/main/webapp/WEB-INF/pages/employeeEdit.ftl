<#import "parts/common.ftl" as c>

<@c.page>
    <#if (employee.tabNumber)??>
        <#assign url = "/employees/edit" var = url />
    <#else>
        <#assign url = "/employees/add" var = url/>
    </#if>
<form action="${var}" method="POST">
    <#if (employee.tabNumber)??>
        <input type="hidden" name="id" value="${employee.tabNumber}">
    </#if>
    <label for="tabNumber">Табельный номер</label>
    <input type="text" name="tabNumber" id="tabNumber">
    <label for="fio">ФИО</label>
    <input type="text" name="fio" id="fio">
    <label for="department">Отдел</label>
    <input type="text" name="department" id="department">
    <label for="employeeRole">Проверяющий</label>
    <input type="checkbox" name="employeeRole" id="employeeRole">
    <#if (employee.tabNumber)??>
        <input type="submit" value="Редактировать УЗ сотрудника">
    <#else>
        <input type="submit" value="Добавить нового сотрудника">
    </#if>
</form>
</@c.page>
