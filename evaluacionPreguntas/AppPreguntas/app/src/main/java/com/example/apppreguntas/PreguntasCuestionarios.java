package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apppreguntas.utils.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PreguntasCuestionarios extends AppCompatActivity {
    TextView nombre_usuario;
    TextView fecha_inicio;
    TextView pregunta_actual;
    Config config;
    LinearLayout layoutPrincipal;
    String id_pregunta;
    String respuesta;
    String id_cuestionario;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_cuestionarios);

        nombre_usuario = findViewById(R.id.usuario);
        fecha_inicio = findViewById(R.id.fecha_inicio);
        pregunta_actual = findViewById(R.id.pregunta_actual);
        config = new Config(getApplicationContext());


        Intent intent = getIntent();
        //VARIABLE DE SESION
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        String id_usuario = archivo.getString("id_usuario", null);

        nombre_usuario.setText(archivo.getString("nombres", ""));
        id_cuestionario = intent.getStringExtra("id");
        String fecha_actual= intent.getStringExtra("fecha_actual");

        nombre_usuario.setText(archivo.getString("nombres", ""));
        fecha_inicio.setText(fecha_actual);

        consumoPreguntas();

    }

    public void consumoPreguntas(){
        // CONSUMO GET PARA TRAER LOS CUESTIONARIOS
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("API-Preguntas/getOtherPregunta.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    boolean valorBooleano = jsonObject.getBoolean("status");

                    if (valorBooleano){
                        imprimirPreguntas(jsonObject);
                    }else{
                        System.out.println("Error en el estado");
                    }

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
                params.put("id_cuestionario", id_cuestionario);
                return params;
            }
        };

        queue.add(solicitud);
    }
    public void imprimirPreguntas(JSONObject jsonObject){
        try {
            JSONObject preguntaJson = jsonObject.getJSONObject("preguntas");
            JSONArray opcionesJson = jsonObject.getJSONArray("opciones");

            // Obtener el LinearLayout
            layoutPrincipal = findViewById(R.id.layout_principal);

            // Crear TextView para la descripción de la pregunta
            String descripcionPregunta = preguntaJson.getString("descripcion");
            id_pregunta = preguntaJson.getString("id");
            TextView textViewDescripcion = new TextView(getApplicationContext());
            textViewDescripcion.setText(descripcionPregunta);
            textViewDescripcion.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            textViewDescripcion.setGravity(Gravity.CENTER);
            textViewDescripcion.setTypeface(null, Typeface.BOLD);
            textViewDescripcion.setPadding(5,5,5,5);
            textViewDescripcion.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25); // Establecer tamaño de texto
            layoutPrincipal.addView(textViewDescripcion);

            // Obtener la URL de la imagen
            String urlImagen = preguntaJson.getString("url_imagen");

            // Solicitar la imagen
            RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
            ImageRequest solicitud = new ImageRequest(
                    urlImagen,
                    new Response.Listener<Bitmap>() {
                        @Override
                        public void onResponse(Bitmap bitmap) {
                            // Set the image in the ImageView.
                            ImageView imageView = new ImageView(getApplicationContext());
                            imageView.setImageBitmap(bitmap);
                            imageView.setLayoutParams(new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT));
                            layoutPrincipal.addView(imageView, 1); // Agrega la imagen en la posición 1
                        }
                    },
                    0, 0, null, // maxWidth, maxHeight, decodeConfig;
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            System.out.println("El servidor responde con un error:");
                            System.out.println(error.getMessage());
                        }
                    });

            queue.add(solicitud);

            // Crear RadioButtons para las opciones
            RadioGroup radioGroup = new RadioGroup(getApplicationContext());
            radioGroup.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            for (int i = 0; i < opcionesJson.length(); i++) {
                JSONObject opcionJson = opcionesJson.getJSONObject(i);
                String descripcionOpcion = opcionJson.getString("descripcion");

                RadioButton radioButton = new RadioButton(getApplicationContext());
                radioButton.setText(descripcionOpcion);
                radioButton.setLayoutParams(new RadioGroup.LayoutParams(
                        RadioGroup.LayoutParams.MATCH_PARENT,
                        RadioGroup.LayoutParams.WRAP_CONTENT));
                radioButton.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 15); // Establecer tamaño de texto
                radioGroup.addView(radioButton);
            }
            layoutPrincipal.addView(radioGroup);

        } catch (JSONException e) {
            System.out.println("Error al procesar el JSON: " + e.getMessage());
        }



    }

    public void cambiarPregunta(View view){
        // CONSUMO GET PARA TRAER LOS CUESTIONARIOS
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("API-Preguntas/createRespuesta.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    boolean valorBooleano = jsonObject.getBoolean("status");

                    if (valorBooleano){
                        imprimirPreguntas(jsonObject);
                    }else{
                        System.out.println("Error en el estado");
                    }

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
                //$id_cuestionario =  $_POST["id_cuestionario"];
                //$id_pregunta  = $_POST["id_pregunta"];
                //$respuesta = $_POST["respuesta"];
                //$estado = $_POST["estado"];
                //$fecha = $_POST["fecha"];
                Map<String, String> params = new HashMap<String, String>();
                params.put("id_cuestionario", id_cuestionario);
                params.put("id_pregunta", id_pregunta);
                params.put("respuesta", id_pregunta);
                return params;
            }
        };

        queue.add(solicitud);
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }


}