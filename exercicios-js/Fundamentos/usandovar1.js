{
    {
        {
            {
                {
                    var a = 'será'  // evitar variaveis globais .
                }
            }
        }
    }
}
console.log(a)

function teste(){
    var local = 123 //varivel dentro so scopo de função , só era visivel dentro da função .
    console.log(local)
}

teste()
console.log(local)