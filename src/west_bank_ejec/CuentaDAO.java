
package west_bank_ejec;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class CuentaDAO {
    
    public boolean actualizarSaldo(int numeroCuenta, long nuevoSaldo) {
        Connection conn = ConexionBD.conectar();
        if (conn == null) return false;

        try {
            String sql = "UPDATE cuenta_bancaria SET saldo = ? WHERE numero_cuenta = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, nuevoSaldo);
            ps.setInt(2, numeroCuenta);
            int filas = ps.executeUpdate();

            ps.close();
            conn.close();

            return filas > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
