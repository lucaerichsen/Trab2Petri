/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trab2;

/**
 *
 * @author pildo
 */
public class Conta extends Pessoa {

    private int nConta;
    private double saldo;
    private String tConta;

    public Conta() {
    }

    public Conta(String nome, String endereco, int cpf, int idade, int nCelular, double salario, int nConta, double saldo, String tConta) {
    	super(nome, endereco, cpf, idade, nCelular, salario);
        this.nConta = nConta;
        this.saldo = saldo;
        this.tConta = tConta;
    }
public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
        
    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    

    public void saque(double valor) {
        if (valor > 0) {
            if (this.saldo < valor) {
                System.out.println("Não é possível sacar um valor maior do que o saldo.");
            } else {
                this.saldo = this.saldo - valor;
            }
        } else {
            System.out.println("Impossível sacar um valor negativo.");
        }

    }
    
    public void deposito(double valor, Conta conta) {
        if(valor > 0) {
            conta.saldo = conta.saldo + valor;
            System.out.println("Depósito concluído.");
        } else {
            System.out.println("Não é possível depositar valores negativos ou iguais a 0.");
        }
    }

    public void informaSaldo() {
        System.out.println("O saldo atual da conta do(a): " + this.getNome() + " é igual a: " + this.saldo);
    }
    
    public void transfere(Conta contaDestino, double valor) {
        if(valor > 0  && valor <= this.saldo) {
            contaDestino.saldo += valor;
            this.saldo -= valor;
            System.out.println("Transferência realizada ");
        } else {
            System.out.println("Não é possível transferir valores negativos");
        }
    }
    
    public void imprimeNomeTitular(){
        System.out.println("Nome do titular: " + this.getNome());
    }
    
    public String devolvetConta() {
        return this.tConta;
    }

    public String getNome() {
        throw new UnsupportedOperationException("Unsupported yet"); 
    }
    

}