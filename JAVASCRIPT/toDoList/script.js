const list = document.querySelector("#list");
let input = document.getElementById("task");
const error = document.getElementById("errorMsg");
let listItem = document.querySelectorAll("#list i")
const deleteBtn = document.querySelector(".material-symbols-outlined");


function createList(text){
    const li = document.createElement("li");
    li.innerHTML = `<span>${text}</span> <span class="material-symbols-outlined" onclick=deleteItem(this)>
    close
    </span>`
    list.append(li);
}   

function domMessage(type,header,message){
    let msg = `<div class="alert alert-${type} alert-dismissible fade show" role="alert">
    <strong>${header}!</strong> ${message}
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
  </div>`    
    error.innerHTML = msg;
}

function newElement(){
    text = input.value;
    if(text == ""){
        domMessage('danger',"Hata","Değer boş olamaz!")
    }else{
        createList(text)
        domMessage('success',"Başarılı","Başarıyla ekleme yapıldı!")
        getLocal()
        input.value = ""
    }
    
}

function getLocal(){
    let items = JSON.parse(localStorage.getItem('todo'))
    if(items === null){
        toDoList = []
    }else{
        toDoList = items;
    }
    toDoList.push(input.value)
    localStorage.setItem('todo',JSON.stringify(toDoList));
    showList();
}

function showList(){
    let liItem ='';
    let items = JSON.parse(localStorage.getItem('todo'));
    if(items === null){
        toDoList = []
    }else{
        toDoList = items;
    }
    console.log(toDoList)
    toDoList.forEach((data,index) => {
        liItem += `<li><span>${data}</span> <span class="material-symbols-outlined" onclick=deleteItem(${index})>
    close
    </span></li>`
    });

    list.innerHTML = liItem;  
}
showList()

function deleteItem(index){
    let getStroge = localStorage.getItem("todo");
    listArr = JSON.parse(getStroge);
    listArr.splice(index,1);
    localStorage.setItem("todo",JSON.stringify(listArr));
    showList();
}

