package ar.edu.utn.frba.dds.models;
import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.interfaces.IMotorSugerencias;
import java.util.List;

public class MotorSugerenciasBasico implements IMotorSugerencias {


  @Override
  public List<Sugerencia> generarSugerencias(Usuario usuario) {

    List<Prenda> prendasSuperiores = usuario.getPrendas().stream().filter
        (prenda -> prenda.getCategoria().equals(Categoria.PARTE_SUPERIOR)).toList();
    List<Prenda> prendasInferiores = usuario.getPrendas().stream().filter
        (prenda -> prenda.getCategoria().equals(Categoria.PARTE_INFERIOR)).toList();
    List<Prenda> calzados = usuario.getPrendas().stream().filter
        (prenda -> prenda.getCategoria().equals(Categoria.CALZADO)).toList();

    //List<List<Prenda>> combinaciones = Lists.cartesianProduct(prendasSuperiores, prendasInferiores, calzados);

    //return combinaciones.stream().map(combinacion -> new Sugerencia(combinacion.get(0), combinacion.get(1), combinacion.get(2)).toList());
    return null;
  }
}
