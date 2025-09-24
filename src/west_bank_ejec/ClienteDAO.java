
package west_bank_ejec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO {
    
    public Cliente buscarPorRut(String rut) {
        Connection conn = ConexionBD.conectar();
        if (conn == null) return null;

        Cliente cliente = null;
        try {
            String sql = "SELECT c.rut, c.nombre, c.apellido_paterno, c.apellido_materno, c.domicilio, c.comuna, c.telefono, c.tipo_cuenta, " +
                         "cb.numero_cuenta, cb.saldo, cb.tipo FROM cliente c JOIN cuenta_bancaria cb ON c.numero_cuenta = cb.numero_cuenta " +
                         "WHERE c.rut = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, rut);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int numCuenta = rs.getInt("numero_cuenta");
                long saldo = rs.getLong("saldo");
                String tipo = rs.getString("tipo");

                CuentaBancaria cuenta;
                if ("Cuenta Corriente".equalsIgnoreCase(tipo)) {
                    cuenta = new CuentaCorriente(numCuenta);
                } else {
                    cuenta = new CuentaAhorro(numCuenta);
                }
                cuenta.depositar(saldo);

                cliente = new Cliente(
                    rs.getString("rut"),
                    rs.getString("nombre"),
                    rs.getString("apellido_paterno"),
                    rs.getString("apellido_materno"),
                    rs.getString("domicilio"),
                    rs.getString("comuna"),
                    rs.getInt("telefono"),
                    rs.getString("tipo_cuenta"),
                    cuenta
                );
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cliente;
    }

    public boolean guardarCliente(Cliente cliente) {
        Connection conn = ConexionBD.conectar();
        if (conn == null) return false;

        try {
            // Guardar cuenta primero
            String sqlCuenta = "INSERT INTO cuenta_bancaria (numero_cuenta, saldo, tipo) VALUES (?, ?, ?)";
            PreparedStatement psCuenta = conn.prepareStatement(sqlCuenta);
            psCuenta.setInt(1, cliente.getCuenta().getNumeroCuenta());
            psCuenta.setLong(2, cliente.getCuenta().getSaldo());
            psCuenta.setString(3, cliente.getCuenta().tipoCuenta());
            psCuenta.executeUpdate();

            // Guardar cliente
            String sqlCliente = "INSERT INTO cliente (rut, nombre, apellido_paterno, apellido_materno, domicilio, comuna, telefono, tipo_cuenta, numero_cuenta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psCliente = conn.prepareStatement(sqlCliente);
            psCliente.setString(1, cliente.getRut());
            psCliente.setString(2, cliente.getNombre());
            psCliente.setString(3, cliente.getApellidoPaterno());
            psCliente.setString(4, cliente.getApellidoMaterno());
            psCliente.setString(5, cliente.getDomicilio());
            psCliente.setString(6, cliente.getComuna());
            psCliente.setInt(7, cliente.getTelefono());
            psCliente.setString(8, cliente.getTipoCuenta());
            psCliente.setInt(9, cliente.getCuenta().getNumeroCuenta());
            psCliente.executeUpdate();

            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
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
    
public Cliente buscarPorNumeroCuenta(int numeroCuenta) {
    Connection conn = ConexionBD.conectar();
    if (conn == null) return null;

    Cliente cliente = null;
    try {
        String sql = "SELECT c.rut, c.nombre, c.apellido_paterno, c.apellido_materno, c.domicilio, c.comuna, c.telefono, c.tipo_cuenta, " +
                     "cb.numero_cuenta, cb.saldo, cb.tipo FROM cliente c JOIN cuenta_bancaria cb ON c.numero_cuenta = cb.numero_cuenta " +
                     "WHERE cb.numero_cuenta = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, numeroCuenta);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int numCuenta = rs.getInt("numero_cuenta");
            long saldo = rs.getLong("saldo");
            String tipo = rs.getString("tipo");

            CuentaBancaria cuenta;
            if ("Cuenta Corriente".equalsIgnoreCase(tipo)) {
                cuenta = new CuentaCorriente(numCuenta);
            } else {
                cuenta = new CuentaAhorro(numCuenta);
            }
            cuenta.depositar(saldo);

            cliente = new Cliente(
                rs.getString("rut"),
                rs.getString("nombre"),
                rs.getString("apellido_paterno"),
                rs.getString("apellido_materno"),
                rs.getString("domicilio"),
                rs.getString("comuna"),
                rs.getInt("telefono"),
                rs.getString("tipo_cuenta"),
                cuenta
            );
        }
        rs.close();
        ps.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return cliente;
}
}

