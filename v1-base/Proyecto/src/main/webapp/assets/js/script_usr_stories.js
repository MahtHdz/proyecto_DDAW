function create_b() {
    window.location.assign("NuevaHistoriaUsuario.jsp");
}

function editStory(idStory) {
    window.location = "http://localhost:8080/Proyecto/EditarHistoria.jsp?idStory="+idStory+"";
}
