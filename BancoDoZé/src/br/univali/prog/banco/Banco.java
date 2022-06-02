/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.prog.banco;


import java.util.ArrayList;

public class Banco {

    private int numeroAtual = 1000;
    private static int MAX_CONTAS = 999;

    ArrayList<ContaCorrente> Contas = new ArrayList<>();
    
    
    
    public int criarConta(boolean especial,
            double saldo,
            double limite){
        int numero = obterNumeroConta();
        ContaCorrente nova = new ContaCorrente(especial, limite, numero, saldo);
        Contas.add(nova);
        return numero;
    }
    
    public boolean depositar(int numeroConta, double valor){
        ContaCorrente conta = localizarConta(numeroConta);
        if (conta != null) {
            return conta.depositar(valor);
        }
        return false;
    }

    public boolean sacar(int numeroConta, double valor){
        ContaCorrente conta = localizarConta(numeroConta);
        if (conta != null) {
            return conta.sacar(valor);
        }
        return false;
    }
    
    public boolean transferir(int origem, int destino, double valor){
        ContaCorrente contaOrigem = localizarConta(origem);
        ContaCorrente contaDestino = localizarConta(destino);
        if (contaOrigem != null && contaDestino != null){
            if (contaOrigem.sacar(valor)) {
                return contaDestino.depositar(valor);
            }
            return false;
        }
        return false;
    }
    
    public String imprimirExtrato(int numeroConta){
        ContaCorrente conta = localizarConta(numeroConta);
        String extrato = "Extrato da conta "+numeroConta;

        if(conta == null) {
        return "Nao foi possivel Localizar a Conts";
        }
        for (Movimentacao movimentacao:conta.movimentacoes){
            if (movimentacao == null) {
                break;
            }
            extrato += "\n"+movimentacao.extrato();
        }
        extrato += "\n Saldo final R$"+conta.getSaldoAtual();
        return extrato;
    }
    
    private int obterNumeroConta() {
        return numeroAtual++;
    }
    
    private ContaCorrente localizarConta(int numero) {
        for(ContaCorrente conta:Contas) {
            if (conta != null && conta.getNumeroConta() == numero){
                return conta;
            }
        }
        return null;
    }

    public boolean ExcluirConta(int numero){
        int gambiarra = numero%1000;


    try{
        Contas.remove(gambiarra);
        return true;

    }catch(Exception ex){
        return false;
        }
    finally {
       System.out.println("SAIU DO METODO");
    }
}}
