package ar.edu.utn.frba.dds.models;

import static java.util.Objects.requireNonNull;

import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.enums.Formalidad;
import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.enums.Trama;
import java.awt.Color;
import java.util.Optional;

public class Prenda {

  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Trama trama;
  private Color colorPrincipal;
  private Optional<Color> colorSecundario;
  private Formalidad formalidad;
  private int temperaturaMaxima;

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Trama trama, Color colorPrincipal,
                Optional<Color> colorSecundario, Formalidad formalidad, int temperaturaMaxima) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.formalidad = formalidad;
    this.temperaturaMaxima = temperaturaMaxima;
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

  public Trama getTrama() {
    return trama;
  }

  public Formalidad getFormalidad() {
    return formalidad;
  }

  public boolean esAptaParaTemperatura(int temperatura) {
    return temperatura <= this.temperaturaMaxima;
  }
}

