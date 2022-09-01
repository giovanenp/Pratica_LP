package br.com.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) {
    String placa;
    int ano;
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a placa do veiculo:");
    placa = scan.nextLine();

    System.out.println("Digite o ano de fabricacao:");
    ano = scan.nextInt();

    if (ano <= 2010) {
      System.out.println("Carro Velho");
    } else if (ano <= 2021) {
      System.out.println("Carro Semi Novo");
    } else if (ano == 2022) {
      System.out.println("Carro Novo");
    } else {
      System.out.println("Lançamento");
    }

  }

}
