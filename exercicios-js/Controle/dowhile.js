function getInteiroAletarioentra(min , max){
    const valor = math.random() * (max - min) + min
    return math.floor(valor)
}

let opcao = -1

    do {
        opcao = getInteiroAletarioentra(-1 , 10)
        console.log(`opção escolhida foi ${opcao}.`)
    }while(opcao != -1)

    console.log('até a proxima!')