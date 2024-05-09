package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.interfaces.Categoria;
import java.util.Optional;

public class Prenda {


  private String tipoDePrenda;
  private Categoria categoria;
  private String material;
  private String colorPrincipal;
  private Optional<String> colorSecundario;


  public Prenda(String tipoDePrenda, Categoria categoria, String material, String colorPrincipal, Optional<String> colorSecundario) {
    this.tipoDePrenda = validateNotNull(tipoDePrenda, "El tipo de prenda no puede ser nulo");
    this.categoria = validateNotNull(categoria, "La categoría no puede ser nula");
    this.material = validateNotNull(material, "El material no puede ser nulo");
    this.colorPrincipal = validateNotNull(colorPrincipal, "El color principal no puede ser nulo");
    this.colorSecundario = colorSecundario;
  }

  private static <T> T validateNotNull(T value, String errorMessage) {
    if (value == null) {
      throw new IllegalArgumentException(errorMessage);
    }
    return value;
  }

  public String getTipoDePrenda() {
    return tipoDePrenda;
  }

  public void setTipoDePrenda(String tipoDePrenda) {
    this.tipoDePrenda = tipoDePrenda;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getColorPrincipal() {
    return colorPrincipal;
  }

  public void setColorPrincipal(String colorPrincipal) {
    this.colorPrincipal = colorPrincipal;
  }

  public Optional<String> getColorSecundario() {
    return colorSecundario;
  }

  public void setColorSecundario(Optional<String> colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
}
