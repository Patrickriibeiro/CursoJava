// novo recurso do ES2015

const pessoa = {
    nome : 'Ana',
    idade: 5,
    endereco: {
        logradouro : 'Rua ABC',
        numero : 1000 
    }
}

const{ nome , idade } = pessoa
console.log(nome , idade)

const{ nome : n , idade : i} = pessoa
console.log(n, 1)

const {sobrenome , bemHumorada = true } = pessoa
console.log(sobrenome,bemHumorada)

//Destructing remove e acessar as informações de um constante .