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
    @component ('_componets.menu') @endcomponent
    <div class="container">
        <a href="{{route('create')}}" class="btn btn-primary mt-2 mb-2">Crear Zona</a>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">titulo</th>
                    <th scope="col">descripcion</th>
                    <th scope="col">fecha</th>
                    <th scope="col">lugar</th>
                    <th>Editar</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                @forelse ($reunion as $reun)
                    <tr>
                        <th scope="row">{{$reun->id}}</th>
                        <td>{{$reun->titulo}}</td>
                        <td>{{$reun->descripcion}}</td>
                        <td>{{$reun->fecha}}</td>
                        <td>{{$reun->lugar}}</td>
                        <td><a href="{{route('edit',$reun->id)}}" class="btn btn-success">Editar</a></td>
                        <td>
                            <form method="POST" action="{{route('destroy', $reun->id)}}">
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