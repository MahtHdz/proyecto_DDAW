<%@page import="MetodosBD.ObtenerUsuario"%>
<%@page import="MetodosBD.ObtenerTarjetas"%>
<%@page import="Pojos.TarjetaCRC"%>
<%@page import="Pojos.Proyecto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/libs/bootstrap.min.css">
    <script src="https://kit.fontawesome.com/373aa5902a.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
    <title>Tarjetas CRC</title>
</head>

<body class="bg-secondary">
    <br>
    <%
        out.println("<h1 class='text-center my-4'>");
        out.println("Tarjetas CRC - Proyecto "+Proyecto.idProyectoActual+"");
        out.println("</h1>"); 
        
        out.println("<div id='create_b' class='d-flex justify-content-end container my-2'>");
        out.println("<button type='button' class='btn btn-primary' onclick='create_b()'><i class='fas fa-plus'>&nbsp;&nbsp;</i>Nueva tarjeta</button>");
        out.println("</div>");
        ObtenerTarjetas obtenerTarjetas = new ObtenerTarjetas(ObtenerUsuario.usuarioLogeado.getEmail(), Proyecto.idProyectoActual);
        
        for(TarjetaCRC tarjeta: obtenerTarjetas.getListaTarjetas()){
        out.println("<div class='d-inline-flex'>");
            out.println("<div class='card m-3' style='width: 18rem;'>");
                out.println("<img src='assets/images/cards.png' class='card-img-top' alt='..'>");
                out.println("<div class='card-body'>");
                    out.println("<h5 class='card-title'>Tarjeta #"+tarjeta.getID()+"</h5>");
                    out.println("<p class='card-text'>Clase: "+tarjeta.getClase()+" <p>");
                    out.println("<button type='button' class='btn btn-warning' onclick='editCard(\""+tarjeta.getID()+"\")'><i class='fas fa-edit'></i>&nbsp;&nbsp;</i>Editar</button>");
                out.println("</div>");
            out.println("</div>"); 
        out.println("</div>");
        }   
    %>
    
        <script src="assets/js/script_crc_cards.js"></script>

</body>

</html>