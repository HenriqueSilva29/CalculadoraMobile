package com.example.calculadora.functions;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    Operacaoes operacaoes = new Operacaoes();
    public static class Operacaoes{
        static String ResultadoFinal = "";
        static List<String> DisplayList = new ArrayList<>();

        public static void Display(String numero){

            if(!ResultadoFinal.isEmpty()){
                ResultadoFinal = "";
                Apagar();
            }
            if(DisplayList.isEmpty() && numero.equals("0")){
                DisplayList.add("0");
            }
            else if(DisplayList.isEmpty()){
                DisplayList.add(numero);
            }
            else if(DisplayList.get(0).equals("0") && !numero.equals("0")){
                DisplayList.remove(0);
                DisplayList.add(numero);
            }
            else
                DisplayList.add(numero);

        }

        public static String MostrarDisplay(){

            StringBuilder  display = new StringBuilder();

            for(String item : DisplayList){
                display.append(item);
            }

            return display.toString();
        }

        public static void Somar(){

            if(!DisplayList.isEmpty()) DisplayList.add("+");

        }
        public static void Subtrair(){

            if(!DisplayList.isEmpty())  DisplayList.add("-");

        }
        public static void Multiplicar(){

            if(!DisplayList.isEmpty()) DisplayList.add("*");
        }
        public static void Dividir(){

            if(!DisplayList.isEmpty()) DisplayList.add("/");

        }

        public static void Apagar(){
            DisplayList.clear();
            DisplayList.add("0");
        }

        public static String Resultado() {
                List<Double> numeros = new ArrayList<>();
                List<Character> operadores = new ArrayList<>();

                String texto = MostrarDisplay();
                String numeroAtual = "";

                for (char caractere : texto.toCharArray()) {
                    if (Character.isDigit(caractere) || caractere == '.') {
                        numeroAtual += caractere;
                    } else {
                        if (numeros.size() < 2) {
                            numeros.add(Double.parseDouble(numeroAtual));
                            numeroAtual = "";
                            if (operadores.size() < 1) {
                                operadores.add(caractere);
                            } else
                                break;

                        } else
                            break;
                    }
                }
                numeros.add(Double.parseDouble(numeroAtual));
                List<Double> numerosStack = new ArrayList<>();
                numerosStack.addAll(numeros);
                List<Character> operadoresStack = new ArrayList<>();
                operadoresStack.addAll(operadores);

                while (!operadoresStack.isEmpty()) {
                    char operador = operadoresStack.remove(operadoresStack.size() - 1);
                    double numero2 = numerosStack.remove(numerosStack.size() - 1);
                    double numero1 = numerosStack.remove(numerosStack.size() - 1);
                    double resultado = 0;

                    switch (operador) {
                        case '+':
                            resultado = numero1 + numero2;
                            break;
                        case '-':
                            resultado = numero1 - numero2;
                            break;
                        case '*':
                            resultado = numero1 * numero2;
                            break;
                        case '/':
                            resultado = numero1 / numero2;
                            break;
                        default:
                            throw new IllegalArgumentException("Operador inválido: " + operador);
                    }

                    numerosStack.add(resultado);
                }
                ResultadoFinal = numerosStack.get(0).toString();

                return ResultadoFinal;
        }
    }

}
