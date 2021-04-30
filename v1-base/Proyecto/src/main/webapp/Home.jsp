<%@page import="MetodosBD.ObtenerUsuario"%>
<%@page import="Pojos.Proyecto"%>
<%@page import="MetodosBD.ObtenerProyectos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
String emailUsuario = (String)session.getAttribute("email");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
    <link rel='stylesheet' href='assets/css/libs/bootstrap-home.min.css'>
    <link rel="stylesheet" href="assets/css/style_home.css">
    <script src="assets/js/libs/prefixfree.min.js"></script>
    <script src="https://kit.fontawesome.com/373aa5902a.js" crossorigin="anonymous"></script>
</head>
<body>
    <div id="header">
        <%
        out.println("<a href='user.html'>"+ObtenerUsuario.usuarioLogeado.getEmail()+"&nbsp;<i class='fas fa-user mx-4'></i></a>");
        %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="" class="px-2">Logout</a>
    </div>
    <!-- partial:index.partial.html -->
    <div id="projects" class="container-fluid light-white-font">
        <h2 class="text-uppercase dark-gray-font">Proyectos</h2>
        <div class="container dark-gray-font">
            <div id="projects-container" class="row">
                <%
                    ObtenerProyectos obtenerProyectos = new ObtenerProyectos(emailUsuario);
                    for( Proyecto proyecto : obtenerProyectos.obtenerListaProyectos() ){
                            out.println("<div class='col-md-4'>");
                                out.println("<div class='panel panel-default fixed-width center-block' data-toggle='modal' data-target='#projectA'>");
                                    out.println("<div class='panel-body'>");
                                        out.println("<a href='http://localhost:8080/Proyecto/Project.jsp?idProyecto="+proyecto.getID()+"'>");
                                            out.println("<img class='img-responsive center-block' src='http://placeimg.com/600/480/tech/1' />");
                                        out.println("</a>");
                                    out.println("</div>");
                                    out.println("<div class='panel-footer'>");
                                        out.println("<a href='http://localhost:8080/Proyecto/Project.jsp?idProyecto="+proyecto.getID()+"'>");
                                            out.println("<h3>"+proyecto.getNombre()+"</h3>");
                                        out.println("</a>");
                                        out.println("<p>"+proyecto.getDescripcion()+"</p>");
                                    out.println("</div>");
                            //out.println("<button type='submit' name='idProyecto' class='btn btn-success' onclick='getIDUser(\""++"\")'>"+proyecto.getID()+"</button>");
                            out.println("<button type='submit' name='idProyecto' class='btn btn-success' onclick='getIDProject(\""+proyecto.getID()+"\")'>"+proyecto.getID()+"</button>");
                                out.println("</div>");
                            out.println("</div>");
                    }
                %>
            </div>
        </div>
    </div>
    <!-- partial -->
    <script src='assets/js/libs/jquery-home.min.js'></script>
    <script src='assets/js/libs/bootstrap-home.min.js'></script>
    <script src='assets/js/libs/touchSwipe.min.js'></script>
    <script src="assets/js/libs/script_home_default.js"></script>
</body>
</html>