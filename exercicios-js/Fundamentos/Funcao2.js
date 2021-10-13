//Armazenando uma funcao em uma variavel
const imprimirSoma = function(a,b){
console.log(a + b)
}

ImprimirSoma(2 + 3 )

// Armazenando Uma função em uma arrow

const soma = (a , b) => {
 
    return a + b
}
console.log(soma(2 , 3))

// retorno Implicito 

const subtração = (a , b) => a - b
console.log (2 , 3)

const imprimir2 = a => console.log(a)
imprimirSoma('Legal !!!')