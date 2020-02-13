<#import "parts/common.ftl" as c>

<@c.page>
    <#if (plant.codePlant)??>
        <#assign url = "/plants/edit" var = url />
    <#else>
        <#assign url = "/plants/add" var = url/>
    </#if>
<form action="${var}" method="POST">
    <#if (plant.codePlant)??>
        <input type="hidden" name="id" value="${plant.codePlant}">
    </#if>
    <label for="codePlant">Код завода</label>
    <input type="text" name="codePlant" id="codePlant">
    <label for="plantName">Название</label>
    <input type="text" name="plantName" id="plantName">
    <#if (plant.codePlant)??>
        <input type="submit" value="Редактировать завод">
    <#else>
        <input type="submit" value="Добавить новый завод">
    </#if>
</form>
</@c.page>
