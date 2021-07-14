package com.example.inheritance;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {

    List<String> beneficiosPF = new ArrayList<>();
    beneficiosPF.add("plano de saúde");
    beneficiosPF.add("VR");
    beneficiosPF.add("Férias");

    List<String> beneficiosPJ = new ArrayList<>();
    beneficiosPJ.add("plano de saúde");

    Empresa ifpi = new Empresa("IFPI");

    Funcionario rafael;
    Funcionario romulo;
    try {
      rafael = new PessoaFisica("12345678901", "Rafael", 5000, beneficiosPF);
      romulo = new PessoaJuridica("12345678901234", "Romulo", 5000, beneficiosPJ);
      ifpi.adicionaFuncionario(rafael);
      ifpi.adicionaFuncionario(romulo);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("Empresa: " + ifpi.getNome());

    for (Funcionario f : ifpi.getFuncionarios()) {
      System.out.print("Identificador: " + f.getIdentificador() + " - ");
      System.out.print("Nome: " + f.getNome() + " - ");
      System.out.print("Salário bruto: " + f.getSalario() + " - ");
      System.out.print("Salário Liquido: " + f.getSalarioLiquido() + " - ");
      System.out.println("Beneficios: " + f.getBeneficios());
    }
  }
}
