package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Categoria;

public class TipoDePrenda {

  Categoria categoria;

  public static final TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static final TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);
  public static final TipoDePrenda POLLERA = new TipoDePrenda(Categoria.PARTE_INFERIOR);
  public static final TipoDePrenda CAMISA_MANGA_CORTA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static final TipoDePrenda BLUSA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static final TipoDePrenda ZAPATOS = new TipoDePrenda(Categoria.CALZADO);

  public TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return this.categoria;
  }


}
