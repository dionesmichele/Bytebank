import java.math.BigDecimal;

public abstract class Conta {

    private Pessoa titular;
    private int agencia;
    private int numeroConta;
    private BigDecimal saldo;
    private String senha;
    private String tipoConta;
    private String chavePix;
    private int senhaInt;


    public Conta() {
    }

    public Conta(int agencia, int numeroConta, BigDecimal saldo, String senha, Pessoa titular, String tipoConta, String chavePix) {

        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.chavePix = chavePix;
    }

    public Conta(String tipoConta, BigDecimal saldoInicial){
        this.tipoConta = tipoConta;
        this.saldo = saldoInicial;
    }
    public boolean validarCredenciais(int agencia, int numeroConta, int senha) {
        try {
            int senhaInt = Integer.parseInt(String.valueOf(senha)); // Converte a senha de String para int
            return this.agencia == agencia && this.numeroConta == numeroConta && this.senhaInt == senhaInt;
        } catch (NumberFormatException e) {
            // Lida com o caso em que a senha não é um número válido
            return false;
        }
    }

    public void aplicarRendimento(){
        BigDecimal aplicarRendimento = new BigDecimal("0.01");
        BigDecimal valorAplicado = saldo.multiply(aplicarRendimento);
        saldo = saldo.add(valorAplicado);
    }

   public Conta(int agencia, int numeroConta, BigDecimal saldo, int senha, Pessoa titular) {
    }

    public Conta(int agencia, int numeroConta, int senha) {
    }

    public static void listarContas() {
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int setNumeroConta(int numeroConta) {
        return numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return Integer.parseInt(senha);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta() {
        this.tipoConta = tipoConta;
    }
    public void getChavePix(){
        this.chavePix = chavePix;
    }
}
