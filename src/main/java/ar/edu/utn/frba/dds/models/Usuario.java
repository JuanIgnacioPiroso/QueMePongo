package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.interfaces.IMotorSugerencias;
import java.util.List;

public class Usuario {
  List<Prenda> prendas;
  Integer edad;
  IMotorSugerencias motorSugerencias;
  List<Guardarropa> guardarropas;

  public Usuario(List<Prenda> prendas, Integer edad, IMotorSugerencias motorSugerencias) {
    this.prendas = prendas;
    this.edad = edad;
    this.motorSugerencias = motorSugerencias;
  }

  List<Sugerencia> generarSugerencias() {
    return motorSugerencias.generarSugerencias(this);
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public Integer getEdad() {
    return edad;
  }

  public IMotorSugerencias getMotorSugerencias() {
    return motorSugerencias;
  }

  public void agregarGuardarropa(Guardarropa guardarropa) {
    guardarropas.add(guardarropa);
  }

  public void quitarGuardarropa(Guardarropa guardarropa) {
    guardarropas.remove(guardarropa);
  }
}
