<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Registros extends CI_Controller {

	public function __construct(){
		parent::__construct();
        $this->load->helper('form');
		// $this->load->helper('url');
        $this->load->model('Usuario');
        $this->load->database();
        
	}

    public function registrarUsuario(){
        $this->load->view('registro/usuario');
        //$vdata["userName"] = $vdata["email"] = $vdata["password"] = $vdata["estado"] = "";
		// if (isset($persona_id)) {
		// 	$persona = $this->Persona->find($persona_id);

		// 	if (isset($persona)) {
		// 		$vdata["nombre"] = $persona->nombre;
		// 		$vdata["apellido"] = $persona->apellido;
		// 		$vdata["edad"] = $persona->edad;
				
		// 	}
		// }
        if($this->input->server("REQUEST_METHOD") == "POST"){ 

            $data["userName"] = $this->input->post("userName");
            $data["email"] = $this->input->post("email");
            $data["password"] = $this->input->post("password");
            $data["estado"] = $this->input->post("estado");

			// $vdata["nombre"] = $this->input->post("nombre");
            // $vdata["apellido"] = $this->input->post("apellido");
            // $vdata["edad"] = $this->input->post("edad");

			// if (isset($persona_id)) {
			// 	$this->Persona->update($persona_id, $data);
			// }else{
			// 	$this->Persona->insert($data);
			// }
            if ($this->Usuario->insert($data)) {
                $vdata['ok'] = true;
            } else {
                $vdata['insertError'] = true;
            }
		}  
		// $this->load->view('personas/guardar', $vdata);
    }

    public function iniciarSession(){
        $this->load->view('registro/login');
    }

	// public function listado()
	// {
	// 	$vdata["productos"] = $this->Productos->findAll();
    //     $this->load->view('producto/listarProducto', $vdata);
	// }

	// public function guardar($producto_id = null){
	// 	$vdata["serial"] = $vdata["nombre"] = $vdata["descripcion"] = $vdata["valor"] = $vdata["cantidad"] = "";
	// 	if (isset($producto_id)) {
	// 		$producto = $this->Productos->find($producto_id);

	// 		if (isset($producto)) {
	// 			$vdata["serial"] = $producto->serial;
	// 			$vdata["nombre"] = $producto->nombre;
	// 			$vdata["descripcion"] = $producto->descripcion;
	// 			$vdata["valor"] = $producto->valor;
    //             $vdata["cantidad"] = $producto->cantidad;
	// 		}
	// 	}
    //     if($this->input->server("REQUEST_METHOD")== "POST"){ 


    //         $data["serial"] = $this->input->post("serial");
    //         $data["nombre"] = $this->input->post("nombre");
    //         $data["descripcion"] = $this->input->post("descripcion");
    //         $data["valor"] = $this->input->post("valor");
    //         $data["cantidad"] = $this->input->post("cantidad");

    //         $Vdata["serial"] = $this->input->post("serial");
    //         $Vdata["nombre"] = $this->input->post("nombre");
    //         $Vdata["descripcion"] = $this->input->post("descripcion");
    //         $Vdata["valor"] = $this->input->post("valor");
    //         $Vdata["cantidad"] = $this->input->post("cantidad");

	// 		if (isset($producto_id)) {
	// 			$this->Productos->update($producto_id, $data);
	// 		}else{
	// 			$this->Productos->insert($data);
	// 		}
            
	// 	}  
    //     $this->load->view('producto/crear', $vdata);	
	// }

	// public function ver($serial = null){
	// 	$producto = $this->Productos->find($serial);

	// 	if (isset($producto)) {
	// 		$vdata["nombre"] = $producto->nombre;
	// 		$vdata["descripcion"] = $producto->descripcion;
	// 		$vdata["valor"] = $producto->valor;
	// 		$vdata["cantidad"] = $producto->cantidad;
	// 	} else {
	// 		$vdata["nombre"] = $vdata["descripcion"] = $vdata["valor"] = $vdata["cantidad"] = "";
	// 	}

	// 	$this->load->view('producto/verProducto',$vdata);
		
	// }

    // public function borrar($serial = null)
	// {
	// 	$this->Productos->delete($serial);
	// 	redirect("/producto/listarProducto");
	// }
}