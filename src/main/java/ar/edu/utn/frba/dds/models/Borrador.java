package ar.edu.utn.frba.dds.models;

import static java.util.Objects.requireNonNull;

import ar.edu.utn.frba.dds.enums.Formalidad;
import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.enums.Trama;
import java.awt.*;
import java.util.Optional;

public class Borrador {

  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Trama trama = Trama.LISA;
  private Color colorPrincipal;
  private Optional<Color> colorSecundario;

  public Borrador(TipoDePrenda tipoDePrenda) {
    requireNonNull(tipoDePrenda, "Debe especificar un tipo de prenda");
    this.tipoDePrenda = tipoDePrenda;
  }

  public void especificarMaterial(Material material) {
    requireNonNull(material, "Debe especificar un material");
    this.material = material;
  }

  public void especificarColorPrincipal(Color colorPrincipal) {
    requireNonNull(colorPrincipal, "Debe especificar un color principal");
    this.colorPrincipal = colorPrincipal;
  }

  public void especificarTrama(Trama trama) {
    requireNonNull(trama, "Debe especificar una trama");
    this.trama = trama;
  }

  public void especificarColorSecundario(Color colorSecundario) {
    this.colorSecundario = Optional.ofNullable(colorSecundario);
  }

  public Prenda crearPrenda() {
    return new Prenda(tipoDePrenda, material, trama, colorPrincipal, colorSecundario, Formalidad.FORMAL,20);
  }


}
