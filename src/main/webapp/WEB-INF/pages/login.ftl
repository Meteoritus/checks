<html>
<body onload="document.loginForm.username.focus();">
<h3>Форма авторизации</h3>
    <#if (errorMessage)??>
        ${errorMessage}
    <#else>
        <h4>Пожалуйста, введите логин и пароль</h4>
    </#if>
<form name="login" action="/login" method="POST">
    <table>
        <tr>
            <td>Имя пользователя: </td>
            <td><input type="text" name="username" value=""></td>
        </tr>
        <tr>
            <td>Пароль: </td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit" value="submit"></td>
        </tr>
    </table>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
</form>
</body>
</html>