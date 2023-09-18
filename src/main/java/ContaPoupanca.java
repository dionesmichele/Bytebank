import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numeroConta, BigDecimal saldo, int senha, Pessoa titular){
        super(agencia, numeroConta, saldo, senha, titular);
    }

    public ContaPoupanca(String tipoConta, BigDecimal saldoInicial){
        super(tipoConta, saldoInicial);
    }
    private BigDecimal saldo;

    public ContaPoupanca(BigDecimal saldoInicial) {
        this.saldo = saldoInicial;}

    public ContaPoupanca(int agencia, int conta, int senha, Pessoa pessoa) {
    }

    public ContaPoupanca(Pessoa pessoa, int agencia, int numeroConta, int senha) {
    }


    public void aplicar(){
        BigDecimal aplicarRendimento = new BigDecimal("0.01");
        BigDecimal valorAplicado = getSaldo().multiply(aplicarRendimento);
        super.aplicarRendimento();
        setSaldo(getSaldo().add(valorAplicado));
        saldo.add(valorAplicado);
    }

    public BigDecimal getSaldo(){
        return saldo;
    }


}
