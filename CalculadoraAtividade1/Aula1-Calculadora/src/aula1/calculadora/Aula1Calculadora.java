/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1.calculadora;

import java.util.Scanner;



/**
 *
 * @author Windows10
 */
public class Aula1Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int result;
        int valor1 = 0;
        int valor2 = 0;
        int opt;
        int loop = 1;
        int i;
        
        do{
            System.out.println("-------------------------------------------------------");
            System.out.println("Escolha uma das opcoes abaixo :");
            System.out.println("1 - Soma de 2 Valores");
            System.out.println("2 - Subtracao de 2 valores");
            System.out.println("3 - Divisao de 2 valores");
            System.out.println("4 - Multiplicacao de 2 valores");
            System.out.println("0 - Para sair");
            System.out.print("Digite sua opção :");
            opt = teclado.nextInt();
            System.out.println("-------------------------------------------------------");


            switch(opt){
                    case 0 :
                    System.exit(0);
                    break;

                case 1 :
                    System.out.println("Digite o valor 1 :");
                      valor1 = teclado.nextInt();
                    System.out.println("Digite o valor 2 :");
                      valor2 = teclado.nextInt();

                    result = valor1 + valor2;
                    System.out.println("A soma dos valores e :" + result);
                    break;


                case 2 :
                    System.out.println("Digite o valor 1 :");
                      valor1 = teclado.nextInt();
                    System.out.println("Digite o valor 2 :");
                      valor2 = teclado.nextInt();

                    result = valor1 - valor2;
                    System.out.println("A subtracao dos valores e :" + result);
                    break;

                case 3 : 
                    System.out.println("Digite o valor 1 :");
                      valor1 = teclado.nextInt();
                    System.out.println("Digite o valor 2 :");
                      valor2 = teclado.nextInt();

                    result = valor1 / valor2;
                    System.out.println("A Divisao dos valores e :" + result);
                    break;
                case 4 :
                    System.out.println("Digite o valor 1 :");
                      valor1 = teclado.nextInt();
                    System.out.println("Digite o valor 2 :");
                      valor2 = teclado.nextInt();

                    result = valor1 * valor2;
                    System.out.println("A multiplicação dos valores e :" + result);
                    break;
                
                default :
                    System.out.print("\r\n");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Você não escolheu a uma opção valida, tente novamente !");
                    System.out.println("-------------------------------------------------------");
                    


            }
         }while (loop == 1);
    }
}
