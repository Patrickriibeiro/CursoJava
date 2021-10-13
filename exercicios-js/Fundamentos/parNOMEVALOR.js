// par nome/valor
const saudacao = 'Opa' //contexto Léxico 1

function exec(){
const saudacao = 'falaaaa' // contexto léxico 2
return saudacao
}

//Objeto são grupos anianhados de pares nome/valor
const cliente = {
    nome : 'Pedro',
    idade: 32,
    peso: 90,
    endereco: {
        logradouro: 'Rua muito Legal',
        numero : 123
    }
}

console.log(saudacao)
console.log(exec())