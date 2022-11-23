<%@page import="java.util.List"%>
<%@page import="com.webappdemo.model.Pelicula"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    List<Pelicula> pelis;
    pelis = (List<Pelicula>)(request.getAttribute("pelis"));
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de películas</h1>
        <% for (Pelicula peli : pelis) { %>
            <div>
                <h1><%=peli.getTitulo()%></h1><!-- comment -->
                <div>
                    <img src="<%=peli.getPoster()%>" width="200px">
                </div>
            </div>
        <% } %>
    </body>
</html>
