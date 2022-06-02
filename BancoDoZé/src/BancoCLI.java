
import br.univali.prog.banco.Banco;
import br.univali.prog.banco.ContaCorrente;

import java.util.Scanner;


public class BancoCLI  {
    
    private Banco banco;

    public BancoCLI() {
        banco = new Banco();
        mostrarMenu();
    }
    
    private String lerValor(String rotulo){
        System.out.print(rotulo+":");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }
    
    public void mostrarMenu(){
        
        String opcoes = "Menu principal do banco";
        opcoes += "\n 1 - criar conta";
        opcoes += "\n 2 - depositar";
        opcoes += "\n 3 - sacar";
        opcoes += "\n 4 - transferir";
        opcoes += "\n 5 - Imprimir Extrato";
        opcoes += "\n 6 - Excluir Conta";
        opcoes += "\n 7 - finalizar";
        
        char opcao;
        do {
            System.out.println(opcoes);
            opcao = this.lerValor("Escolha uma opcao").charAt(0);
            switch (opcao) {
                case '1': this.criarConta();break;
                case '2': this.depositar();break;
                case '3': this.sacar(); break;
                case '4': this.transferir(); break;
                case '5': this.ImprimirExtrato(); break;
                case '6': this.ExcluirConta(); break;
            }
        } while (opcao != '7');
        
    }
    
    public void criarConta(){
        System.out.println("Criação de conta");
        boolean especial = this.lerValor("Conta especial [s/n]").charAt(0) == 's';
        double saldoInicial = Double.parseDouble(this.lerValor("Digite o saldo Inicial"));
        double limite = 0;
        if (especial){
            limite = Double.parseDouble(this.lerValor("Digite o limite"));
        }
        System.out.println("Criada conta de numero : " + this.banco.criarConta(especial, saldoInicial, limite));
    }
    
    public void depositar() {
        System.out.println("Depositar ");
        int numeroConta = Integer.parseInt(this.lerValor("Digite o Nuemro da Conta"));
        double valor = Double.parseDouble(this.lerValor("Digite o valor a Depositar"));
        if(this.banco.depositar(numeroConta,valor)){
            System.out.println("Deposito Efetuado ");
       }else{
            System.out.println("Deposito NAO Efetuado ");
        };
    }
    
    public void sacar() {

        System.out.println("Sacar ");
        int numeroConta = Integer.parseInt(this.lerValor("Digite o Nuemro da Conta"));
        double valor = Double.parseDouble(this.lerValor("Digite o valor a Sacar"));
        if(this.banco.sacar(numeroConta,valor)){
            System.out.println("Saque Efetuado ");
        }else{
            System.out.println("Saque NAO Efetuado ");
        };
        
    }
    
    public void transferir() {

        System.out.println("Tranferencia ");
        int Origem = Integer.parseInt(this.lerValor("Digite o Numero da Conta Origem "));
        int Destino = Integer.parseInt(this.lerValor("Digite o Numero da Conta Destino "));
        double valor = Double.parseDouble(this.lerValor("Digite o valor a Transferir "));
        if(this.banco.transferir(Origem,Destino,valor)){
            System.out.println("Transferencia Efetuada");
        }else{
            System.out.println("Transferencia NAO Efetuada");
        };
    }

    public void ImprimirExtrato(){
        System.out.println("Retir Extrato ");
        int numeroConta = Integer.parseInt(this.lerValor("Digite o Numero da Conta "));

        System.out.println(this.banco.imprimirExtrato(numeroConta));

    }

    public void ExcluirConta(){
        System.out.println("Excluir Conta ");
        int numeroConta = Integer.parseInt(this.lerValor("Digite o Numero da Conta "));
        if(this.banco.ExcluirConta(numeroConta)){
            System.out.println("Conta Excluida ");
        }else{
            System.out.println("Conta Não existe ");
        }
    }
    
}
