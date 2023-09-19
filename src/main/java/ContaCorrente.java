import java.math.BigDecimal;

public class ContaCorrente extends Conta {



    private String chavePix;

   public ContaCorrente(int agencia, int numeroConta, int senha, Pessoa titular, String chavePix){
       super(agencia, numeroConta, senha);
       this.chavePix = chavePix;
   }

    public ContaCorrente(Pessoa pessoa, int agencia, int numeroConta, int senha, String chavePix) {
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal novoSaldo = getSaldo().add(valor);
            setSaldo(novoSaldo);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) > 0 && valor.compareTo(valor) <= 0) {
            BigDecimal novoSaldo = getSaldo().subtract(valor);
            setSaldo(novoSaldo);
            System.out.println("Saque de R$" + " realizado com sucesso");
        } else {
            System.out.println("Valor de saque acima de valor disponível em conta");
        }
    }
}

