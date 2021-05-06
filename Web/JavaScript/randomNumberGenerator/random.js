console.log("Hello World")

// let variable = 23
// console.log(variable)
// console.log(typeof variable)

// srtVariable = "this is string"
// console.log(srtVariable)
// console.log(typeof srtVariable)

// console.log(typeof abc)// variable not declared

// let bol = true;
// console.log(bol)

// console.log((String(bol)))


function randomNumberGenerator() {
    let numb = Math.floor(Math.random()*100);
    document.getElementById("num").innerHTML = numb;
    console.log(numb);
}
