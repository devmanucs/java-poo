public class ContaCorrente extends Conta {
    private final double limite;

    public ContaCorrente(int numero, String titular, double saldoInicial, double limite) {
        super(numero, titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        validarValor(valor);

        if (valor > saldo + limite) {
            return false;
        }

        saldo -= valor;
        return true;
    }

    public double getLimite() {
        return limite;
    }
}
