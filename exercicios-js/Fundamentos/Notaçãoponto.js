console.log(Math.ceil(6.1)) // Math.Ceil funçaõ para arredonadar o number .

const obj1 = {}
obj1.nome = 'bola' // <= notanção ponto melhor .
// obj['nome'] = 'bola2' <= não é recomendado .

console.log(obj1.nome)

function Obj(nome){
    this.nome = nome // criar um atributo publico .
}

const obj2 = new Obj('cadeira')
const obj3 = new Obj('Mesa')
console.log(obj2.nome)
console.log(obj3.nome)
obj3.exec()