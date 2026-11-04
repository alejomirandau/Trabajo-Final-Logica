import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionH2 {
    private static final String URL = "jdbc:h2:~/restaurante";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos: " + e.getMessage());
            return null;
        }
    }
    
    // Ejemplo de inserción
    public static void guardarPlato(Plato plato) {
        String sql = "INSERT INTO Plato (nombre, precio) VALUES (?, ?)";
        try (Connection conn = conectar(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            if (conn != null) {
                pstmt.setString(1, plato.obtenerDetalles());
                pstmt.setFloat(2, plato.getPrecio());
                System.out.println("Plato guardado en base de datos correctamente.");
            }
            
        } catch (Exception e) {
            System.out.println("Debes crear la tabla primero.");
        }
    }
}