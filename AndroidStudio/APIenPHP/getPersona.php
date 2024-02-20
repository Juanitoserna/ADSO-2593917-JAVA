<?php 
    include 'Conexion.php';

    if (!empty($_POST['cedula'])) {

        $documento = $_POST['cedula'];
        
        $consulta = $base_de_datos->query("SELECT * FROM personas WHERE cedula = $documento");
        $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);
    
        // Codifica los datos en UTF-8, para que se puedan convertir a Json sin problema (Ñ y tildes)
        $datos = mb_convert_encoding($datos, "UTF-8", "iso-8859-1");
    
        $respuesta['registros'] = $datos;
        echo json_encode($respuesta);
        
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##VACIOS"
                      ];
        echo json_encode($respuesta);
    }
?>