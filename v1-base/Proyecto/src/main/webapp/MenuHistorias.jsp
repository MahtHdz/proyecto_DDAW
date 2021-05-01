<%@page import="Pojos.HistoriaDeUsuario"%>
<%@page import="MetodosBD.ObtenerHistorias"%>
<%@page import="Pojos.TarjetaCRC"%>
<%@page import="MetodosBD.ObtenerUsuario"%>
<%@page import="MetodosBD.ObtenerTarjetas"%>
<%@page import="Pojos.Proyecto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://kit.fontawesome.com/373aa5902a.js" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
    <title>Historias de Usuario</title>
</head>

<body class="bg-secondary">
    <br>
    <%
        out.println("<h1 class='text-center my-4'>");
        out.println("Historias de Usuario - Proyecto "+Proyecto.idProyectoActual+"");
        out.println("</h1>"); 
        
        out.println("<div id='create_b' class='d-flex justify-content-end container my-2'>");
        out.println("<button type='button' class='btn btn-primary' onclick='create_b()'><i class='fas fa-plus'>&nbsp;&nbsp;</i>Nueva Historia</button>");
        out.println("</div>");
        ObtenerHistorias obtenerHistorias = new ObtenerHistorias(ObtenerUsuario.usuarioLogeado.getEmail(), Proyecto.idProyectoActual);
        
        out.println("<div class='d-flex mx-4'>");
        for(HistoriaDeUsuario historia: obtenerHistorias.getListaHistorias()){
                out.println("<div class='card mx-1' style='width: 18rem;'>");
                    out.println("<img src='assets/images/stories.jfif' class='card-img-top' alt='..'>");
                    out.println("<div class='card-body'>");
                        out.println("<h5 class='card-title'>Historia #"+historia.getID()+"</h5>");
                        out.println("<p class='card-text'>Nombre: "+historia.getNombre()+" <p>");
                        out.println("<button type='button' class='btn btn-warning' onclick='editStory(\""+historia.getID()+"\")'><i class='fas fa-edit'></i>&nbsp;&nbsp;</i>Editar</button>");
                    out.println("</div>");
                out.println("</div>");            
        }   
        out.println("</div>");   

    %>

    <script src="assets/js/script_usr_stories.js"></script>

</body>

</html>