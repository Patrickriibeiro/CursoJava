function compras(trabalho1,trabalho2){
const comprarSorvete = trabalho1 || trabalho2
const comprarTv50 = trabalho1 && trabalho2
//const comprarTv32 = !!(trabalho1 ^ trabalho2 ) // bitwise xor , bit por bit .
const comprarTv32 = trabalho1 != trabalho2
const manterSaudavel = !comprarSorvete //operador unário

return { comprarSorvete , comprarTv50,comprarTv32,manterSaudavel}

}

console.log(comprars(true,true))
console.log(comprar(true,false))
console.log(compras(false,true))
console.log(compras(false,false))