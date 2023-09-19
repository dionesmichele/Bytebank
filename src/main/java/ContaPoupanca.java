import java.math.BigDecimal;

public class ContaPoupanca extends Conta {



    public ContaPoupanca(Pessoa pessoa, int agencia, int numeroConta, int senha) {
    }

@Override
    public void aplicarRendimento() {
        BigDecimal aplicarRendimento = new BigDecimal("0.01");
        BigDecimal valorAplicado = getSaldo().multiply(aplicarRendimento);
        setSaldo(getSaldo().add(valorAplicado));
    }


   @Override
    public BigDecimal resgatarRendimento() {
        BigDecimal valorAplicado = getSaldo().multiply(new BigDecimal("0.01"));
        setSaldo(getSaldo().subtract(valorAplicado));
        return valorAplicado;
    }
}