package com.example.rafaelp.contacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Persona extends AppCompatActivity {
    public Intent intento;
    public Bundle b;
    TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona);
        b=getIntent().getExtras();
        TextView nombre=(TextView)findViewById(R.id.nombre);
        TextView fecha=(TextView)findViewById(R.id.fecha);
        TextView numero=(TextView)findViewById(R.id.numero);
        TextView email=(TextView)findViewById(R.id.email);
        TextView descripcion =(TextView)findViewById(R.id.descripcion);
        Button boton=(Button)findViewById(R.id.boton);
        nombre.setText(b.getString("nombre"));
        numero.setText(b.getString("telefono"));
        email.setText(b.getString("email"));
        descripcion.setText(b.getString("descipcion"));
        intento=new Intent(Persona.this,Contactos.class);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rellenandoCampos();
                startActivity(intento);

            }
        });

    }
    public void rellenandoCampos(){
        TextView nombre=(TextView) findViewById(R.id.Cnombre);
        TextView telefono=(TextView) findViewById(R.id.Ctelefono);
        TextView email=(TextView) findViewById(R.id.Cemail);
        TextView descripcion=(TextView) findViewById(R.id.CDescripción);
        nombre.setText(this.nombre.getText().toString());
        telefono.setText(b.getString("numero"));
        email.setText(b.getString("email"));
        descripcion.setText(b.getString("descripcion"));
        startActivity(intento);
    }
}
