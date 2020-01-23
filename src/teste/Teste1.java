package teste;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

import java.security.AccessControlContext;

public class Teste1 {
    public static void main(String[] args) {

        Conta conta = new Conta(1001, "Alex", 0.0);
        ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);

        //Upcasting
        Conta conta2 = contaEmpresarial;
        Conta conta3 = new ContaEmpresarial(1005, "Ana", 0.0, 0.01);
        Conta conta4 = new ContaPoupanca(1006, "Julia", 0.0, 25.0);
        //DownCasting

        ContaEmpresarial conta5 = (ContaEmpresarial) conta3;
        conta4.deposito(100.0);

        //ContaEmpresarial conta6 = (ContaEmpresarial)conta4;
        if (conta4 instanceof ContaEmpresarial){
            ContaEmpresarial conta6 = (ContaEmpresarial)conta4;
            conta4.deposito(200.0);
            System.out.println("Carregado");
        }

        if(conta4 instanceof ContaPoupanca){
            ContaPoupanca conta6 = (ContaPoupanca)conta4;
            conta6.atualizarSaldo();
            System.out.println("Atualizado");
        }

        Conta conta7 = new Conta(1007, "João", 1000.0);
        conta7.saque(200.0);
        System.out.println(conta7.getSaldo());

        Conta conta8 = new ContaPoupanca(1008, "Maria", 1000.0, 0.01);
        conta8.saque(200.0);
        System.out.println(conta8.getSaldo());

        Conta conta9 = new ContaEmpresarial(1009, "Bob", 1000.0, 500.0);
        conta9.saque(200.0);
        System.out.println(conta9.getSaldo());

        /*
        Polimorfismo
         */
        Conta contax = new Conta(1010, "Alex", 100.0);
        Conta contay = new ContaPoupanca(1011, "Amélia", 100.0, 1.0);

        contax.saque(50.00);
        contay.saque(50.0);
        System.out.println(contax.getSaldo());
        System.out.println(contay.getSaldo());
    }
}
