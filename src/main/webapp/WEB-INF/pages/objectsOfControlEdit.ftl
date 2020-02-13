<#import "parts/common.ftl" as c>

<@c.page>
    <#if (objectsOfControl.objectOfControl)??>
        <#assign url = "/objectsofcontrol/edit" var = url />
    <#else>
        <#assign url = "/objectsofcontrol/add" var = url/>
    </#if>
<form action="${var}" method="POST">
    <#if (objectsOfControl.objectOfControl)??>
        <input type="hidden" name="id" value="${objectsOfControl.objectOfControl}">
    </#if>
    <label for="objectOfControl">Объект контроля</label>
    <input type="text" name="objectOfControl" id="objectOfControl">
    <#if (objectsOfControl.objectOfControl)??>
        <input type="submit" value="Редактировать объект контроля">
    <#else>
        <input type="submit" value="Добавить новый объект контроля">
    </#if>
</form>
</@c.page>
