package com.thomasceballos.practica1_codigo_de_resistencias

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var dato1 = "no"
        var dato2 = "no"
        var multiplicadora : String = "no"
        var tolerancia : String = "no"

        bt_negro2.setOnClickListener {
            dato2 = "0"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato2.setBackgroundResource(R.color.black)}
        bt_negro3.setOnClickListener {
            multiplicadora = " Ω"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.black)}
        bt_cafe1.setOnClickListener {
            dato1 = "1"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato1.setBackgroundResource(R.color.sienna)}
        bt_cafe2.setOnClickListener {
            dato2 = "1"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato2.setBackgroundResource(R.color.sienna)}
        bt_cafe3.setOnClickListener {
            multiplicadora = "0 Ω"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.sienna)}
        bt_cafe4.setOnClickListener {
            tolerancia = "±1%"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato4.setBackgroundResource(R.color.sienna)}
        bt_rojo1.setOnClickListener {
            dato1 = "2"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato1.setBackgroundResource(R.color.firebrick)}
        bt_rojo2.setOnClickListener {
            dato2 = "2"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato2.setBackgroundResource(R.color.firebrick)}
        bt_rojo3.setOnClickListener {
            multiplicadora = "rojo"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.firebrick)}
        bt_rojo4.setOnClickListener {
            tolerancia = "±2%"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato4.setBackgroundResource(R.color.firebrick)}
        bt_naranja1.setOnClickListener {
            dato1 = "3"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato1.setBackgroundResource(R.color.darkorange)}
        bt_naranja2.setOnClickListener {
            dato2 = "3"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato2.setBackgroundResource(R.color.darkorange)}
        bt_naranja3.setOnClickListener {
            multiplicadora = " kΩ"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.darkorange)}
        bt_amarillo1.setOnClickListener {
            dato1 = "4"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato1.setBackgroundResource(R.color.gold)}
        bt_amarillo2.setOnClickListener {
            dato2 = "4"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato2.setBackgroundResource(R.color.gold)}
        bt_amarillo3.setOnClickListener {
            multiplicadora = "0 kΩ"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.gold)}
        bt_verde1.setOnClickListener {
            dato1 = "5"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato1.setBackgroundResource(R.color.darkviolet)}
        bt_verde2.setOnClickListener {
            dato2 = "5"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato2.setBackgroundResource(R.color.darkviolet)}
        bt_verde3.setOnClickListener {
            multiplicadora = "verde"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.darkviolet)}
        bt_verde4.setOnClickListener {
            tolerancia = "±0.5%"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato4.setBackgroundResource(R.color.darkviolet)}
        bt_azul1.setOnClickListener {
            dato1 =  "6"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato1.setBackgroundResource(R.color.darkblue)}
        bt_azul2.setOnClickListener {
            dato2 = "6"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato2.setBackgroundResource(R.color.darkblue)}
        bt_azul3.setOnClickListener {
            multiplicadora = " MΩ"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.darkblue)}
        bt_azul4.setOnClickListener {
            tolerancia = "±0.25"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato4.setBackgroundResource(R.color.darkblue)}
        bt_morado1.setOnClickListener {
            dato1 = "7"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato1.setBackgroundResource(R.color.darkmagenta)}
        bt_morado2.setOnClickListener {
            dato2 = "7"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato2.setBackgroundResource(R.color.darkmagenta)}
        bt_morado3.setOnClickListener {
            multiplicadora = "0 MΩ"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.darkmagenta)}
        bt_morado4.setOnClickListener {
            tolerancia = "±0.1%"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato4.setBackgroundResource(R.color.darkmagenta)}
        bt_gris1.setOnClickListener {
            dato1 = "8"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato1.setBackgroundResource(R.color.dimgray)}
        bt_gris2.setOnClickListener {
            dato2 = "8"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato2.setBackgroundResource(R.color.dimgray)}
        bt_gris3.setOnClickListener {
            multiplicadora = "gris"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.dimgray)}
        bt_gris4.setOnClickListener {
            tolerancia = "±0.05%"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato4.setBackgroundResource(R.color.dimgray)}
        bt_blanco1.setOnClickListener {
            dato1 = "9"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato1.setBackgroundResource(R.color.gainsboro)}
        bt_blanco2.setOnClickListener {
            dato2 = "9"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato2.setBackgroundResource(R.color.gainsboro)}
        bt_blanco3.setOnClickListener {
            multiplicadora = "0 GΩ"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.gainsboro)}
        bt_oro3.setOnClickListener {
            multiplicadora = "oro"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.goldenrod)}
        bt_oro4.setOnClickListener {
            tolerancia =  "±0.5%"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato4.setBackgroundResource(R.color.goldenrod)}
        bt_plata3.setOnClickListener {
            multiplicadora = "plata"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato3.setBackgroundResource(R.color.plata)}
        bt_plata4.setOnClickListener {
            tolerancia = "±0.10%"
            calcular(dato1,dato2,multiplicadora,tolerancia)
            bt_dato4.setBackgroundResource(R.color.plata)}
    }

    fun calcular(dato1:String,dato2:String,multiplicadora:String,tolerancia:String){
        if (dato1=="no" || dato2=="no" || multiplicadora=="no" || tolerancia=="no") {
            tv_resultados.text = "Valor incorrecto, falta al menos un dato"
        }else if(multiplicadora == "rojo"){
            tv_resultados.text = "$dato1.$dato2 kΩ $tolerancia"
        }else if (multiplicadora == "verde"){
            tv_resultados.text = "$dato1.$dato2 MΩ $tolerancia"
        }else if (multiplicadora == "gris"){
            tv_resultados.text = "$dato1.$dato2 GΩ $tolerancia"
        }else if (multiplicadora == "oro"){
            tv_resultados.text = "$dato1.$dato2 Ω $tolerancia"
        }else if (multiplicadora == "plata"){
            tv_resultados.text = "0.$dato1$dato2 Ω $tolerancia"
        }else{
            tv_resultados.text = "$dato1$dato2$multiplicadora $tolerancia"
        }
    }
}