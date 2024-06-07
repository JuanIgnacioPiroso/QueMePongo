package ar.edu.utn.frba.dds.interfaces;

import ar.edu.utn.frba.dds.models.EstadoDelTiempo;

public interface IServicioMeteorologico {
  EstadoDelTiempo getCondicionesClimaticas(String direccion);
}
