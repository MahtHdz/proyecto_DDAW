
<%@page import="MetodosBD.ObtenerTarjetaCRCPorId"%>
<%@page import="Pojos.TarjetaCRC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  int idCard =  Integer.parseInt(request.getParameter("idCard"));
  TarjetaCRC.idTarjetaActual = (idCard);
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' href='assets/css/style_new_crc_card.css'>
    <!--<link rel='stylesheet' href='assets/css/libs/bootstrap.min.css'>-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <title>Editar tarjeta CRC</title>
</head>
<body>
    <%
    out.println("<h1>Editar tarjeta CRC #"+idCard+"</h1>");  
    %>
    <div id="form" class="bg-dark">
        <%
        ObtenerTarjetaCRCPorId obtejerTarjeta = new ObtenerTarjetaCRCPorId(idCard);
        out.println("<form action=''>");
        out.println("            <div id='inputs'>  ");
        out.println("                <label for='form-class-name'>Clase: </label>");
        out.println("                <input type='text' name='class'  placeholder='Ejemplo' id='form-class-name' value='"+obtejerTarjeta.obtenerTarjeta().getClase()+"'><br><br>");
        out.println("                <label for='super_classes_list'>Lista de superclases: </label>");
        out.println("                <input type='text' name='super_classes' placeholder='Superclase 1, Superclase 2, Superclase 3, etc.' id='super_classes_list' value='"+obtejerTarjeta.obtenerTarjeta().getListaSuper()+"'><br><br>");
        out.println("                <label for='sub_classes_list'>Lista de subclases: </label>");
        out.println("                <input type='text' name='sub_classes' placeholder='Sublase 1, Sublase 2, Subclase 3, etc.' id='sub_classes_list' value='"+obtejerTarjeta.obtenerTarjeta().getListaSub()+"'><br><br><br>");
        out.println("            </div>");
        out.println("            <div id='table'>");
        out.println("             <table class='table table-light' id='table-inputs'>");
        out.println("                <thead>");
        out.println("                  <tr>");
        out.println("                    <th scope='col'>Responsabilidad</th>");
        out.println("                    <th scope='col'>Colaboración</th>");
        out.println("                  </tr>");
        out.println("                </thead>");
        out.println("                <tbody>");
        out.println("                  <tr>");
        out.println("                    <td><input type='text'></td>");
        out.println("                    <td><input type='text'></td>");
        out.println("                  </tr>");
        out.println("                </tbody>");
        out.println("              </table>");
        out.println("                <div id='add-row'>");
        out.println("                    <br><button onclick='return addRow()'>Agregar fila</button><br><br>");
        out.println("                </div>");
        out.println("            </div>");
        out.println("            <div id='buttons'>");
        out.println("                <button type='reset'>Limpiar campos</button>");
        out.println("                <button type='submit'>Guardar</button>");
        out.println("            </div>");
        out.println("        </form>");
        %>
    </div>
    <script src="assets/js/script-crc-cards-funcs.js"></script>
</body>
</html>
