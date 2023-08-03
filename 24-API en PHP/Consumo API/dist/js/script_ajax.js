let waitContent = null;
let contentClients = null;
let formInsertarUsuario = null;
let modalEditarUsuario = null;
let listaCLiente = null;

window.onload = function(){
	waitContent = document.getElementById("waitContent");
	contentClients = document.getElementById("contentClients");
	formInsertarUsuario = document.getElementById("formInsertarUsuario");
	campo_cedula = document.getElementById("campo_cedula");
	
	options = {
				backdrop: 'static',
  				keyboard: false,
  				focus: false
  			  };
	modalEditarUsuario = new bootstrap.Modal(document.getElementById('modalEditarUsuario'), options);

	formInsertarUsuario.addEventListener("submit", function(event){
		event.preventDefault();
		crearCliente();
	});

	formEditarUsuario.addEventListener("submit", function(event){
		event.preventDefault();
		editarCliente();
	});

	getClientes();
}

function crearCliente(){
	let datos = new FormData(formInsertarUsuario);
	
	let configuracion = 	{
								method: "POST",
								headers: {
									"Accept": "application/json",
								},
								body: datos,
							};

	fetch("http://localhost/24-API en PHP/ProyectoPHP/Insert.php", configuracion)
	.then( resp => resp.json() )
	.then( data => {

		console.log(" Respuesta API: ");
		console.log(data);
		
		
		if(data.respuesta.status){
			getClientes();
			document.getElementById("campo_cedula").value = "";
			document.getElementById("campo_nombres").value = "";
			document.getElementById("campo_apellidos").value = "";
			document.getElementById("campo_telefono").value = "";
			document.getElementById("campo_direccion").value = "";
			document.getElementById("campo_email").value = "";
	
			document.getElementById("campo_cedula").focus();

			
			Swal.fire({
				
				title: 'INSERTADO CON EXITO',
				text: 'El usuario a sido insertado con exito',
				icon: 'success',
			});
		}else{
			Swal.fire({
				
				title: 'ERROR AL INSERTAR USUARIO',
				text: 'Error al insertar usuario, puede que la cedula ya exista.',
				icon: 'error',
			});
		}
	});
}

function editarCliente() {
	let datos = new FormData(formEditarUsuario);
	
	let configuracion = 	{
								method: "POST",
								headers: {
									"Accept": "application/json",
								},
								body: datos,
							};

	fetch("http://localhost/24-API en PHP/ProyectoPHP/Editar.php", configuracion)
	.then( resp => resp.json() )
	.then( data => {

		// console.log(" Respuesta API: ");
		// console.log(data);
		
		
		if(data.respuesta.status){
			getClientes();
			Swal.fire({
				
				title: 'MODIFICADO CON EXITO',
				text: 'El usuario a sido modificado con exito',
				icon: 'success',
			});
		}else{
			Swal.fire({
				
				title: 'ERROR AL MODIFICAR USUARIO',
				text: 'Error al modificar usuario, puede que los datos sean erroneos..',
				icon: 'error',
			});
		}
	});
}

function getClientes(){
	let endpointLocal = "http://localhost/24-API en PHP/ProyectoPHP/Obtener.php";
	waitContent.style.display = 'block';
	fetch( endpointLocal )
	.then( res => res.json() )
	.then( data => {
		// console.log("Datos servidor:");
		// console.log(data);
		listaCLiente = data.registros;
		contentClients.innerHTML = "";
		for (var i = 0; i < data.registros.length; i++) {
			let trHtlm = `	<tr>
								<td class="text-center"> ${ data.registros[i].cedula } </td>
								<td> ${ data.registros[i].nombres } </td>
								<td> ${ data.registros[i].apellidos } </td>
								<td class="text-center"> ${ data.registros[i].telefono } </td>
								<td> ${ data.registros[i].direccion } </td>
								<td> ${ data.registros[i].email } </td>
								<td class="m-0 p-1">
									<button class="col-12 btn btn-outline-success m-0 px-2 py-1" onclick="abrirModalEditar(${i})"> EDITAR </button>
								</td>
							</tr>`;
			contentClients.innerHTML += trHtlm;
		}

		waitContent.style.display = 'none';
	});
}

function abrirModalEditar (posicion) {
	document.getElementById("campo_editar_cedula").value = listaCLiente[posicion].cedula;
	document.getElementById("campo_editar_nombres").value = listaCLiente[posicion].nombres;
	document.getElementById("campo_editar_apellidos").value = listaCLiente[posicion].apellidos;
	document.getElementById("campo_editar_telefono").value = listaCLiente[posicion].telefono;
	document.getElementById("campo_editar_direccion").value = listaCLiente[posicion].direccion;
	document.getElementById("campo_editar_email").value = listaCLiente[posicion].email;

	modalEditarUsuario.show();
}

