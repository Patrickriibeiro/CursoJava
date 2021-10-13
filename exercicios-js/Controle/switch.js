const imprimirResultado = function (nota){
    switch(Math.floor(nota)){
        case 10:
            case 9:
                console.log('Quadro de honra')
                break
                case 8: case 7 :
                    console.log('aprovado')
                break
                case 6 : case 5 :
                console.log('reprovado')
                break
                case 3 : case 2 : case 1 :
                    console.log('reprovado')
                    break
                    default: // pode em qualquer posição só colocar o break .
                        console.log('nota inválida')
    }
}