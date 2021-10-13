// estrategio 1 para gerar valor padrão

function soma1(a,b,c){
    a = b || 1
    b = b || 1
    c = c || 1
    return a + b + c
}

console.log(soma1(), soma1(3))