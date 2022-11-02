/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trab2;

/**
 *
 * @author pildo
 */
public class Executor {

	 public static void informaDadosPessoais(Conta conta) {
	    	System.out.println("Nome do titular: "+ conta.getNome());
	    	System.out.println("Endereço de cobrança: "+ conta.getEndereco());
	    	System.out.println("CPF : "+ conta.getCpf());
	    	System.out.println("Idade : "+ conta.getIdade());
	    	System.out.println("Numero do titular: "+ conta.getNumeroCelular());
	    	System.out.println("Sálario : "+ conta.getSalario());
	    }
	
    public static void main(String[] args) {

        Conta conta1 = new Conta("nome", "Rua, bairro, numero da casa", 00000000000, 21, 123456978, 45, 1, 1, "Corrente");
        informaDadosPessoais(conta1);

        Conta conta2 = new Conta("Nome", "Rua, Bairro, numero da casa", 01122565, 27, 478254777, 123540, 1234, 1, "Poupança");

        conta2.setEndereco("Rua, Bairro, numero da casa");
        informaDadosPessoais(conta2);
        

        
    }
}
