import java.util.List;

public class BuscarConta extends Conta{
    public static Conta buscarContaPorSenha(List<Conta> contas, int agencia, int numeroConta, int senha) {
        for (Conta conta : contas) {
            if (conta.getSenha() == senha && conta.getAgencia() == agencia  && conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}