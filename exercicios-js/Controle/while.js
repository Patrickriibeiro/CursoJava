function getInteiroAletarioentra(min , max){
    const valor = math.random() * (max - min) + min
    return math.floor(valor)
}

let opcao = 0

    while(opcao != -1){
        opcao = getInteiroAletarioentra(-1 , 10)
        console.log(`opção escolhida foi ${opcao}.`)
    }

    console.log('até a proxima!')