var numero = 1

{
    let numero = 2
    console.log('dentro =' , numero) // let tem o próprio scope , diferente do var , ele não vai para o scope global .
}

console.log ('fora = ', numero)