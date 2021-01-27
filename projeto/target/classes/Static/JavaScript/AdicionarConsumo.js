var utilizador_id=1;

window.onload = async function() {
    try {
        let utilizadores = await $.ajax({
            url: "/api/consumos/" + utilizador_id, 
            method: "get",
            dataType: "json"
        });
        let html=utilizador_id;
        for (let utilizador of utilizadores) {
            html+="<p>"+utilizador.utilizador_id+"</p>";
        }
        document.getElementById("utilizador").innerHTML = html;
    } catch (err) {
        console.log(err);
        // mensagem de erro para o utilizador      
    }

    try {
        let eletrodomesticos = await $.ajax({
            url: "/api/eletrodomesticos/" + utilizador_id, 
            method: "get",
            dataType: "json"
        });
        let html="";
        for (let eletrodomestico of eletrodomesticos) {
            html+= "<option value="+eletrodomestico.eletro_id+">"+eletrodomestico.eletro_nome+
                "</option>";
        }
        document.getElementById("eletrodomestico").innerHTML = html;
    } catch (err) {
        console.log(err);
        // mensagem de erro para o utilizador      
    }
}


async function AddCons() {
    try {
        let consumo = {
            eletrodomestico: {eletro_id: parseInt(document.getElementById("eletrodomestico").value)},
            consumo_data: document.getElementById("consumo_data").value,
            consumo_tempo_on: document.getElementById("consumo_tempo_on").value,
            utilizador: { id: utilizador_id}
        }

        alert(JSON.stringify(consumo));
        let consumof = {
            consumo,
            consumo_energia: (eletrodomestico.eletro_potencia * consumo.consumo_tempo_on)/1000
        }

        alert(JSON.stringify(consumof));
        let result = await $.ajax({
            url: "/api/consumos/",
            method: "post",
            dataType: "json",
            data:JSON.stringify(consumof),
            contentType: "application/json"
        });

        alert(JSON.stringify(result));
        // Change to consumos page
        sessionStorage.setItem("eletro_id",result.id);
        window.location = "MostrarConsumo.html";
    } 
    catch(err) {
        console.log(err);
        // mensagem para o utilizador
    }
}