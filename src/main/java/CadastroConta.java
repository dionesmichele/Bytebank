import java.io.BufferedReader;
import java.util.List;
import java.util.Random;

public class CadastroConta {
    public static void cadastroConta(BufferedReader br, List<Conta> contas, int tipoConta) throws Exception {
        System.out.println("INFORME O NOME DO TITULAR DA CONTA:   ");
        String nome = br.readLine();
        System.out.println("INFORME O CPF DO TITULAR DA CONTA (SEM . E -):   ");
        String cpf = br.readLine();
        System.out.println("INFORME O ENDEREÇO DO TITULAR DA CONTA:   ");
        String endereco = br.readLine();
        System.out.println("INFORME O TELEFONE DO TITULAR DA CONTA:   ");
        String telefone = br.readLine();
        System.out.println("INFORME O SENHA DO TITULAR DA CONTA:   ");
        int senha = Integer.parseInt(br.readLine());

        String chavePix = null;
        if (tipoConta == 1){
            System.out.println("CADASTRE UMA CHAVE PIX PARA A REALIZAÇÃO DE TRASNFERENCIAS:  ");
            chavePix = br.readLine();
        }

        Pessoa pessoa = new Pessoa(nome, cpf, endereco, telefone);
        Random random = new Random();

        int agencia = random.nextInt(9000) + 1000;
        int conta = random.nextInt(9000) + 1000;

        Conta novaConta = tipoConta == 1 ? new ContaCorrente(agencia, senha, conta, pessoa, chavePix) : new ContaPoupanca(agencia, conta, senha, pessoa);
        contas.add(novaConta);
        System.out.println("Cliente" + "\nCadastrado com sucesso na agência  "+ agencia + "conta" + conta);



        //método de encerrar conta
    }
}
