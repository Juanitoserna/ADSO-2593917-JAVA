<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="{{asset('assets/css/style.css')}}">
    <title>Document</title>
</head>
<body>
    <a href="{{route('index')}}" class="btn btn-success">Volver</a>
    <div class="container" id="principal" style="margin-top: 5%">
        <div class="mt-5 p-3" style="border: 1px solid rgb(48, 159, 233); box-shadow: 0px 0px 15px 0px rgb(48, 159, 233);">
            <h1 class="mt-2 mb-2 text-center">Actualizar Zona</h1>
            <form method="POST" action="{{route('update', $zona->id)}}">
                @method('put')
                @csrf
                <div class="mb-3">
                    <div class="row">
                        <div class="col-1">
                            <svg style="width: 18px; margin-top: 35px" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path d="M215.7 499.2C267 435 384 279.4 384 192C384 86 298 0 192 0S0 86 0 192c0 87.4 117 243 168.3 307.2c12.3 15.3 35.1 15.3 47.4 0zM192 128a64 64 0 1 1 0 128 64 64 0 1 1 0-128z"/></svg>
                        </div>
                        <div class="col-11">
                            <label for="inputDireccion" class="form-label">Barrio:</label>
                            <input type="text" class="form-control" id="inputDireccion" name="barrio" value="{{$zona->barrio}}">
                        </div>
                    </div>
                </div>
                <div class="mb-3">
                    <div class="row">
                        <div class="col-1">
                            <svg style="width: 18px; margin-top: 35px" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path d="M302.8 312C334.9 271.9 408 174.6 408 120C408 53.7 354.3 0 288 0S168 53.7 168 120c0 54.6 73.1 151.9 105.2 192c7.7 9.6 22 9.6 29.6 0zM416 503l144.9-58c9.1-3.6 15.1-12.5 15.1-22.3V152c0-17-17.1-28.6-32.9-22.3l-116 46.4c-.5 1.2-1 2.5-1.5 3.7c-2.9 6.8-6.1 13.7-9.6 20.6V503zM15.1 187.3C6 191 0 199.8 0 209.6V480.4c0 17 17.1 28.6 32.9 22.3L160 451.8V200.4c-3.5-6.9-6.7-13.8-9.6-20.6c-5.6-13.2-10.4-27.4-12.8-41.5l-122.6 49zM384 255c-20.5 31.3-42.3 59.6-56.2 77c-20.5 25.6-59.1 25.6-79.6 0c-13.9-17.4-35.7-45.7-56.2-77V449.4l192 54.9V255z"/></svg>
                        </div>
                        <div class="col-11">
                            <label for="inputResponsable" class="form-label">Sector:</label>
                            <input type="text" class="form-control" id="inputResponsable" name="sector" value="{{$zona->sector}}">
                        </div>
                    </div>
                </div>
                <div class="text-center">
                    <input type="submit" class="btn btn-info" value="Actualizar">
                </div>
    
            </form>
        </div>
    
    </div>
</body>
</html>