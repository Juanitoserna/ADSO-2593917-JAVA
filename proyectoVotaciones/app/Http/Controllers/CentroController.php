<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Center;

class CentroController extends Controller
{
    public function index()
    {
        $centros = Center::all();
        return view('viewCentro', compact('centros'));
    }

    public function create(){
        return view('centro.createCentro');
    }
}
