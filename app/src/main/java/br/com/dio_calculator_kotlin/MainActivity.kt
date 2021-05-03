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
        numero_um.setOnClickListener { AcrescentarUmaExpressao(string =  "1", limpar_dados = true)}
        numero_dois.setOnClickListener { AcrescentarUmaExpressao(string =  "2", limpar_dados = true)}
        numero_tres.setOnClickListener { AcrescentarUmaExpressao(string =  "3", limpar_dados = true)}
        numero_quatro.setOnClickListener { AcrescentarUmaExpressao(string =  "4", limpar_dados = true)}
        numero_cinco.setOnClickListener { AcrescentarUmaExpressao(string =  "5", limpar_dados = true)}
        numero_seis.setOnClickListener { AcrescentarUmaExpressao(string =  "6", limpar_dados = true)}
        numero_sete.setOnClickListener { AcrescentarUmaExpressao(string =  "7", limpar_dados = true)}
        numero_oito.setOnClickListener { AcrescentarUmaExpressao(string =  "8", limpar_dados = true)}
        numero_nove.setOnClickListener { AcrescentarUmaExpressao(string =  "9", limpar_dados = true)}
        ponto.setOnClickListener{AcrescentarUmaExpressao(string = ".", limpar_dados = false)}

        //operadores
        soma.setOnClickListener {AcrescentarUmaExpressao(string = "+", limpar_dados = false)}
        subtracao.setOnClickListener{AcrescentarUmaExpressao(string = "-", limpar_dados = false)}
        multiplicacao.setOnClickListener{AcrescentarUmaExpressao(string = "*", limpar_dados = false)}
        divisao.setOnClickListener{AcrescentarUmaExpressao(string = "/", limpar_dados = false)}

        //limpar
        limpar.setOnClickListener {
            expressao.text = ""
            resultado.text = ""
        }

        //backspace
        backspace.setOnClickListener {

            val string = expressao.text.toString()

            if (string.isNotBlank()){ //se string não estiver vazia.
                expressao.text = string.substring(0, string.length-1) //tira um caracter
            }

            resultado.text = ""
        }

        igual.setOnClickListener {

            try {
                val expressao = ExpressionBuilder()

            }catch (){

            }
        }


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