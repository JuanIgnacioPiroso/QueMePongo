package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Estado;
import ar.edu.utn.frba.dds.interfaces.IPropuestaModificacion;

public class PropuestaAgregar extends Propuesta {
  private Prenda prenda;

  public PropuestaAgregar(Prenda prenda) {
    this.prenda = prenda;
  }

  @Override
  protected void realizarAceptacionEn(Guardarropa guardarropas) {
    this.estado = Estado.ACEPTADA;
    guardarropas.agregarPrenda(this.prenda);
  }

  @Override
  protected void deshacerEn(Guardarropa guardarropas) {
    this.estado = Estado.RECHAZADA;
    guardarropas.quitarPrenda(this.prenda);
  }
}
