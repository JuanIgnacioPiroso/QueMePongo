package ar.edu.utn.frba.dds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ar.edu.utn.frba.dds.enums.Categoria;
import ar.edu.utn.frba.dds.enums.Material;
import ar.edu.utn.frba.dds.models.TipoDePrenda;
import ar.edu.utn.frba.dds.models.Prenda;
import java.awt.*;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class PrendaTest {

  // Como usuarie de QueMePongo, quiero especificar que tipo de prenda estoy cargando.
  @Test
  public void testTipoDePrenda() {
    Prenda prenda = new Prenda(TipoDePrenda.REMERA, Material.ALGODON, new Color(15, 2, 5), Optional.empty());
    assertEquals(TipoDePrenda.REMERA, prenda.getTipoDePrenda());
  }

  // Como usuarie de QueMePongo, quiero identificar a que categoria pertenece una prenda.
  @Test
  public void testUnaPrendaRemeraEsDeCategoriaParteSuperior() {
    Prenda prenda = new Prenda(TipoDePrenda.REMERA, Material.ALGODON, new Color(15, 2, 5), Optional.empty());
    assertEquals(Categoria.PARTE_SUPERIOR, prenda.getCategoria());
  }

  // Como usuarie de QueMePongo, quiero poder indicar de que tela o material es una prenda.
  @Test
  public void testMaterialDePrenda() {
    Prenda prenda = new Prenda(TipoDePrenda.REMERA, Material.ALGODON, new Color(15, 2, 5), Optional.empty());
    assertEquals(Material.ALGODON, prenda.getMaterial());
  }

  // Como usuarie de QueMePongo, quiero poder indiccar un color principal para una prenda.
  @Test
  public void testColorPrincipalDePrenda() {
    Prenda prenda = new Prenda(TipoDePrenda.REMERA, Material.ALGODON, new Color(15, 2, 5), Optional.empty());
    assertEquals(new Color(15, 2, 5), prenda.getColorPrincipal());
  }

  // Como usuarie de QueMePongo, quiero poder indicar, si existe, un color secundario para una prenda.
  @Test
  public void testColorSecundarioDePrenda() {
    Prenda prenda = new Prenda(TipoDePrenda.REMERA, Material.ALGODON, new Color(15, 2, 5), Optional.of(new Color(15, 2, 5)));
    assertEquals(Optional.of(new Color(15, 2, 5)), prenda.getColorSecundario());
  }

  // Como usuarie de QueMePongo, quiero evitar que haya prendas sin tipo, material, categoria o color principal.
  @Test
  public void testPrendaSinTipo() {
    assertThrows(NullPointerException.class, () -> new Prenda(null, Material.ALGODON, new Color(15, 2, 5), Optional.empty()));
  }

  // Como usuarie de QueMePongo, quiero evitar que haya prendas cuya categoria no se condiga con su tipo (Ej: Una remera no puede ser de categoria calzado)
  @Test
  public void testPrendaConCategoriaIncorrecta() {
    Prenda prenda = new Prenda(TipoDePrenda.REMERA, Material.ALGODON, new Color(15, 2, 5), Optional.empty());
    assertNotEquals(Categoria.CALZADO, prenda.getCategoria());
  }






}
