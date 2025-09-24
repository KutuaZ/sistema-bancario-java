
package west_bank_ejec;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = ConexionBD.conectar();
        if (conn != null) {
            System.out.println(" Conectado correctamente.");
        } else {
            System.out.println(" No se pudo conectar.");
        }
    }
}    
    
