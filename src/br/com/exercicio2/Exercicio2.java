package br.com.exercicio2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

  public static void main(String[] args) {
    int opcao;
    String nome, cpf, data, horario;
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    do {
      System.out
          .println("----------------------------------------------------------------------------------------------");
      System.out.print("1 - Cadastrar Passageiro \n2 - Check In \n3 - Cancelar Voo \n4 - Sair");
      opcao = scan.nextInt();
      scan = new Scanner(System.in);

      switch (opcao) {
        case 1:
          System.out.println("Entre com o nome do passageiro: ");
          nome = scan.nextLine();
          System.out.println("Entre com o CPF do passageiro: ");
          cpf = scan.nextLine();
          System.out.println("Entre com o data do Voo: ");
          data = scan.nextLine();
          System.out.println("Entre com o horario do Voo: ");
          horario = scan.nextLine();
          System.out.println("Cadastrado efetuado com sucesso! Voo Numero: " + rand.nextInt(999));
          break;

        case 2:
          System.out.println("Entre com o CPF do passageiro: ");
          nome = scan.nextLine();
          System.out.println("Entre com o numero do Voo: ");
          cpf = scan.nextLine();
          System.out.println("Check in realizado com sucesso!");
          break;

        case 3:
          System.out.println("Entre com o CPF do passageiro: ");
          nome = scan.nextLine();
          System.out.println("Entre com o numero do Voo: ");
          cpf = scan.nextLine();
          System.out.println("Voo Cancelado com sucesso!");
          break;

        case 4:
          System.out.println("Encerrando o sistema!");
          break;

        default:
          System.out.println("Opcao invalida!");
          System.out.println(
              "----------------------------------------------------------------------------------------------");
      }
    } while (opcao != 4);
  }
}