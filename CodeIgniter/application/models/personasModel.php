<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class personasModel extends CI_Model{

    public function getPersonaByEmail($email){
        $this->db->where('email',$email);
        $registros = $this->db->get('persona')->result();

        if (sizeof($registros)!= 0) {
            return $registros[0];
        }else{
            return null;
        }
    }
}