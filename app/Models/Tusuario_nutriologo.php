<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Tusuario_nutriologo extends Model
{
    use HasFactory;

    protected $fillable = [
        'descripcion',
        'foto',
        'direccion',
        'telefono',
        'cedula_profesional',
    ];

    public function user()
    {
        return $this->belongsTo(User::class, 'user_id', 'id');
    }
}
