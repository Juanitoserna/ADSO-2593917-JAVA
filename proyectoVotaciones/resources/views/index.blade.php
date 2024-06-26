<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="{{asset('assets/css/style.css')}}">
    
    <title>Registro de usuarios</title>
</head>
<body>
    {{-- @include('_componets.registrarCentro'); --}}
    <h1>Listado</h1>
    <ul>
        @forelse ($users as $user)
            <li>{{$user->name}}</li>
        @empty
            <li>Lista Vacia</li>
        @endforelse
    </ul>
</body>
</html>