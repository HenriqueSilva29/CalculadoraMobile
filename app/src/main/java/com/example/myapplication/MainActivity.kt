package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculadora.Calculadora
import com.example.calculadora.functions.Utils
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    //Greeting("Android")
                    //startActivity(Intent(this@MainActivity, Calculadora::class.java))
                    setContentView(R.layout.activity_calculadora)

                    var resultadoTextView = findViewById<TextView>(R.id.resultado);
                    var btn0 = findViewById<Button>(R.id.b_0)
                    var btn1 = findViewById<Button>(R.id.b_1)
                    var btn2 = findViewById<Button>(R.id.b_2)
                    var btn3 = findViewById<Button>(R.id.b_3)
                    var btn4 = findViewById<Button>(R.id.b_4)
                    var btn5 = findViewById<Button>(R.id.b_5)
                    var btn6 = findViewById<Button>(R.id.b_6)
                    var btn7 = findViewById<Button>(R.id.b_7)
                    var btn8 = findViewById<Button>(R.id.b_8)
                    var btn9 = findViewById<Button>(R.id.b_9)
                    var btn_igual = findViewById<Button>(R.id.b_result)
                    var btn_soma = findViewById<Button>(R.id.b_soma)
                    var btn_subtrair = findViewById<Button>(R.id.b_subtrair)
                    var btn_dividir = findViewById<Button>(R.id.b_divisao)
                    var btn_multiplicar = findViewById<Button>(R.id.b_multiplicar)
                    var btn_apagar = findViewById<Button>(R.id.b_apagar)

                    btn0.setOnClickListener {
                        Utils.Operacaoes.Display(btn0.text.toString())
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn1.setOnClickListener {
                        Utils.Operacaoes.Display(btn1.text.toString())
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn2.setOnClickListener {
                        Utils.Operacaoes.Display(btn2.text.toString())
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn3.setOnClickListener {
                        Utils.Operacaoes.Display(btn3.text.toString())
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn4.setOnClickListener {
                        Utils.Operacaoes.Display(btn4.text.toString())
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn5.setOnClickListener {
                        Utils.Operacaoes.Display(btn5.text.toString())
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn6.setOnClickListener {
                        Utils.Operacaoes.Display(btn6.text.toString())
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn7.setOnClickListener {
                        Utils.Operacaoes.Display(btn7.text.toString())
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn8.setOnClickListener {
                        Utils.Operacaoes.Display(btn8.text.toString())
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn9.setOnClickListener {
                        Utils.Operacaoes.Display(btn9.text.toString())
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn_apagar.setOnClickListener {
                        Utils.Operacaoes.Apagar()
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn_soma.setOnClickListener {
                        Utils.Operacaoes.Somar()
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn_subtrair.setOnClickListener {
                        Utils.Operacaoes.Subtrair()
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn_dividir.setOnClickListener {
                        Utils.Operacaoes.Dividir()
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }
                    btn_multiplicar.setOnClickListener {
                        Utils.Operacaoes.Multiplicar()
                        resultadoTextView.text = Utils.Operacaoes.MostrarDisplay()
                    }

                    btn_igual.setOnClickListener {
                        resultadoTextView.text = Utils.Operacaoes.Resultado()
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}