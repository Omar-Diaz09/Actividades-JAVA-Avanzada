<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.ejemplo.modelo.Triangulo"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado del Cálculo</title>
    </head>
    <body>
        <h1>Resultados del Triángulo</h1>
        <%
            // Obtener los parámetros del formulario
            double base = Double.parseDouble(request.getParameter("base"));
            double altura = Double.parseDouble(request.getParameter("altura"));

            // Crear una instancia de la clase Triangulo
            Triangulo miTriangulo = new Triangulo(base, altura);

            // Obtener el área y el perímetro
            double area = miTriangulo.calcularArea();
            double perimetro = miTriangulo.calcularPerimetro();
        %>
        <p>La base del triángulo es: **<%= base %>**</p>
        <p>La altura del triángulo es: **<%= altura %>**</p>
        <p>El área del triángulo es: **<%= area %>**</p>
        <p>El perímetro del triángulo es: **<%= perimetro %>**</p>
        <br>
        <a href="index.jsp">Volver al formulario</a>
    </body>
</html>
