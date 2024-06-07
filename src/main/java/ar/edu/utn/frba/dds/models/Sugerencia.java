package ar.edu.utn.frba.dds.models;

public class Sugerencia {
  Prenda superior;
  Prenda inferior;
  Prenda calzado;

  public Sugerencia(Prenda superior, Prenda inferior, Prenda calzado) {
    this.superior = superior;
    this.inferior = inferior;
    this.calzado = calzado;
  }
}
