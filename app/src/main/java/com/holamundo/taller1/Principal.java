package com.holamundo.taller1;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends Activity {
    //Declaro las variables
    private Spinner material, dije, tipo, moneda;
    private String mat[],dij[],tip[], mon[];
    private EditText cantidad;
    private TextView resp;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Capturar objetos del layout principal
        material = findViewById(R.id.cmbMaterial);
        dije = findViewById(R.id.cmbDije);
        tipo = findViewById(R.id.cmbTipo);
        cantidad = findViewById(R.id.txtCantidad);
        moneda = findViewById(R.id.cmbMoneda);
        resp = findViewById(R.id.txtResultado);
        //Recursos de la aplicación
        recursos =this.getResources();
        //Capturar los arrays
        mat = recursos.getStringArray(R.array.op_material);
        ArrayAdapter<String> adapterMat = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, mat);
        material.setAdapter(adapterMat);

        dij = recursos.getStringArray(R.array.op_dije);
        ArrayAdapter<String> adapterDij = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, dij);
        dije.setAdapter(adapterDij);

        tip = recursos.getStringArray(R.array.op_tipo);
        ArrayAdapter<String> adapterTip = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, tip);
        tipo.setAdapter(adapterTip);

        mon = recursos.getStringArray(R.array.op_moneda);
        ArrayAdapter<String> adapterMon = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, mon);
        moneda.setAdapter(adapterMon);
    }

    public void cotizar(View v){
        if (validar()) {
            int op_mat=material.getSelectedItemPosition();
            int op_dij=dije.getSelectedItemPosition();
            int op_tip=tipo.getSelectedItemPosition();
            int cant = Integer.parseInt(cantidad.getText().toString());
            int op_mon=moneda.getSelectedItemPosition();
            int total = 0;

            total = Metodos.resultado(op_mat,op_dij,op_tip,cant,op_mon);

            resp.setText("El valor total de su consulta es de: " + total + " " + moneda.getSelectedItem());
        }
    }

    public boolean validar(){
        int op_mat=material.getSelectedItemPosition();
        int op_dij=dije.getSelectedItemPosition();
        int op_tip=tipo.getSelectedItemPosition();
        int op_mon=moneda.getSelectedItemPosition();
        if (op_mat==0){
            Toast.makeText(this, recursos.getString(R.string.error_1),Toast.LENGTH_SHORT).show();
            return false;
        }
        if (op_dij==0){
            Toast.makeText(this, recursos.getString(R.string.error_2),Toast.LENGTH_SHORT).show();
            return false;
        }
        if (op_tip==0) {
            Toast.makeText(this, recursos.getString(R.string.error_3), Toast.LENGTH_SHORT).show();
            return false;
        }
        int cant = Integer.parseInt(cantidad.getText().toString());
        if (cantidad.getText().toString().isEmpty()||cant<1||cant>10000){
            cantidad.setError(recursos.getString(R.string.error_4));
            cantidad.requestFocus();
            return false;
        }
        if (op_mon==0){
            Toast.makeText(this, recursos.getString(R.string.error_5),Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
