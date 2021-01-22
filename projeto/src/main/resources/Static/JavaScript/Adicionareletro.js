var utilizador_id=1;

window.onload = async function() {
    try {
        let res = await $.ajax({
            url: "/api/eletrodomesticos/" + utilizador_id, method: "get",
            dataType: "json"
        });
        let html="";
        for (let utilizador of res) {
            html+="<p>"+utilizador_id+"</p>";
        }
        document.getElementById("utilizador").innerHTML = html;
    } catch (err) {
        console.log(err);
        // mensagem de erro para o utilizador      
    }
}


async function AddEletro() {
    try {
        let eletrodomestico = {
            eletro_nome: document.getElementById("eletro_nome").value,
            eletro_potencia: document.getElementById("eletro_potencia").value,
            utilizador: { id: utilizador_id }
        }
        console.log(JSON.stringify(eletrodomestico));
        let result = await $.ajax({
            url: "/api/eletrodomesticos/"+utilizador_id,
            method: "post",
            dataType: "json",
            data:JSON.stringify(eletrodomestico),
            contentType: "application/json"
        });
        console.log(JSON.stringify(result));
        // Change to album page
        sessionStorage.setItem("eletro_id",result.id);
        window.location = "MostrarEletro.html";
    } catch(err) {
        console.log(err);
        // mensagem para o utilizador
    }
}