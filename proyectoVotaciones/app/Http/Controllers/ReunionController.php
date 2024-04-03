<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Reunion;

class ReunionController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $reunion = Reunion::all();
        return view('viewReunion', compact('reunion'));
    }

    public function create(){
        return view('reunion.createReunion');
    }
    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        Reunion::create($request->all());
        return redirect()->route('index');
    }

    public function edit(Reunion $reunion){
        return view ('reunion.editReunion',compact('reunion'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Reunion $reunion)
    {
        $reunion->update($request->all());
        return redirect()->route('index');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Request $request, Reunion $reunion)
    {
        $reunion->delete();
        return redirect()->route('index');
    }

    public function show(Reunion $reunion){
        return view('show',compact('zona'));
    }
}
