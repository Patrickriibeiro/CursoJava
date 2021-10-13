const funcs = []

for (var i = 0; i < 10; i++) {
    funcs.push(function () {
        console.log(i)
    })
}

funcs[2]()
funcs[8]()

// var não tem scopo de função motivo do index ser 10 fo funcs 2 e 8 .