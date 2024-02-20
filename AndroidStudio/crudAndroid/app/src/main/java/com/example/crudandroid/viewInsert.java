package com.example.crudandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.ResponseDelivery;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.ResponseCache;
import java.util.HashMap;
import java.util.Map;

public class viewInsert extends AppCompatActivity {

    EditText campo_cedula;
    EditText campo_nombre;
    EditText campo_apellido;
    EditText campo_telefono;
    EditText campo_direccion;
    EditText campo_correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_insert);

        campo_cedula = findViewById(R.id.campo_cedula);
        campo_nombre = findViewById(R.id.campo_nombre);
        campo_apellido = findViewById(R.id.campo_apellido);
        campo_telefono = findViewById(R.id.campo_telefono);
        campo_direccion = findViewById(R.id.campo_direccion);
        campo_correo = findViewById(R.id.campo_correo);

    }

    public void consumoPostJson(View vista){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "http://192.168.1.39/APIenPHP/Insert.php";

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.println(response);
                } catch (JSONException e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }){
            protected Map<String, String> getParams(){
                Map<String, String> params = new HashMap<String, String>();
                params.put("cedula", "107701");
                params.put("nombres", "Juan Esteban");
                params.put("apellidos", "Serna");
                params.put("telefono", "312654");
                params.put("direccion", "calle 20");
                params.put("email", "example@gmail.com");

                return params;
            }
        };

        queue.add(solicitud);
    }
}