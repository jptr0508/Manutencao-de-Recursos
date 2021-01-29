var utilizador_id=1;
window.onload = async function() {

    let res = await $.ajax({
    url: "/api/custos/" + utilizador_id, 
    method: "get", 
    dataType: "json"
    });

    let html = "";
    for(let con of res) {
        html+= "<p>"+"Mês: "+con.conta_mes+" - Custo: " +con.conta_custo+ " €"+"</p>";
    }
    document.getElementById("custos").innerHTML = html;
}