package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Estado;
import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa {
  List<Prenda> prendas;
  List<Propuesta> propuestas;


  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

  public List<Propuesta> getPropuestasDeModificacionPendientes(List<Propuesta> propuestas) {
    return propuestas.stream().filter(propuesta -> propuesta.getEstado().equals(Estado.PENDIENTE))
        .collect(Collectors.toList());

  }
}
