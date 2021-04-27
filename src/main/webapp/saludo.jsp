<%-- 
    Document   : saludo
    Created on : 27-04-2021, 14:06:57
    Author     : roman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <h1>Hello EJB</h1>
            <form action="saludo" method="post">
                <input type="text" name="txt" placeholder="Tu Nombre" />
                <button>Saludar</button>
            </form>
            <p>
                ${msg}
            </p>
        </div>
    </body>
</html>
