package ar.edu.utn.frba.dds.models;

import static java.util.Objects.requireNonNull;

import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.enums.Material;
import java.awt.Color;
import java.util.Optional;

public class Prenda {

  private TipoDePrenda tipoDePrenda; // Primera Iteracion
  private Material material; // Primera Iteracion
  private Color colorPrincipal; // Primera Iteracion
  private Optional<Color> colorSecundario; // Primera Iteracion

  public Prenda(TipoDePrenda tipoDePrenda,
                Material material, Color colorPrincipal,
                Optional<Color> colorSecundario) {
    this.tipoDePrenda = requireNonNull(tipoDePrenda, "Debe especificar un tipo de prenda");
    this.material = requireNonNull(material, "Debe especificar un material");
    this.colorPrincipal = requireNonNull(colorPrincipal, "Debe especificar un color principal");
    this.colorSecundario = colorSecundario;
  } // Primera Iteracion

  public TipoDePrenda getTipoDePrenda() {
    return tipoDePrenda;
  } // Primera Iteracion

  public Categoria getCategoria() {
    return tipoDePrenda.getCategoria();
  } // Primera Iteracion

  public Material getMaterial() {
    return material;
  } // Primera Iteracion

  public Color getColorPrincipal() {
    return colorPrincipal;
  } // Primera Iteracion

  public Optional<Color> getColorSecundario() {
    return colorSecundario;
  } // Primera Iteracion
}

