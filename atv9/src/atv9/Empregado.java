/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv9;

/**
 *
 * @author Matheus Meirielli RGM : 11211102089 Co-Author Eduarda Shibakura RGM :
 * 11211102084
 */
public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;

    public Empregado(String nome, String endereco) {

        this.nome = nome;
        this.endereco = endereco;

    } // Metodos de acesso

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
        double aux;

        if (salario >= 1903.99) {

            aux = 0.075 * salario;
        } else if (salario >= 2826.66) {

            aux = 0.15 * salario;
        } else if (salario >= 3751.06) {

            aux = 0.225 * salario;
        } else if (salario >= 4664.69) {

            aux = 0.275 * salario;
        } else {
            aux = 0 * salario;
        }
        return (aux);
    }

    public double calcularInss() {
        double aux = 0;
        if (salario <= 1212) {
            aux = salario * 0.075;

        } else if (salario >= 1212.01 && salario <= 2427.35) {
            aux = salario * 0.09;

        } else if (salario >= 2427.36 && salario <= 3641.03) {
            aux = salario * 0.12;

        } else if (salario >= 3641.04 && salario <= 7087.22) {
            aux = salario * 0.14;

        }
        return (aux);
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Salario: " + salario + "\n");
    }

}
