package ar.edu.utn.frba.dds.models;

public class PropuestaQuitado extends Propuesta {
  private Prenda prenda;

  public PropuestaQuitado(Prenda prenda) {
    this.prenda = prenda;
  }

  @Override
  protected void realizarAceptacionEn(Guardarropa guardarropas) {
    guardarropas.quitarPrenda(this.prenda);
  }

  @Override
  protected void deshacerEn(Guardarropa guardarropas) {
    guardarropas.agregarPrenda(this.prenda);
  }
}
