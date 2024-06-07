package ar.edu.utn.frba.dds.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public class RespuestaAccuWeather {
  LocalDate expiracion;
  Map<String, Object> estadoDelTiempo;

  public RespuestaAccuWeather(LocalDate expiracion, Map<String, Object> estadoDelTiempo) {
    this.expiracion = expiracion;
    this.estadoDelTiempo = estadoDelTiempo;
  }

  public boolean expiro(){
    return this.expiracion.isAfter(LocalDate.now());

  }


  public LocalDate getExpiracion() {
    return expiracion;
  }

  public Map<String, Object> getEstadoDelTiempo() {
    return estadoDelTiempo;
  }
}
