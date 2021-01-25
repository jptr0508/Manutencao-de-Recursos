var utilizador_id=1;
window.onload = async function() {

    let res = await $.ajax({
    url: "/api/consumos/" + utilizador_id, 
    method: "get", 
    dataType: "json"
    });

    let html = "";
    for(let cons of res) {
        html+= "<p>"+"id:" +cons.consumo_utilizador_id+" - Id eletro:"+cons.consumo_eletro_id+" - " + elet.eletro_potencia + "W"+"</p>";
    }
    document.getElementById("eletrodomesticos").innerHTML = html;
}