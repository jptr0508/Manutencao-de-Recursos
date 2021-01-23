var utilizador_id=1;

window.onload = async function() {
    try {
        let utilizadores = await $.ajax({
            url: "/api/eletrodomesticos/", method: "get",
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
}


async function AddElet() {
    try {
        let eletrodomestico = {
            eletro_nome: document.getElementById("eletro_nome").value,
            eletro_potencia: document.getElementById("eletro_potencia").value,
            utilizador: { id: utilizador_id}
        }
        alert(JSON.stringify(eletrodomestico));
        let result = await $.ajax({
            url: "/api/eletrodomesticos/",
            method: "post",
            dataType: "json",
            data:JSON.stringify(eletrodomestico),
            contentType: "application/json"
        });
        alert(JSON.stringify(result));
        // Change to eletrodomesticos page
        sessionStorage.setItem("eletro_id",result.id);
        window.location = "MostrarEletro.html";
    } catch(err) {
        console.log(err);
        // mensagem para o utilizador
    }
}