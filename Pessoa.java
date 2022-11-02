/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trab2;

/**
 *
 * @author pildo
 */
public class Pessoa {

	private String nome;
	private String endereco;
	private int cpf;
	private int idade;
	private int nCelular;
	private double salario;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco, int cpf, int idade, int nCelular, double salario) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.nCelular = nCelular;
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return this.cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumeroCelular() {
		return this.nCelular;
	}

	public void setNumeroCelular(int nCelular) {
		this.nCelular = nCelular;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
