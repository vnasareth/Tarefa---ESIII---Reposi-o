package view;

import controller.Gerador;
import controller.Verificador;

public class Principal {
  public static void main(String[] args) {
    Verificador verificador = new Verificador();
    Gerador gerador = new Gerador(verificador);

    gerador.generateNumber();
    gerador.generateNumber();
    gerador.generateNumber();
    gerador.generateNumber();
    gerador.generateNumber();
    gerador.generateNumber();
    gerador.generateNumber();
  }
}