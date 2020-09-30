package br.com.ehSolucoes;

public class Calculadora {

   /*R01: Método de soma deve retornar um inteiro 
    *  com a soma de dois números inteiros 
    *  passados por parâmetro;*/
   public int somar(int a, int b){
      return a+b;
   }

   /*R02: Método de subtração deve retornar um 
             inteiro com a subtração de dois números inteiros 
             passados por parâmetro
      */
   public int subtrair(int a, int b){
      return a - b;
   }

   /*
         *R03: Método de divisão deve retornar um inteiro 
               contendo a divisão de dois inteiros
         *R04: Método de divisão deve retornar uma 
               Exception caso haja divisão por Zero;
      */
   public int dividir(int a, int b){
      return a /b;
   }

   /*  R05: Método de multiplicação deve retornar um inteiro 
               contendo a multiplicação de dois inteiros.
      */
   public int multiplicar(int a, int b){
      return a*b;
   }
}
