/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapgto;

/**
 *
 * @author Julia Calazans - 11211102258@alunos.umc.br
 * @author Lucas da Silva Cardoso - 11211102438@alunos.umc.br
 */
public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;
    //Construtor

    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

    }

    // Metodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIrpf() {
        double aux = 0;
        if (salario <= 1903.98) {
            aux = salario * 0;

        } else if (salario <= 2826.65) {
            aux = salario * 0.075;

        } else if (salario <= 3751.05) {
            aux = salario * 0.15;

        } else if (salario <= 4664.68) {
            aux = salario * 0.225f;

        } else if (salario > 4664.68) {
            aux = salario * 0.275;
        }
        return (aux);
    }

    public double calcularInss() {
        double aux = 0;
        if (salario <= 1212) {
            aux = salario * 0.075;

        } else if (salario <= 2427.35) {
            aux = salario * 0.09;

        } else if (salario <= 3641.03) {
            aux = salario * 0.12;

        } else if (salario <= 7087.22) {
            aux = salario * 0.14;

        }
        return (aux);
    }
    
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Salario: " + salario + "\n");
    }
}
