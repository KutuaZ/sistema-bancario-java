package west_bank_ejec;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(int numeroCuenta) {
        super(numeroCuenta);
    }

    @Override
    public String tipoCuenta() {
        return "Cuenta Corriente";
    }
}