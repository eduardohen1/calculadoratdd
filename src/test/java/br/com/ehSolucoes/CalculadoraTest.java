package br.com.ehSolucoes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import br.com.ehSolucoes.*;

public class CalculadoraTest {
   
   /*R01: Método de soma deve retornar um inteiro 
    *  com a soma de dois números inteiros 
    *  passados por parâmetro;*/
   @Test   
    public void testSoma(){
      Calculadora calc = new Calculadora();
      //validar uma igualdade
      assertEquals(calc.somar(1,1), 2);
      assertEquals(calc.somar(1,0), 1);
      assertEquals(calc.somar(9,-5), 4);
   }
   
   @Test
   public void testSubtrair(){
      /*R02: Método de subtração deve retornar um 
             inteiro com a subtração de dois números inteiros 
             passados por parâmetro
      */
      Calculadora calc = new Calculadora();
      assertEquals(calc.subtrair(1,1), 0);
      assertEquals(calc.subtrair(10,5), 5);
      assertEquals(calc.subtrair(5,-2), 7); //5 - (-2) =7
   }

   @Test(expected = ArithmeticException.class)
   public void testDivisao(){
      /*
         *R03: Método de divisão deve retornar um inteiro 
               contendo a divisão de dois inteiros
         *R04: Método de divisão deve retornar uma 
               Exception caso haja divisão por Zero;
      */
      Calculadora calc = new Calculadora();
      assertEquals(calc.dividir(3,3),1);
      assertTrue(calc.dividir(3,0) == 0);
   }

   @Test
   public void testMultiplicacao(){
      /*  R05: Método de multiplicação deve retornar um inteiro 
               contendo a multiplicação de dois inteiros.
      */
      Calculadora calc = new Calculadora();
      assertEquals(calc.multiplicar(3,2), 6);
      assertEquals(calc.multiplicar(1,5), 5);
      assertEquals(calc.multiplicar(3,3), 9);
   }

}
