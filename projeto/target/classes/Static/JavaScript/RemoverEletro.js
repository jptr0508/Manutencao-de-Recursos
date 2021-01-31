var utilizador_id=1;

window.onload = async function() {
    try {
        let utilizadores = await $.ajax({
            url: "/api/eletrodomesticos/",
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
        eletrodomesticos = await $.ajax({
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

async function RemElet() {
    try {
        let eletrodomestico = {
            eletro_id : parseInt(document.getElementById("eletrodomestico").value)
        }
        let result = await $.ajax({
            url: "/api/eletrodomesticos/" + utilizador_id + "/" + eletrodomestico.eletro_id,
            method: "DELETE",
            
           
        });

       
        // Change to eletrodomesticos page
        sessionStorage.setItem("eletro_id",result.id);
        window.location = "MostrarEletro.html";
    } catch(err) {
        console.log(err);
        // mensagem para o utilizador
    }
}