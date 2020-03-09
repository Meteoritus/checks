<#import "parts/common.ftl" as c>

<@c.page>
    <#if (check.id)??>
        <#assign url = "/check/edit" var = url />
    <#else>
        <#assign url = "/check/add" var = url/>
    </#if>
<form action="${var}" method="POST" xmlns="http://www.w3.org/1999/html">
    <#if (check.id)??>
        <input type="hidden" name="id" value="${check.id}">
    </#if>
    <p>
        <label for="check.plant.plantName">Завод</label>
                <select class="form-check-input" name="plant.codePlant">
                    <#list plants as p>
                        <option value="#{p.codePlant}">${p.plantName}</option>
                    </#list>
                </select> </br>
        <label for="checkDate">Дата проверки</label>
        <input type="date" name="checkDate" id="checkDate"></br>
        <label for="executor">Проверяющий</label>
            <select class="form-check-input" name="executor.tabNumber">
                <#list executors as e>
                    <option value="#{e.tabNumber}">${e.fio}</option>
                </#list>
            </select> </br>
        <label for="objectsOfControl">Объект контроля</label>
            <select class="form-check-input" name="objectsOfControl.id">
                <#list objectsOfControl as o>
                    <option value="#{o.id}">${o.objectOfControl}</option>
                </#list>
            </select> </br>
        <label for="detailsObjectOfControl">Детали объекта контроля</label>
            <select class="form-check-input" name="detailsObjectOfControl.id">
                <#list details as d>
                    <option value="#{d.id}">${d.detailObjectOfControl}</option>
                </#list>
            </select> </br>
        <label for="commentCheck">Замечание</label>
        <input type="text" name="commentCheck" id="commentCheck"></br>
        <label for="repeatedViolation">Вид нарушения</label>
        <input type="checkbox" name="repeatedViolation" id="repeatedViolation"></br>
        <label for="inspector">Исполнитель</label>
            <select class="form-check-input" name="inspector.tabNumber">
                <#list inspectors as i>
                    <option value="#{i.tabNumber}">${i.fio}</option>
                </#list>
            </select> </br>
        <label for="events">Мероприятия</label>
        <input type="text" name="events" id="events"></br>
        <label for="photoBefore">Фото до</label>
        <input type="text" name="photoBefore" id="photoBefore"></br>
        <label for="photoAfter">Фото после</label>
        <input type="text" name="photoAfter" id="photoAfter"></br>
        <label for="termOfElimination">Срок устранения</label>
        <input type="date" name="termOfElimination" id="termOfElimination"></br>
    <#if (check.id)??>
        <input type="submit" value="Редактировать замечание">
    <#else>
        <input type="submit" value="Добавить новое замечание">
    </#if>
    </p>
</form>
</@c.page>
