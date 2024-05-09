package ar.edu.utn.frba.dds.models;

import java.util.List;

public class Atuendo {

  private List<Prenda> prendas;

  public void generarAtuendo(List<Prenda> prendas) {
    if (prendas.size() < 3) {
      throw new IllegalArgumentException("El atuendo debe tener al menos 3 prendas");
    }
    this.prendas = prendas;
  }
}
