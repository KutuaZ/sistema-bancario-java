package west_bank_ejec;


import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarPorRut(String rut) {
        for (Cliente c : clientes) {
            if (c.getRut().equalsIgnoreCase(rut)) {
                return c;
            }
        }
        return null;
    }
    
    public CuentaBancaria buscarCuenta(int numeroCuenta) {
        for (Cliente c : clientes) {
            if (c.getCuenta().getNumeroCuenta() == numeroCuenta) {
                return c.getCuenta();
            }
        }
        return null;
    }

    public boolean transferir(int origen, int destino, long monto) {
        CuentaBancaria cOrigen = buscarCuenta(origen);
        CuentaBancaria cDestino = buscarCuenta(destino);
        if (cOrigen == null || cDestino == null || monto <= 0 || cOrigen.getSaldo() < monto) {
            return false;
        }
        cOrigen.girar(monto);
        cDestino.depositar(monto);
        return true;
    }
}    
    
    
    
    
    
