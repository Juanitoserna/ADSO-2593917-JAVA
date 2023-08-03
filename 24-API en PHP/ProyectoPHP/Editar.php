<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST, OPTIONS");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include 'Conexion.php';

    if (!empty($_POST['cedula']) and !empty($_POST['nombres']) and !empty($_POST['apellidos']) and !empty($_POST['telefono']) and !empty($_POST['direccion']) and !empty($_POST['email']) ) {

        $documento = $_POST['cedula'];
        $nombres = $_POST['nombres'];
        $apellidos = $_POST['apellidos'];
        $telefono = $_POST['telefono'];
        $direccion = $_POST['direccion'];
        $email = $_POST['email'];

        $consulta = $base_de_datos->prepare("UPDATE personas SET nombres=:nom, apellidos=:ape, telefono=:tel, direccion=:dir, email=:ema WHERE cedula=:doc ");

        $consulta->bindParam(':doc', $documento);
        $consulta->bindParam(':nom', $nombres);
        $consulta->bindParam(':ape', $apellidos);
        $consulta->bindParam(':tel', $telefono);
        $consulta->bindParam(':dir', $direccion);
        $consulta->bindParam(':ema', $email);
        
        $proceso = $consulta->execute();

        if( $proceso ){
            $respuesta['respuesta'] = [
                                        'status' => true,
                                        'mesagge' => "OK##Cliente##Editar",
                                      ];
            echo json_encode($respuesta);
        }else{
            $respuesta['respuesta'] = [
                                        'status' => false,
                                        'mesagge' => "ERROR##Cliente##Editar",
                                      ];
            echo json_encode($respuesta);
        }
        
    }else{
        $respuesta['respuesta'] = [
                                    'status' => false,
                                    'mesagge' => "ERROR##DATOS##POST",
                                    'request' => $_POST
                                  ];
        echo json_encode($respuesta);
    }
?>
