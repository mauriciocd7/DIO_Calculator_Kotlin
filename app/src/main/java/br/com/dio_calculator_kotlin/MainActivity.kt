package br.com.dio_calculator_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dio_calculator_kotlin.R.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide() // remove a toolbar



        //eventos de clique
        numero_zero.setOnClickListener { AcrescentarUmaExpressao(string =  "0", limpar_dados = true)} //valores para os parâmetros


    }

    fun AcrescentarUmaExpressao(string: String, limpar_dados: Boolean){

        //validações
        if(resultado.text.isNotEmpty()){ //resultado não estiver vazio
            expressao.text = ""
        }

        if(limpar_dados){
            resultado.text = ""
            expressao.append(string) //acrescenta a string
        }

        else{
            expressao.append(resultado.text)
            expressao.append(string)
            resultado.text = "" //limpa dados
        }

    }


}