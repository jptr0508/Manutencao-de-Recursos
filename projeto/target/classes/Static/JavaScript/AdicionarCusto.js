var utilizador_id=1;

window.onload = async function() {
    try {
        let utilizadores = await $.ajax({
            url: "/api/custos/" + utilizador_id, 
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

}


async function AddCusto() {
    try {
        let conta = {
            contaMes: (document.getElementById("contaMes").value),
            utilizador: { id: utilizador_id}
        }

        alert(JSON.stringify(conta));
        let result = await $.ajax({
            url: "/api/custos/" + utilizador_id,
            method: "post",
            dataType: "json",
            data:JSON.stringify(conta),
            contentType: "application/json"
        });

        alert(JSON.stringify(result));
        // Change to consumos page
        sessionStorage.setItem("conta_id",result.id);
        window.location = "MostrarConta.html";
    } 
    catch(err) {
        console.log(err);
        // mensagem para o utilizador
    }
}