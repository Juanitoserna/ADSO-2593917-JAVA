<?php 
  $dataHeader['titulo'] = "Crear Usuarios";
  $this->load->view('layouts/header', $dataHeader); 
?>
  <?php 
    $dataSidebar['session'] = $session;
    $dataSidebar['optionSelected'] = 'openCrudAjax';
    $this->load->view('layouts/sidebar', $dataSidebar); 
  ?>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">

    <div class="col-12 m-0 p-2 bg-white">
      <div class="row justify-content-end">
        <button class="col-auto btn btn-primary" data-toggle="modal" data-target="#modalCrearUsuario">CREAR USUARIO</button>
      </div>
      <table class="table table-bordered">
        <thead>
          <tr>
            <th>CEDULA</th>
            <th>NOMBRES</th>
            <th>APELLIDOS</th>
            <th>TELEFONO</th>
            <th>DIRECCION</th>
            <th>CORREO</th>
            <th></th>
          </tr>
        </thead>
        <tbody id="tbodyPersonas">
          
        </tbody>
      </table> 
    </div>
  </div>
  
  <!-- MODAL -->
  <div class="modal fade" id="modalCrearUsuario">
    <div class="modal-dialog">
      <form  id="formularioCrearUsuario" action="#" method="POST" >
        <div class="modal-content">
        <div class="modal-header">
          <h4 class="modal-title"> CREAR USUARIO</h4>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
            <label class="form-label" for="campo_cedula">Cedula: </label>
            <input id="campo_cedula" class="form-control" type="number" name="campo_cedula" required >

            <label class="form-label" for="campo_nombres">Nombres: </label>
            <input id="campo_nombres" class="form-control" type="text" name="campo_nombres" required >

            <label class="form-label" for="campo_apellidos">Epellido:</label>
            <input id="campo_apellidos" class="form-control" type="text" name="campo_apellidos" required>

            <label class="form-label" for="campo_telefono">Telefono:</label>
            <input id="campo_telefono" class="form-control" type="text" name="campo_telefono" required >

            <label class="form-label" for="campo_direccion">Direccion: </label>
            <input id="campo_direccion" class="form-control" type="text" name="campo_direccion" required>

            <label class="form-label" for="campo_email">Email: </label>
            <input id="campo_email" class="form-control" type="email" name="campo_email" required>

            <label class="form-label" for="campo_tipo">Cedula</label>
            <select class="form-control" name="campo_tipo" id="campo_tipo" >
              <option value="ADMIN">ADMIN</option>
              <option value="VENDEDOR">VENDEDOR</option>
            </select>
            
        </div>
        <div class="modal-footer justify-content-between">
          <button type="button" class="btn btn-default" data-dismiss="modal">CERRAR</button>
          <button type="submit" class="btn btn-primary">REGISTRAR</button>
        </div>
        </div>
      </form>
      <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
  </div>

  <script src="<?= base_url('dist/js/my_script.js') ?>"></script>
<?php 
  $this->load->view('layouts/footer'); 
?>
