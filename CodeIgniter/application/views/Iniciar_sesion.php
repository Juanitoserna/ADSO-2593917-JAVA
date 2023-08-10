<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    <title>INISIAR SESION</title>
</head>
<body>
    
    <div class="container px-3 py-3">
        <div class="col-12 row m-0 p-0 justify-content-center">
            <div class="col-12 col-lg-5 p-3 px-5 mt-3 border">
                <h3 class="text-center text-primary text-uppercase mt-3"> <b>Inicio De Sesion</b> </h3>
                
                <?php if (isset($errorInData)):?>
                    <div class="alert alert-danger">
                        DATOS INCOMPLETOS
                    </div>
                <?php endif ?>

                <?php if (isset($datosInvalidos)):?>
                    <div class="alert alert-danger">
                        NO EXISTE UN USUARIO CON ESTO DATOS
                    </div>
                <?php endif ?>
                

                <form action="<?=base_url('index.php/login/validarIngreso') ?>" method="POST">
                    <label for="campo_email" class="form-label m-0">E-mail:</label>
                    <input class="form-control <?= (isset($valueEmail) && $valueEmail!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" id="campo_email"  type="email" name="campo_email" value="<?= (isset($valueEmail))? $valueEmail : '' ?>">

                    <label for="campo_password" class="form-label m-0 mt-3">Password:</label>
                    <input class="form-control <?= (isset($valueEmail) && $valuePassword!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" id="campo_password"  type="password" name="campo_password" value="<?= (isset($valuePassword))? $valuePassword : '' ?>">

                    <div class="row m-0 mt-3 p-0 justify-content-center">
                        <div class="col-12 col-lg-6 m-0 p-0">
                            <button class="col-12 btn btn-primary" type="submit">INICIAR </button>
                        </div>
                    </div>

                    <div class="col-12 m-0 mt-3 p-0 ">
                        <div class="col-12 m-0 p-0">
                            <p class="m-0 p-0">
                                ¿Desea ser parte del el sistema?
                                <a href="#" title="Crear Nuevo Usuario">Click aqui</a>
                            </p>
                        </div>
                        <div class="col-12 m-0 p-0 mt-1">
                            <p class="m-0 p-0">
                                ¿Has olvidado tu contraseña?
                                <a href="#" title="Crear Nuevo Usuario">Recuperar aqui</a>
                            </p>
                        </div>
                    </div>
                </form>
            </div>

        </div>
    </div>
</body>
</html>