var counter = 1;
const DEFAULT_COL = 2;

function genCRCTable(){
    const DEFAULT_ROWS = 5;

    const table = document.getElementById("table-inputs");
    
    for (let i = 0; i < DEFAULT_ROWS; i++) {
        var columns = document.createElement("tr");
        for (let j = 0; j < DEFAULT_COL; j++) {
            var half_row = document.createElement("th");
            var input = document.createElement("input");
            input.setAttribute("type", "text");
            input.setAttribute("name", "row-" + counter + "-" + (j + 1) + "-" + DEFAULT_COL);
            input.setAttribute("id", "row-" + counter + "-" + (j + 1) + "-" + DEFAULT_COL);
            half_row.appendChild(input);
            columns.appendChild(half_row);
        }
        table.appendChild(columns);
        counter += 1;
    }
}

function addRow(){
    const tableElements = document.getElementsByTagName("tr");
    if (tableElements.length - 1 < 8) {
        const table = document.getElementById("table-inputs");
        var columns = document.createElement("tr");   
        for (let i = 0; i < DEFAULT_COL; i++) {
            var half_row = document.createElement("th");
            var input = document.createElement("input");
            input.setAttribute("type", "text");
            input.setAttribute("name", "row-" + counter + "-" + (i + 1) + "-" + DEFAULT_COL);
            input.setAttribute("id", "row-" + counter + "-" + (i + 1) + "-" + DEFAULT_COL);
            half_row.appendChild(input);
            columns.appendChild(half_row);
        }
        table.appendChild(columns);
        counter += 1;
    }else
        alert("Límite de filas alcanzado!");

    return false;
}

function main(){
    genCRCTable();
}

main();