// Pega os elementos dos slots no HTML
const r1 = document.getElementById("r1");
const r2 = document.getElementById("r2");
const r3 = document.getElementById("r3");

// Pega o botão de girar
const botaoGirar = document.getElementById("girar");

// Função que executa quando o jogador clica em "Girar"
const girar = async () => {

    // Faz uma requisição para a API Java no endpoint /spin
    const response = await fetch("http://localhost:8080/spin");

    // Converte a resposta para JSON
    const data = await response.json();

    // Pega os símbolos retornados pela API
    const slots = data.slots;

    // Coloca os símbolos nos slots da tela
    r1.innerText = slots[0];
    r2.innerText = slots[1];
    r3.innerText = slots[2];

    // Pega o elemento onde aparece o resultado
    const resultado = document.getElementById("resultado");

    // Verifica se o jogador ganhou
    if(data.win){
        resultado.innerText = "🎉 Você ganhou!";
    } else {
        resultado.innerText = "Tente novamente!";
    }

};

// Adiciona o evento de clique no botão
botaoGirar.addEventListener("click", girar);