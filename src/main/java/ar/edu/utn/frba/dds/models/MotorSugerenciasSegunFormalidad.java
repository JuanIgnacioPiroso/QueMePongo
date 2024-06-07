package ar.edu.utn.frba.dds.models;

import ar.edu.utn.frba.dds.enums.Formalidad;
import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.interfaces.MotorSugerencias;
import java.util.List;
import java.util.stream.Collectors;

public class MotorSugerenciasSegunFormalidad implements MotorSugerencias {


  List<Prenda> getPrendasValidas(Usuario usuario) {
    return usuario.getEdad() > 55 ? usuario.getPrendas().stream().filter
            (prenda -> !prenda.getFormalidad().equals(Formalidad.INFORMAL))
        .collect(Collectors.toList()) : usuario.getPrendas();
  }

  @Override
  public List<Sugerencia> generarSugerencias(Usuario usuario) {
    List<Prenda> prendasSuperiores = this.getPrendasValidas(usuario).stream().filter
        (prenda -> prenda.getCategoria().equals(Categoria.PARTE_SUPERIOR)).toList();
    List<Prenda> prendasInferiores = this.getPrendasValidas(usuario).stream().filter
        (prenda -> prenda.getCategoria().equals(Categoria.PARTE_INFERIOR)).toList();
    List<Prenda> calzados = this.getPrendasValidas(usuario).stream().filter
        (prenda -> prenda.getCategoria().equals(Categoria.CALZADO)).toList();

    //List<List<Prenda>> combinaciones = Lists.cartesianProduct(prendasSuperiores, prendasInferiores, calzados);

    //return combinaciones.stream().map(combinacion -> new Sugerencia(combinacion.get(0), combinacion.get(1), combinacion.get(2)).toList());
    return null;
  }
}
