<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('personas_teble', function (Blueprint $table) {
            $table->id();
            $table->String('nombre');
            $table->String('apellido');
            $table->String('telefono');
            $table->String('direccion');
            $table->String('correo');
            $table->String('zona');
            $table->String('centro');
            $table->String('puesto');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('personas_teble');
    }
};
