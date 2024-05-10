package ar.edu.utn.frba.dds.models;

import static java.util.Objects.requireNonNull;

import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.enums.Material;
import java.awt.*;
import java.util.Optional;

public class Prenda {


  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Color colorPrincipal;
  private Optional<Color> colorSecundario;

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, Optional<Color> colorSecundario) {
    this.tipoDePrenda = requireNonNull(tipoDePrenda, "Debe especificar un tipo de prenda");
    this.material = requireNonNull(material, "Debe especificar un material");
    this.colorPrincipal = requireNonNull(colorPrincipal, "Debe especificar un color principal");
    this.colorSecundario = colorSecundario;
  }

  public TipoDePrenda getTipoDePrenda() {
    return tipoDePrenda;
  }

  public Categoria getCategoria() {
    return tipoDePrenda.getCategoria();
  }

  public Material getMaterial() {
    return material;
  }

  public Color getColorPrincipal() {
    return colorPrincipal;
  }

  public Optional<Color> getColorSecundario() {
    return colorSecundario;
  }
}
