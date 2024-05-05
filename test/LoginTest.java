import java.sql.SQLException;
import lavictoria.Login;
import org.junit.Test;


public class LoginTest {
    
    public LoginTest() {
    }

    // Este método de prueba verifica que el método de inicio de sesión funcione correctamente

    /**
     *
     * @throws SQLException
     */
    @Test
    public void testLogin() throws SQLException {
        // Crear una instancia de Login
        Login login = new Login(null, true);
        
        // Configurar el estado inicial (si es necesario)
        
        // Simular la interacción del usuario ingresando un nombre de usuario y contraseña
        login.usuarioC.setText("admin");
        login.contraseñaC.setText("123");
        
        // Llamar al método de inicio de sesión
       login.entrarBActionPerformed(null);
        
        // Verificar el resultado esperado
        // Por ejemplo, puedes verificar si se abre la ventana correcta después del inicio de sesión
       // assertEquals("Resultado esperado", login.getResultadoEsperado());
    }
}
