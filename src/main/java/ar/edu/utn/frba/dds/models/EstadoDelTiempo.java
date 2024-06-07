package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Humedad;

public class EstadoDelTiempo {
  private int temperatura;
  private Humedad humedad;

  public EstadoDelTiempo(int temperatura, Humedad humedad) {
    this.temperatura = temperatura;
    this.humedad = humedad;
  }

  public int getTemperatura() {
    return temperatura;
  }
}
