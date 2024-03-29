let contentMenu = null;
let btnAtras = null;
let btnSiguiente = null;
let waitContent = null;
let contentImg = null;

window.onload = function(){
	contentMenu = document.getElementById("contentMenu");
	btnAtras = document.getElementById("btnAtras");
	btnSiguiente = document.getElementById("btnSiguiente");
	waitContent = document.getElementById("waitContent");
	contentImg = document.getElementById("contentImg");

	getPokemons("https://pokeapi.co/api/v2/pokemon");
}

function getPokemons(endpoint){

	waitContent.style.display = 'block';
	fetch( endpoint )
	.then( res => res.json() )
	.then( data => {
		contentMenu.innerHTML = "";
		for (var i=0; i<data.results.length; i++) {
			let btnTemp = `<button class="col-2 m-1 btn btn-outline-primary" onclick="getImg('${data.results[i].url}')">${ data.results[i].name }</button>`;
			contentMenu.innerHTML += btnTemp;
		}

		btnAtras.setAttribute("data-endpoint", data.previous );
		btnSiguiente.setAttribute("data-endpoint", data.next);
		waitContent.style.display = 'none';
	});
}

function getNext(){
	let endpoint = btnSiguiente.getAttribute("data-endpoint");
	if (endpoint!=null){
		getPokemons(endpoint);
	}else{
		waitContent.style.display = 'none';
	}
}

function getBack(){
	let endpoint = btnAtras.getAttribute("data-endpoint");
	if (endpoint!=null){
		getPokemons(endpoint);
	}else{
		waitContent.style.display = 'none';
	}
}

function getImg(endpoint) {
	waitContent.style.display = 'block';
	fetch( endpoint )
	.then( res => res.json() )
	.then( data => {
		contentImg.innerHTML = "";
		let img = `<img height="230" src="${ data.sprites.other.dream_world.front_default }" alt="">`;
		contentImg.innerHTML += img;

		btnAtras.setAttribute("data-endpoint", data.previous );
		btnSiguiente.setAttribute("data-endpoint", data.next);
		waitContent.style.display = 'none';
	});
}