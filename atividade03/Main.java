import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(101, "Ana", 1_000.00, 500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(102, "Bruno", 2_000.00, 0.01);
        ContaSalario contaSalario = new ContaSalario(103, "Carla", 1_500.00, 2);

        contaCorrente.sacar(1_200.00);
        contaPoupanca.aplicarRendimento();
        contaSalario.sacar(300.00);

        List<Conta> contas = List.of(contaCorrente, contaPoupanca, contaSalario);

        System.out.println("=== Contas bancarias ===");
        for (Conta conta : contas) {
            System.out.println(conta);
        }

        System.out.println("Saques disponiveis na conta salario: "
                + contaSalario.getSaquesDisponiveis());
    }
}
