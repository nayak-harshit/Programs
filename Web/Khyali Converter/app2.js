console.log('hello');
let textArea = document.getElementById("text");
let textContent ="";
function convert(value){
    textContent+= value;
    console.log(textContent);
    textArea.innerHTML = textContent;
    // console.log(value);
    // console.log(textArea.textContent)
}
 let clear = document.getElementById("clear");
//  console.log(clear);
clear.addEventListener('click', function () {
    // console.log('clear');
    textArea.innerHTML = '';
    textContent= '';
});

function space() {
    // console.log('{sapce}');
    textContent+= ' ';
    textArea.innerHTML = textContent;

}

function backspace(){
    // console.log('backspace');
    let modTextContent = textContent.slice(0,-1);
    textContent = modTextContent;
    textArea.innerHTML = textContent;
    console.log(textContent);

        
}
