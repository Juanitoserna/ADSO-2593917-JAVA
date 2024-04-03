<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="{{asset('assets/css/style.css')}}">
</head>
<body>
    @component('_componets.menu')
        
    @endcomponent
{{--     
    <h1>Listado</h1>
    <ul>
        @forelse ($centros as $centro)
            <li>{{$centro->nombre}}</li>
        @empty
            <li>Lista Vacia</li>
        @endforelse
    </ul> --}}
    <div class="container">
        <a href="{{route('create')}}" class="btn btn-primary mt-2 mb-2">Crear Centro</a>
        <table class="table">
            <thead>
                <tr>
                <th scope="col">nombre</th>
                <th scope="col">ubicacion</th>
                <th scope="col">responsable</th>
                <th scope="col">zona</th>
                <th scope="col">imagen</th>
                </tr>
            </thead>
            <tbody>
                @forelse ($centros as $centro)
                    <tr>
                        <th scope="row">{{$centro->nombre}}</th>
                        <td>{{$centro->ubicacion}}</td>
                        <td>{{$centro->responsable}}</td>
                        <td><a href="{{route('edit',$zona->id)}}" class="btn btn-success">Editar</a></td>
                        <td>
                            <form method="POST" action="{{route('destroy', $zona->id)}}">
                                @csrf
                                @method('DELETE')
                                <input type="submit" value="Delete" class="btn btn-danger">
                            </form>
                        </td>
                    </tr>
                @empty
                    
                @endforelse
                
                </tr>
            </tbody>
        </table>

    </div>
</body>
</html>