package ar.edu.utn.frba.dds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ar.edu.utn.frba.dds.interfaces.Categoria;
import ar.edu.utn.frba.dds.models.Prenda;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class PrendaTest {

  // Como usuarie de QueMePongo, quiero especificar que tipo de prenda estoy cargando.
  @Test
  public void testTipoDePrenda() {
     Prenda prenda = new Prenda("Remera", Categoria.Parte_Superior, "Algodon", "Blanco", Optional.empty());
     assertEquals("Remera", prenda.getTipoDePrenda());
  }

  // Como usuarie de QueMePongo, quiero identificar a que categoria pertenece una prenda
  @Test
  public void testCategoriaDeUnaPrenda() {
    Prenda prenda = new Prenda("Remera", Categoria.Parte_Superior, "Algodon", "Blanco", Optional.empty());
    assertEquals(Categoria.Parte_Superior, prenda.getCategoria());
  }

  // Como usuarie de QueMePongo, quiero saber de que material o tela esta hecha una prenda
  @Test
  public void testMaterialDeUnaPrenda() {
    Prenda prenda = new Prenda("Remera", Categoria.Parte_Superior, "Algodon", "Blanco", Optional.empty());
    assertEquals("Algodon", prenda.getMaterial());
  }

  // Como usuarie de QueMePongo, quiero poder indicar un color principal para mis prendas
  @Test
  public void testColorPrincipalDeUnaPrenda() {
    Prenda prenda = new Prenda("Remera", Categoria.Parte_Superior, "Algodon", "Blanco", Optional.empty());
    assertEquals("Blanco", prenda.getColorPrincipal());
  }

  // Como usuarie de QueMePongo, quiero poder indicar un color secundario (si existe) para mis prendas
  @Test
  public void testColorSecundarioDeUnaPrenda(){
    Prenda prenda = new Prenda("Remera", Categoria.Parte_Superior, "Algodon", "Blanco", Optional.of("Rojo"));
    assertEquals("Rojo", prenda.getColorSecundario().get());
  }

  // Como usuarie de QueMePongo, quiero evitar que haya prendas sin tipo, tela, categoria o color primario
  @Test
  public void testPrendaSinTipo() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      Prenda prenda = new Prenda(null, Categoria.Parte_Superior, "Algodon", "Blanco", Optional.empty());
    });
    assertEquals("El tipo de prenda no puede ser nulo", exception.getMessage());
  }





}
