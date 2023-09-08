<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login</title>
</head>
<body>
<h1>Inicion de sesion</h1>
<br>
<form action="/Webapp/login" method="post">
    <div>
        <label for="username">Nombre de Usuario</label>
        <div>
            <input type="text" name="username" id="username">
        </div>
    </div>
    <br>
    <div>
        <label for="password">Contraseña</label>
        <div>
            <input type="password" name="password" id="password">
        </div>
    </div>
    <div>
        <input type="submit" value="Iniciar">
    </div>
    <br>
    <h4><a href="/Webapp/index.html"> -- Volver --</a></h4>


</form>
</body>
</html>