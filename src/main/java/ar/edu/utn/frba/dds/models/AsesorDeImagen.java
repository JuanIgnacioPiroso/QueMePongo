package ar.edu.utn.frba.dds.models;

import java.util.List;

public class AsesorDeImagen {
  private ServicioMeteorologicoAccuWeather servicioMeteorologico;

  public Prenda sugerirPrenda(String direccion, MotorSugerenciasBasico motorSugerencias){
    EstadoDelTiempo estadoDelTiempo = servicioMeteorologico.getCondicionesClimaticas(direccion);
    //List<Prenda> combinaciones = motorSugerencias.generarSugerencias(new Usuario());
    //return combinaciones.stream().filter(prenda -> prenda.esAptaParaTemperatura(estadoDelTiempo.getTemperatura())).findFirst().get();
    return null;
  }

}
