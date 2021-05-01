function create_b() {
  window.location.assign("NuevaTarjetaCRC.jsp");
}

function editCard(idCard) {
   window.location = "http://localhost:8080/Proyecto/EditarTarjetaCRC.jsp?idCard="+idCard+"";
}
