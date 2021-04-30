<%@page import="Pojos.Proyecto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--<link rel="stylesheet" href="assets/css/style_crc_cards.css">-->
    <!--<link rel="stylesheet" href="assets/css/libs/bootstrap.min.css">-->
    <!--<script src="assets/js/libs/prefixfree.min.js"></script>-->
    <script src="https://kit.fontawesome.com/373aa5902a.js" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
    <title>Tarjetas CRC</title>
</head>

<body class="bg-secondary">
    <br>
    <%
        out.println("<h1 class='text-center my-4'>");
        out.println("Tarjetas CRC - Proyecto "+Proyecto.idProyectoActual+"");
        out.println("</h1>"); 
        out.println("<div id='carouselExampleCaptions' class='carousel slide' data-bs-ride='carousel'>");
//            out.println("<div class='carousel-indicators'>");
//                out.println("<button type='button' data-bs-target='#carouselExampleCaptions' data-bs-slide-to='0' class='active' aria-current='true' aria-label='Slide 1'></button>");
//            out.println("</div>");
            out.println("<div class='carousel-inner'>");
        
        for(Tarjeta tarjeta: obtenerTarjetas.obtenerListaTarjetasPorProyecto()){
                out.println("<div class='carousel-item active d-flex justify-content-center'>");
                    out.println("<img src='assets/images/cards.png' class='d-block w-20' alt='...'>");
                    out.println("<div class='mt-4 carousel-caption d-none d-md-block'>");
                        out.println("<div class='bg-secondary'>");
                            out.println("<h5 class='text-dark'>"+tarjeta.getId+"</h5>");
                            out.println("<p class='text-dark'>"+tarjeta.getDescription()+"</p>");
                        out.println("</div>");
                            out.println("<button type='button' class='btn btn-warning' onclick='editCard(\""+tarjeta.getIDCard()+"\")'><i class='fas fa-edit'></i>&nbsp;&nbsp;</i>Editar</button>");
                    out.println("</div>");
                out.println("</div>");
        }      
            out.println("</div>");      
            out.println("<button class='carousel-control-prev' type='button' data-bs-target='#carouselExampleCaptions' data-bs-slide='prev'>");
                out.println("<span class='carousel-control-prev-icon' aria-hidden='true'></span>");
                out.println("<span class='visually-hidden'>Previous</span>");
            out.println("</button>");
            out.println("<button class='carousel-control-next' type='button' data-bs-target='#carouselExampleCaptions' data-bs-slide='next'>");
                out.println("<span class='carousel-control-next-icon' aria-hidden='true'></span>");
                out.println("<span class='visually-hidden'>Next</span>");
            out.println("</button>");
        out.println("</div>");
    %>
    <br>
    <!-- partial:index.partial.html -->
<!--    <div id="carousel">
        <figure id="spinner">
        </figure>
    </div>-->
    <div id="create_b" class="d-flex justify-content-end container">
        <button type="button" class="btn btn-primary" onclick="create_b()"><i class="fas fa-plus">&nbsp;&nbsp;</i>Nueva tarjeta</button>
    </div>
<!--    <span id="left-arrow" style=float:left class=ss-icon onclick="galleryspin('')">&lt;</span>
    <span id="right-arrow" style=float:right class=ss-icon onclick="galleryspin('-')">&gt;</span>-->
<!--    <p>Controls: cursor left and right or click on arrows to rotate, <b>Z</b> or click to toggle zoom on foreground
        image,
        <b>C</b> or hover to show/hide caption.-->
        <!-- partial -->
        <!--<script src='assets/js/libs/jquery-index.min.js'></script>-->
        <script src="assets/js/script_crc_cards.js"></script>

</body>

</html>