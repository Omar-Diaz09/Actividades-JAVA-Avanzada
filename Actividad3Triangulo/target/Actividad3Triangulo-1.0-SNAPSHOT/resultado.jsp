<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mipaquete.Triangulo"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultado del Cálculo</title>
</head>
<body>
    <%
        // 6. Obtener los datos del request (enviados por el servlet)
        Triangulo triangulo = (Triangulo) request.getAttribute("triangulo");
        String nombreUsuario = (String) request.getAttribute("nombreUsuario");

        if (triangulo != null) {
    %>
            <h1>Resultados para <%= (nombreUsuario != null ? nombreUsuario : "usuario") %>:</h1>
            <p>Base: <%= triangulo.getBase() %></p>
            <p>Altura: <%= triangulo.getAltura() %></p>
            <p>Área: <%= triangulo.getArea() %></p>
            <p>Perímetro: <%= triangulo.getPerimetro() %></p>
    <%
        } else {
    %>
            <h1>Error al procesar el cálculo.</h1>
    <%
        }
    %>
    <br>
    <a href="index.jsp">Volver al inicio</a>
</body>
</html>