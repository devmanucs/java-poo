public abstract class Conta {
    private final int numero;
    private final String titular;
    protected double saldo;

    public Conta(int numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        validarValor(valor);
        saldo += valor;
    }

    public abstract boolean sacar(double valor);

    protected void validarValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return String.format("%s | Conta: %d | Titular: %s | Saldo: R$ %.2f",
                getClass().getSimpleName(), numero, titular, saldo);
    }
}
