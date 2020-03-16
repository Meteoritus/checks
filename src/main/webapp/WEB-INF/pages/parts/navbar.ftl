<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Замечания</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Справочник
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="/employees">Сотрудники</a>
                    <a class="dropdown-item" href="/plants">Заводы</a>
                    <a class="dropdown-item" href="/objectsofcontrol">Объекты контроля</a>
                    <a class="dropdown-item" href="/details">Детали объектов контроля</a>
                </div>
            </li>
        </ul>
    </div>
<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<h5>Добро пожаловать, <@security.authorize access="isAuthenticated()">
    <@security.authentication property="principal.username"/>
</@security.authorize></h5>
</nav>