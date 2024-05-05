/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lavictoria;

import java.sql.SQLException;
import javax.swing.JComboBox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author 11a10
 */
public class IngredientesNecesariosTest {

    IngredientesNecesarios ingredientes;

    public IngredientesNecesariosTest() throws SQLException {
        ingredientes = new IngredientesNecesarios(null, false);
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws SQLException {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMasProducto() throws SQLException {
        String nProducto = "Hamburguesa de chorizo";
        //String nProducto = "Papas gajo";
        System.out.println("masProducto");
        ingredientes.masProducto(nProducto);
        assertTrue(ingredientes.tIn.getRowCount() > 0);
    }

    @Test
    public void UnProductoValido() throws SQLException {
        System.out.println("unProducto");
        String nProducto = "Papas gajo";
        ingredientes.unProducto(nProducto);

        System.out.println("ingredientes");
        ingredientes.ingredientes();
        assertTrue(ingredientes.tIn.getRowCount() > 0);
    }

    @Test
    public void UnProductoNoValido() throws SQLException {
        System.out.println("un producto no valido");
        String nProducto = "Cereal con leche deslactosada";
        ingredientes.unProducto(nProducto);
    }

}
