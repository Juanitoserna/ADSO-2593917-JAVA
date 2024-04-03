<?php

use Illuminate\Support\Facades\Route;
use App\http\Controllers\UserController;
use App\http\Controllers\PersonController;
use App\http\Controllers\CentroController;
use App\http\Controllers\LiderController;
use App\http\Controllers\ZonaController;
use App\http\Controllers\ReunionController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

// Route::get('/', function () {
//     return view('welcome');
// });


// Route::view('/', 'index')->name('index');
// Route::view('/welcome', 'welcome')->name('welcome');

// RUTAS PARA EL CONTROLADOR ZONA
Route::get('zonaController', [ZonaController::class, 'index'])->name('zonaController');
Route::get('/index', [ZonaController::class, 'index'])->name('index');
Route::get('/create', [ZonaController::class, 'create'])->name('create');
Route::post('/store', [ZonaController::class, 'store'])->name('store');
Route::get('/edit/{zona}', [ZonaController::class, 'edit'])->name('edit');
Route::put('/update/{zona}', [ZonaController::class, 'update'])->name('update');
Route::get('/show/{zona}', [ZonaController::class, 'show'])->name('show');
Route::delete('/destroy/{zona}', [ZonaController::class, 'destroy'])->name('destroy');

// RUTAS PARA EL CONTROLADOR REUNION
Route::get('reunionController', [ReunionController::class, 'index'])->name('reunionController');
Route::get('/index', [ReunionController::class, 'index'])->name('index');
Route::get('/create', [ReunionController::class, 'create'])->name('create');
Route::post('/store', [ReunionController::class, 'store'])->name('store');
Route::get('/edit/{zona}', [ReunionController::class, 'edit'])->name('edit');
Route::put('/update/{zona}', [ReunionController::class, 'update'])->name('update');
Route::get('/show/{zona}', [ReunionController::class, 'show'])->name('show');
Route::delete('/destroy/{zona}', [ReunionController::class, 'destroy'])->name('destroy');


Route::get('/', [UserController::class, 'index']);
Route::get('personController', [PersonController::class, 'index'])->name('personController');
Route::get('centroController', [CentroController::class, 'index'])->name('centroController');
Route::get('liderController', [LiderController::class, 'index'])->name('liderController');
