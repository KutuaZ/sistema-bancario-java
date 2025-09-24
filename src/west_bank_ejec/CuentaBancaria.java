package west_bank_ejec;

public abstract class CuentaBancaria {
    protected int numeroCuenta;
    protected long saldo;

    public CuentaBancaria(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void depositar(long monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public boolean girar(long monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public abstract String tipoCuenta();
}
