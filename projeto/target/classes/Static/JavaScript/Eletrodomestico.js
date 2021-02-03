var utilizador_id=1;
window.onload = async function() {

    //try{
    let res = await $.ajax({
    url: "/api/eletrodomesticos/" + utilizador_id, method: "get", dataType: "json"
    });
    let html = "";
    for(let elet of res) {
        html+= "<p>"+"id: "+elet.eletro_id+" - Nome: "+elet.eletro_nome+" - " + elet.eletro_potencia + "W"+"</p>";
    }
    document.getElementById("eletrodomesticos").innerHTML = html;
}//catch(err){console.log(err)}

   