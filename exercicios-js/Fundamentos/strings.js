const escola = "Cod3r"

console.log(escola.charAt(4)) // CharAt essa função seleciona o indice da string .  
console.log(escola.charAt(5))
console.log(escola.charCodeAt(3))
console.log(escola.indexOf("3")) // INDEXOF retorna o resultado do indice(posição) associado a string .

console.log(escola.substring(1))
console.log(escola.substring(0,3)) // seleciona os indices dentro da string .

console.log('escola'.concat(escola).concat("!")) //Concatenação .
console.log('escola' + escola + ("!"))

console.log('ana , maria , pedro'.split(',')) // criou um array apartir da função split .