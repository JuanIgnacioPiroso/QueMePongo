package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Estado;

public abstract class Propuesta {
  protected Estado estado;

  public void aceptarEn(Guardarropa guardarropas) {
    this.estado = Estado.ACEPTADA;
    this.realizarAceptacionEn(guardarropas);
  }

  public void rechazar() {
    this.estado = Estado.RECHAZADA;
  }

  protected abstract void realizarAceptacionEn(Guardarropa guardarropas);

  protected abstract void deshacerEn(Guardarropa guardarropas);


  public Estado getEstado() {
    return this.estado;
  }
}