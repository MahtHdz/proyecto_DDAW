<%-- 
    Document   : EditarHistoria
    Created on : Apr 29, 2021, 7:55:03 PM
    Author     : maht_
--%>

<%@page import="Pojos.HistoriaDeUsuario"%>
<%@page import="MetodosBD.ObtenerHistoriaPorID"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  int idStory =  Integer.parseInt(request.getParameter("idStory"));
  HistoriaDeUsuario.idHistoriaActual = (idStory);
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' href='assets/css/style_new_user_story.css'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <title>Editar historia de usuario</title>
</head>
<body>
    <h1>Editar historia de usuario</h1>
    <div id="form">
        <%
        ObtenerHistoriaPorID obtenerHistoria = new ObtenerHistoriaPorID(idStory);
        out.println("<form action=''>");
        out.println("    <div id='story_name'>");
        out.println("        <label for='user_stories'>Historia de usuario: </label>");
        out.println("        <input type='text' name='user_stories' id='user_stories' value='"+ obtenerHistoria.getHistoria().getNombre() +"'><br><br>");
        out.println("    </div>");
        out.println("    <div id='fst_line'>");
        out.println("        <label for='story_number'>Numero: </label>");
        out.println("        <input type='number' name='story_number' id='story_number' value='"+ obtenerHistoria.getHistoria().getNumero() +"'>");
        out.println("        <label for='story_number'>(1-100)</label>");
        out.println("        <label id='value-label' for='value'>Valor (Prioridad): </label>");
        out.println("        <input type='number' name='value' id='value' value='"+ obtenerHistoria.getHistoria().getValor() +"'>");
        out.println("        <label id='value-label-2' for='value'>(1-100)</label><br><br>");
        out.println("    </div>");
        out.println("    <div id='second_line'>");
        out.println("        <label for='date'>Fecha: </label>");
        out.println("        <input type='date' name='date' id='date' value='"+ obtenerHistoria.getHistoria().getFecha() +"'>");
        out.println("        <label id='deadline-label' for='deadline'>Tiempo de desarrollo (costo): </label>");
        out.println("        <input type='number' name='deadline' id='deadline' value='"+ obtenerHistoria.getHistoria().getTiempo_d() +"'>");
        out.println("        <input type='radio' name='deadline-conf' id='deadline-days'>");
        out.println("        <label id='deadline-days-label' for='deadline-days'>Días</label>");
        out.println("        <input type='radio' name='deadline-conf' id='deadline-weeks'>");
        out.println("        <label id='deadline-weeks-label' for='deadline-weeks'>Semanas</label><br><br>");
        out.println("    </div>          ");
        out.println("    <label for='description'>Descripción: </label><br>");
        out.println("    <textarea name='description' id='description' cols='30' rows='10'>"+ obtenerHistoria.getHistoria().getDescripcion() +"</textarea><br>");
        out.println("    <label for='observations'>Observaciones: </label><br>");
        out.println("    <textarea name='observations' id='observations' cols='30' rows='10'>"+ obtenerHistoria.getHistoria().getObservaciones() +"</textarea><br><br>");
        out.println("    <div id='buttons'>");
        out.println("        <button type='reset'>Limpiar campos</button>");
        out.println("        <button type='submit'>Guardar</button>");
        out.println("        <button>Atras</button>");
        out.println("    </div>");
        out.println("</form>");
        %>
    </div>
</body>
</html>
