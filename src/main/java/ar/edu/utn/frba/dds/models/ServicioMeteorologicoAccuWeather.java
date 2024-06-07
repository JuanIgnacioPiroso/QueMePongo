package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Humedad;
import ar.edu.utn.frba.dds.interfaces.IAccuWeatherAPI;
import ar.edu.utn.frba.dds.interfaces.IServicioMeteorologico;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements IServicioMeteorologico {
  private Map<String, RespuestaAccuWeather> ultimasRespuestas;
  IAccuWeatherAPI api;
  Duration periodoDeValidez;



  public ServicioMeteorologicoAccuWeather(Map<String, RespuestaAccuWeather> ultimasRespuestas, IAccuWeatherAPI api, Duration periodoDeValidez) {
    this.ultimasRespuestas = ultimasRespuestas;
    this.api = api;
    this.periodoDeValidez = periodoDeValidez;
  }

  @Override
  public EstadoDelTiempo getCondicionesClimaticas(String direccion) {
    if (!this.ultimasRespuestas.containsValue(direccion) || this.ultimasRespuestas.get(direccion).expiro()) {
      this.ultimasRespuestas.put
          (direccion, new RespuestaAccuWeather(LocalDate.now().plusDays(1),
          api.getWeather(direccion).get(0)));
    }
    return (EstadoDelTiempo) this.ultimasRespuestas.get(direccion).getEstadoDelTiempo();
  }

  private EstadoDelTiempo consultarApi(String direccion){
    Map<String, Object> respuesta = this.api.getWeather(direccion).get(0);
    int temperatura = (int) respuesta.get("Temperature");
    Humedad humedad = (Humedad) respuesta.get("Humidity");
    return new EstadoDelTiempo(temperatura, humedad);
  }
}
