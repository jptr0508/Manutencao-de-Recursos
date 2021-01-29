var utilizador_id=1;
window.onload = async function() {

    let res = await $.ajax({
    url: "/api/consumos/" + utilizador_id, 
    method: "get", 
    dataType: "json"
    });

    let html = "";
    for(let cons of res) {
        html+= "<p>"+"Semana: "+cons.consumo_data+" - Tempo Ligado: " +cons.consumo_tempo_on+ " H"+" - Energia Consumida: "+cons.energia+ " kW"+"</p>";
    }
    document.getElementById("consumos").innerHTML = html;
}