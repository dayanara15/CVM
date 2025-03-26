<%-- 
    Document   : panel
    Created on : 25/03/2025, 9:48:54 p. m.
    Author     : DAYANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(session.getAttribute("usuario")== null){
                response.sendRedirect("index.html");
                return;
            }
            %>
        <h1>Hello World!</h1>
    </body>
</html>
