package br.com.aula4.questao1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exemplo {

  private static int processar(int i) {

    try {

      if (i < 5) {

        return 5 / i;

      } else {

         return i * 5;

      }

    } catch (ArithmeticException e) {

      System.out.println("ArithmeticException");

    } finally {

      System.out.println("Finally");

    }

    return 0;

  }

 

  public static void main(String[] args) {

    System.out.println(processar(4));

    System.out.println(processar(10));

  }

}


