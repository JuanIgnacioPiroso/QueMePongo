package ar.edu.utn.frba.dds.interfaces;

import ar.edu.utn.frba.dds.models.Sugerencia;
import ar.edu.utn.frba.dds.models.Usuario;
import java.util.List;

public interface MotorSugerencias {
  List<Sugerencia> generarSugerencias(Usuario usuario);
}
