// // DESAFIO 1
// //2
// let titulo = document.querySelector("h1");
// titulo.innerHTML = "Hora do desafio";

// //3
// function verificarClickConsole() {
//     console.log ("O botão foi clicado");
// }

// //4
// function verificarClickAlert() {
//     alert ("Eu amo JS");
// }

// //5
// let cidade;
// function verificarClickPrompt() {
//     cidade = prompt ("Diga o nome de uma cidade do Brasil");
//     alert ("Estive em " + cidade + " e lembrei de você");
// }

// //6
// function verificarClickSoma() {
//     let numero1 = prompt ("Escolha um número");
//     let numero2 = prompt ("Escolha outro");
//     let soma = Number(numero1) + Number(numero2);
//     alert ("O resultado da soma é " + soma);
// }

// //DESAFIO 2
// //1
// function exibir() {
//     console.log("Olá, mundo!")
// }
// exibir()

// //2
// function exibirNome(nome) {
//     console.log(`Olá ${nome}!`);
// }
// exibirNome("Moisés");

// //3
// function dobrarNumero(numero) {
//     return numero * 2;
// }

// let resultado = dobrarNumero(45);
// alert (resultado);

// //4
// function calcularMedia(numero1,numero2,numero3) {
//     return (numero1 + numero2 + numero3) / 3;
// }

// let resultado = calcularMedia(6,8,13);
// alert (resultado);

// //5
// function mostrarMaiorNumero(numero1,numero2) {
//     if (numero1 >= numero2) {
//         return numero1
//     } else {
//         return numero2
//     }
    
// }

// let resultado = mostrarMaiorNumero(8,10);
// alert (resultado);

// //6
// function calcularMultiplicação(numero) {
//     return numero * numero;
// }

// let resultado = calcularMultiplicação(9);
// alert (resultado);

// //DESAFIO 3
// //1
// function calcularIMC(peso,altura) {
//     return peso / (altura * altura);
// }

// let resultado = calcularIMC(72,1.75);
// alert (resultado);

// //2
// function calcularFatorial(numero) {
//     let contador = numero;
//     let fatorial = 1;

// do{
//     fatorial *= contador;
//     contador--;
//   }while (contador > 0);
//   return fatorial
// }

// let resultado = calcularFatorial(3);
// alert (resultado);

// //3
// function dolarParaReal(dolar) {
//     let real = dolar * 4.80;
//     return real
// }

// let resultado = dolarParaReal(2);
// alert (resultado);

// //4
// function calculoSalaRetangular(altura,largura) {
//     let area = altura * largura;
//     let perimetro = 2 * (altura + largura);
//     return `área: ${area}m² , perímetro: ${perimetro}m`;
// }

// let resultado = calculoSalaRetangular(10,20);
// alert (resultado);

// //5
// function calculoSalaRedonda(raio) {
//     let area = 3.14 * (raio * raio);
//     let perimetro = 2 * 3.14 * raio;
//     return `área: ${area}m², perímetro: ${perimetro}m`;
// }

// let resultado = calculoSalaRedonda(50);
// alert (resultado);

//6
// function calculoTabuada(numero) {
//     let tabuada = [numero * 1, numero * 2, numero * 3, numero * 4, numero * 5, numero * 6, numero * 7,
//     numero * 8, numero * 9, numero * 10];
//     return tabuada;
// }
// let resultado = calculoTabuada(5);
// alert (resultado);

// //DESAFIO 4
// //1
// let listaGenerica = [];

// //2 - 3
// let linguagensDeProgramacao = ["JavaScript", "C", "C++", "Kotlin", "Python"];
// linguagensDeProgramacao.push("java");
// linguagensDeProgramacao.push("Ruby");
// linguagensDeProgramacao.push("GoLang");

// //4 - 5 - 6
// let listaDeNomes = ["Moisés", "Daniel", "Joel"];
// console.log (listaDeNomes[0]);
// console.log (listaDeNomes[1]);
// console.log (listaDeNomes[2]);