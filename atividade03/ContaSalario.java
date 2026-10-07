public class ContaSalario extends Conta {
    private final int limiteSaques;
    private int saquesRealizados;

    public ContaSalario(int numero, String titular, double saldoInicial, int limiteSaques) {
        super(numero, titular, saldoInicial);
        this.limiteSaques = limiteSaques;
    }

    @Override
    public boolean sacar(double valor) {
        validarValor(valor);

        if (saquesRealizados >= limiteSaques || valor > saldo) {
            return false;
        }

        saldo -= valor;
        saquesRealizados++;
        return true;
    }

    public int getSaquesDisponiveis() {
        return limiteSaques - saquesRealizados;
    }
}
