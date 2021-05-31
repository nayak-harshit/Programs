console.log('this is app.js');
let btnConvert = document.getElementById("convertBtn");
let displayArea = document.getElementById("output");
let input = document.getElementById('input');
// console.log(displayArea);

// 
let txt = [];
let imgSrc = ` `;
btnConvert.addEventListener('click', function () {
    console.log('button is clicked');

    let html = ` `;
    let text = input.value;
    // console.log(text);
    let txt = Array.from(text);
    // console.log(txt);

    for (let index = 0; index < txt.length; index++) {
        let letter = txt[index];
        if (letter == ' ') {
            imgSrc = `khyali/space.jpg`
        }
        else if(letter == '?'){
            imgSrc = `khyali/qm.jpg`      
        }  else if(letter == '.'){
            imgSrc = `khyali/fs.jpg`      
        } else {
            imgSrc = `khyali/${letter}.jpg`
        }
        console.log(imgSrc);
        html += `
        <img class="my-2"src="${imgSrc}" width="50px" height="50px" alt="${letter}">
        `
    }

    displayArea.innerHTML = html;
});
