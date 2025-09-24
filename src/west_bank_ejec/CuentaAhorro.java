package west_bank_ejec;

public class CuentaAhorro extends CuentaBancaria {
    public CuentaAhorro(int numeroCuenta) {
        super(numeroCuenta);
    }

    @Override
    public String tipoCuenta() {
        return "Cuenta de Ahorro";
    }
}