public class ContaPoupanca extends Conta {
    private final double taxaRendimento;

    public ContaPoupanca(int numero, String titular, double saldoInicial, double taxaRendimento) {
        super(numero, titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public boolean sacar(double valor) {
        validarValor(valor);

        if (valor > saldo) {
            return false;
        }

        saldo -= valor;
        return true;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
}
