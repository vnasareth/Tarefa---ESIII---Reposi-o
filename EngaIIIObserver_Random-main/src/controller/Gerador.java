package controller;

public class Gerador implements IObservavel {
  Verificador verificador;

  public Gerador(Verificador verificador) {
    this.verificador = verificador;
  }

  @Override
  public void notify(int num) {
    this.verificador.update(num);
  }

  public void generateNumber() {
    int random = (int) (Math.random() * (1000 - 1 + 1) + 1);
    this.notify(random);
  }

}
