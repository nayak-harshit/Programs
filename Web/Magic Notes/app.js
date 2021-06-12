console.log('Hello this is app.js');
showNotes();
let addNote = document.getElementById('addBtn');
let addTxt = document.getElementById('addTxt');
let addTitle = document.getElementById('addTitle');
// console.log(addBtn)


addNote.addEventListener('click', function (e) {
    // console.log('this is event listener for the button')
    // let addTxt = document.getElementById("addTxt");
    let notes = localStorage.getItem("notes");
    if (notes == null) {
        notesObj = [];
    } else {
        notesObj = JSON.parse(notes);
    }
    //local storage of titles
    let titles = localStorage.getItem("titles");
    if (titles == null) {
        titleObj = [];
    } else {
        titleObj = JSON.parse(titles);
    }

    titleObj.push(addTitle.value);
    localStorage.setItem('titles', JSON.stringify(titleObj));

    notesObj.push(addTxt.value);
    localStorage.setItem("notes", JSON.stringify(notesObj));

    addTitle.value = "";
    addTxt.value = "";
    console.log(titleObj);
    // console.log(notesObj);
    showNotes();
});


function showNotes() {
    //local storage of titles
    let titles = localStorage.getItem("titles");
    if (titles == null) {
        titleObj = [];
    } else {
        titleObj = JSON.parse(titles);
    }

    // titleObj.forEach(function (element, index )){
    //     if (element == undefined) {
    //         titleObj[index] = ''
    //     }
    // }

    let notes = localStorage.getItem("notes");
    if (notes == null) {
        notesObj = [];
    } else {
        notesObj = JSON.parse(notes);
    }
    
    let html = "";
    notesObj.forEach(function (element, index) {
        html += `
        <div class="noteCard my-2 mx-2 card"style="width: 20rem; >
        <div class="card-body">
            <h5 class="card-title" id="title${index}">${titleObj[index]}</h5>
            <p class="card-text"> ${element}</p>
            <button id="${index}"onclick="deleteNote(this.id)" class="btn btn-primary my-1">Delete Note</button> <button value="${index}" onclick="editNote(this.value)" class="btn btn-primary my-1">Edit Note</button>
        </div>
        </div>
        `;
    });
    let notesElem = document.getElementById('notes');
    if (notesObj.length != 0) {
        notesElem.innerHTML = html;
    } else {
        notesElem.innerHTML = `Your Notes will appear here... `
    }
}


function deleteNote(index) {
    let notes = localStorage.getItem("notes");
    if (notes == null) {
        notesObj = [];
    } else {
        notesObj = JSON.parse(notes);
    }

    let titles = localStorage.getItem("titles");
    if (titles == null) {
        titleObj = [];
    } else {
        titleObj = JSON.parse(titles);
    }


    titleObj.splice(index, 1);
    localStorage.setItem("titles", JSON.stringify(titleObj));

    notesObj.splice(index, 1);
    localStorage.setItem("notes", JSON.stringify(notesObj));
    showNotes();

}


let search = document.getElementById('searchTxt');

search.addEventListener('input', function () {
    console.log('input event'); let inputVal = search.value.toLowerCase();
    // console.log('Input event fired!', inputVal);
    let noteCards = document.getElementsByClassName('noteCard');
    Array.from(noteCards).forEach(function (element) {
        let cardTxt = element.getElementsByTagName("p")[0].innerText.toLowerCase();
        if (cardTxt.includes(inputVal)) {
            element.style.display = "block";
        }
        else {
            element.style.display = "none";
        }
        // console.log(cardTxt);
    })
});


function editNote(value) {
    // console.log('edit text');
    let notes = localStorage.getItem("notes");
    if (notes == null) {
        notesObj = [];
    } else {
        notesObj = JSON.parse(notes);
    }
    let titles = localStorage.getItem("titles");
    if (titles == null) {
        titleObj = [];
    } else {
        titleObj = JSON.parse(titles);
    }


    // console.log(value);
    // console.log(notesObj[value]);
    addTitle.value = titleObj[value];
    addTxt.value = notesObj[value];
    deleteNote(value);
}


const preBook = document.getElementById('preBookmark');
const postBook = document.getElementById('postBookmark');
const preFav = document.getElementById('preFav');
const postFav = document.getElementById('postFav');

// console.log(preBook);
// console.log(postBook);
// console.log(preFav);
// console.log(postFav);

preBook.addEventListener('click', function(){
    preBook.classList.add('d-none');
    postBook.classList.remove('d-none');
});

postBook.addEventListener('click', function(){
    postBook.classList.add('d-none');
    preBook.classList.remove('d-none');
});

preFav.addEventListener('click', function(){
    preFav.classList.add('d-none');
    postFav.classList.remove('d-none');
});

postFav.addEventListener('click', function(){
    postFav.classList.add('d-none');
    preFav.classList.remove('d-none');
});


