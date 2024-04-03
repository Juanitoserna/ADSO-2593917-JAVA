<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Zona;

class ZonaController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $zonas = Zona::all();
        return view('viewZona', compact('zonas'));
    }

    public function create(){
        return view('zona.createZona');
    }
    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        Zona::create($request->all());
        return redirect()->route('index');
    }

    public function edit(Zona $zona){
        return view ('zona.editZona',compact('zona'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Zona $zona)
    {
        $zona->update($request->all());
        return redirect()->route('index');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Request $request, Zona $zona)
    {
        $zona->delete();
        return redirect()->route('index');
    }

    public function show(Zona $zona){
        return view('show',compact('zona'));
    }
}
