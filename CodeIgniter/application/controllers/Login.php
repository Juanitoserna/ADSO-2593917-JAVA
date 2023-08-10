<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Login extends CI_Controller {

	public function index(){
		$this->load->view('Iniciar_sesion');
	}

    public function validarIngreso(){
        $email = $this->input->post('campo_email');
        $password = $this->input->post('campo_password');

        if ($email!="" && $password!="") {
            $this->load->model('personasModel');
            $this->load->model('usuariosModel');
            $validacion = $this->usuariosModel->validarIngreso($email, $password);
            
            if ($validacion) {
                //estraer los datos de  la persona y usuario
                $datosPersona = $this->personasModel->getPersonaByEmail($email);
                $datosUsuarios = $this->usuariosModel->getUsuarioByEmail($email);
                //crear la sesion
                $dataSessios=[
                                "cedula" =>$datosPersona->cedula,
                                "nombres"=>$datosPersona->nombres,
                                "apellidos"=>$datosPersona->apellidos,
                                "telefono"=>$datosPersona->telefono,
                                "direccion"=>$datosPersona->direccion,
                                "email"=>$datosPersona->email,
                                "foto"=>$datosPersona->foto,
                                "tipo"=>$datosUsuarios->tipo,
                                "estado"=>$datosUsuarios->estado,
                            ];
                $this->session->set_userdata("session-mvc", $dataSessios);

                //redireccionar al controilados inicial segun el tipo de usuario
                if ($datosUsuarios->tipo == "ADMIN") {
                    redirect('admin/Inicio', 'refresh');
                }else if($datosUsuarios->tipo == "VENDEDOR"){
                    redirect('vendedor/Inicio', 'refresh');
                }else{
                    redirect('Login', 'refresh');
                }
            } else {
                $data['datosInvalidos'] = true;
                $this->load->view('Iniciar_sesion', $data);
            }
            
        }else{
            $data['errorInData'] = true;
			$data['valueEmail'] = $email;
			$data['valuePassword'] = $password;
			$this->load->view('Iniciar_sesion', $data);
        }
    }
}