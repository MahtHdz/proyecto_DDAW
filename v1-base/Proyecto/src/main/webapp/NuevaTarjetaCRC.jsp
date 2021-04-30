<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' href='assets/css/style_new_crc_card.css'>
    <title>Nueva tarjeta CRC</title>
</head>
<body>
    <h1>Nueva tarjeta CRC</h1>
    <div id="form">
        <form action="">
            <div id="inputs">  
                <label for="form-class-name">Clase: </label>
                <input type="text" name="class"  placeholder="Ejemplo" id="form-class-name"><br><br>
                <label for="super_classes_list">Lista de superclases: </label>
                <input type="text" name="super_classes" placeholder="Superclase 1, Superclase 2, Superclase 3, etc." id="super_classes_list"><br><br>
                <label for="sub_classes_list">Lista de subclases: </label>
                <input type="text" name="sub_classes" placeholder="Sublase 1, Sublase 2, Subclase 3, etc." id="sub_classes_list"><br><br><br>
            </div>
            <div id="table">
                <table id="table-inputs">
                    <tr>
                        <th>Responsabilidad</th>
                        <th>Colaboración</th>
                    </tr>
                </table>
                <div id="add-row">
                    <br><button onclick="return addRow()">Agregar fila</button><br><br>
                </div>
            </div>
            <div id="buttons">
                <button type="reset">Limpiar campos</button>
                <button type="submit">Guardar</button>
            </div>
        </form>
    </div>
    <script src="assets/js/script-crc-cards-funcs.js"></script>
</body>
</html>
