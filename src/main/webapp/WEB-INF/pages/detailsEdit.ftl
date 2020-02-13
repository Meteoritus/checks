<#import "parts/common.ftl" as c>

<@c.page>
<#if (details.detailObjectOfControl)??>
    <#assign url = "/details/edit" var = url />
<#else>
    <#assign url = "/details/add" var = url/>
</#if>
<form action="${var}" method="POST">
    <#if (details.detailObjectOfControl)??>
        <input type="hidden" name="id" value="${details.id}">
    </#if>
    <label for="detailObjectOfControl">Детали объекта контроля</label>
    <input type="text" name="detailObjectOfControl" id="detailObjectOfControl">
    <#if (details.detailObjectOfControl)??>
        <input type="submit" value="Edit Detail">
    <#else>
        <input type="submit" value="Add new Detail">
    </#if>
</form>
</@c.page>
