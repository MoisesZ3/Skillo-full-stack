// alert('Boas vindas ao jogo do número secreto');
// let numeroSecreto = parseInt (Math.random() * 100 + 1);
// console.log(numeroSecreto);
// let chute;
// let tentativas = 1;
// // enquanto chute não for igual ao n.s.
// while (chute != numeroSecreto) {
//    chute = prompt('Escolha um número entre 1 e 100');
//    // se chute for igual ao número secreto
//    if (chute == numeroSecreto) { 
//         break;
//    } else {
//        if (chute > numeroSecreto) {
//            alert(`O número secreto é menor que ${chute}`);
//         } else {
//            alert(`0 número secreto é maior que ${chute}`);
//         }  
//         // tentativa = tentativas + 1 
//         tentativas++;  
//     }
// }

// let palavraTentativas = tentativas > 1 ? "tentativas" : "tentativa";
// alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto} em ${tentativas} ${palavraTentativas}`);

// if (tentativas > 1) {
//     alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto} em ${tentativas} tentativas`);
// } else {
//     alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto} em ${tentativas} tentativa`);
// }

// DESAFIO 1
// 1
// alert ("Boas vindas ao nosso site");

// 2
// let nome = "Lua";

// 3
// let idade = 25;

// 4
// let saldoDeVendas = 50;

// 5
// let saldoDisponivel = 1000;

// 6
// alert ("Erro! Preencha todos os campos");

// 7
// let mensagemDeErro = "Erro! Preencha todos os campos";

// 8
// let nome = prompt ("Qual o seu nome");
// console.log (nome)
// alert (`Ola ${nome}!`);

// 9-10
// let idade = prompt ("Qual sua idade");
// console.log (idade)
// if (idade >= 18) {
//      alert ("Pode tirar a habilitação!");
// } else {
//      alert ("Não pode tirar a habilitação!");
// }

// DESAFIO 2
// 1
let diaDaSemana = prompt ("Você pode me dizer que dia da semana é hoje");
let resultado = diaDaSemana == "sabado"|| diaDaSemana == "domingo" ? "Bom fim de semana" : "Boa semana";
alert (resultado);
// if (diaDaSemana == "sabado"|| diaDaSemana == "domingo") {
//     alert ("Bom fim de semana");
// } else {
//     alert ("Boa semana");
// }

// 2
// let numero = prompt ("Escolha qualquer número");
// let resultado = numero > -1 ? " é positivo" : " é negativo";
// alert ("O número " + numero + " é " + resultado);
// // if (numero > -1) {
// //     alert ("O número " + numero + " é positivo");
// // } else {
// //     alert ("O número " + numero + " é negativo");
// // }

// 3
// let pontuação = prompt ("Qual foi sua pontuação");
// let resultado = pontuação >= 100 ? "Parabéns, você venceu!" : "Tente novamente para ganhar.";
// alert (resultado);
// if (pontuação >= 100) {
//     alert ("Parabéns, você venceu!");
// } else {
//     alert ("Tente novamente para ganhar.");
// }

// 4
// let saldoUsuario = 51000
// let desejo = prompt ("O que você quer consultar");
// if (desejo = "saldo") {
//     alert ("seu saldo é " + saldoUsuario);
// }

// 5
// let nome = prompt ("Qual o seu nome");
// alert ("Ola seja bem vindo" + nome );

// DESAFIO 3
// 1
// alert("Clique no botão OK 10 vezes e receba uma surpresa!");
// let contador = 1
// console.log (contador)
// while (contador <= 10) {
//       alert("Você ja clicou " + contador + " vezes.")
//     if (contador == 10) {
//        alert ("Parabens você perdeu mais ou menos 10 segundos da sua vida.")
//     }
//     contador++
// }

// 2
// alert("Receita federal esta a 10km de você");
// let contador = 10
// while (contador >= 0) {
//        alert(contador + "km")
//     if (contador == 0) {
//       alert ("Você não pagou os impostos e tomaram sua casa.")
//     }
//     contador--
// }

// 3
// let contador = prompt ("escolha um número");
// while (contador > 0) {
//     console.log (contador);
//     contador--;
// }

// 4
// let numero = prompt ("escolha um número");
// let contador = 0;
// while (contador < numero) {
//     console.log (contador);
//     contador++;
// }

// DESAFIO 4
// 1
// console.log ("Boas vindas!");

// 2
// let nome = "Moisés";
// console.log ("Olá " + nome);

// 3
// let nome = "Moisés";
// alert ("Olá " + nome);

// 4
// let linguagem = prompt ("Qual a linguagem de programação que você mais gosta?");
// console.log (linguagem);

// 5
// let valor1 = 9999;
// let valor2 = 1;
// let resultado = valor1 + valor2;
// console.log("A soma de " + valor1 + " e " + valor2 + " é igual a " + resultado);

// 6
// let valor1 = 500000001;
// let valor2 = 500000000;
// let resultado = valor1 - valor2;
// console.log("A subtração de " + valor1 + " e " + valor2 + " é igual a " + resultado);

// 7
// let idade = prompt ("Qual é sua idade?");
// let resultado = idade >= 18 ? "Você é maior de idade." : "Você é menor de idade.";
// console.log (resultado);
// // if (idade >= 18) {
// //     console.log ("Você é maior de idade.");
// // } else {
// //     console.log ("Você é menor de idade.");
// // }

// 8
// let numero = prompt ("Escolha um número");
// if (numero == 0) {
//     alert ("Seu número é 0");
// } else {
//     if (numero > 0) {
//         alert ("Seu número é positivo");
//     } else {
//         alert ("Seu número é negativo");
//     }
// }

// 9
// let numero = 1;
// while (numero <= 10) {
//     console.log (numero);
//     numero++;
// }

// 10
// let nota = prompt ("Qual foi sua nota?");
// let resultado = nota >= 7 ? "Aprovado." : "Reprovado.";
// console.log (resultado);
// // if (nota >= 7) {
// //     console.log ("Aprovado.");
// // } else {
// //     console.log ("Reprovado.");
// // }

// 11
// let numero = Math.random();
// console.log (numero);

// 12
// let numero = parseInt (Math.random() * 10 + 1);
// console.log (numero);

// 13
// let numero = parseInt (Math.random() * 1000 + 1);
// console.log (numero);+