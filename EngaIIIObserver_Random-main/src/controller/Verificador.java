package controller;

public class Verificador implements IObservador {

  @Override
  public void update(int num) {
    if (isEven(num)) {
      System.out.println(num + " PAR ");
    } else {
      System.out.println(num + " IMPAR ");
    }
  }

  public boolean isEven(int num) {
    return num % 2 == 0;
  }

}
