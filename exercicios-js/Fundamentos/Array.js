const valores = [7.7 , 8.9 , 6.3 , 9.2]
console.log(valores[0], valores [3])
console.log(valores[4])

valores[4] = 10 ; // atribuindo valor ao index ; 
console.log(valores)
console.log(valores.lenght) // função para acessar o valor do index ;

valores.push({id : 3}, false , null , 'teste') // função Push serve para adicionar valores no array .
console.log(valores)

console.log(valores.pop()) //  função (pop) retira o index do array ;
delete valores[0] // Função(delete) seleciona a posição do index para retirar do array .
console.log(valores)

console.log(typeof valores) // Typeof fala qual tipo de é a variavel .