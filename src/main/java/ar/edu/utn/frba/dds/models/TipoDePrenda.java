package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Categoria;

public class TipoDePrenda {


  Categoria categoria; // Primera Iteracion

  public static final TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR); // Primera Iteracion
  public static final TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR); // Primera Iteracion
  public static final TipoDePrenda POLLERA = new TipoDePrenda(Categoria.PARTE_INFERIOR); // Primera Iteracion
  public static final TipoDePrenda CAMISA_MANGA_CORTA = new TipoDePrenda(Categoria.PARTE_SUPERIOR); // Primera Iteracion
  public static final TipoDePrenda BLUSA = new TipoDePrenda(Categoria.PARTE_SUPERIOR); // Primera Iteracion
  public static final TipoDePrenda ZAPATOS = new TipoDePrenda(Categoria.CALZADO); // Primera Iteracion

  public TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  } // Primera Iteracion

  public Categoria getCategoria() {
    return this.categoria;
  } // Primera Iteracion


}
