function rand ([mind = 0 , max = 1000]){
    if(min > max) [mind,max] = [max , min]
    const valor = math.random() * (max - min) + min
    return Math.floor(valor) // floor função para redondar o valor  para baixo . 
}

console.log(rand([50,40]))
console.log(rand ([992]))
console.log(rand([,10]))
console.log(rand([]))
console.log(rand())
