/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

/**
 *
 * @author Gabriel Boschi Rgm:11211100784
 * @author Freddye Pontes Nunes Rgm:11211202211
 */
public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;

    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    //Metodos de acesso

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
            aux = 0.0;
        } else if (salario >= 1903.99 && salario < 2826.65) {
            aux = 0.075 * salario;
        } else if (salario >= 2826.66 && salario < 3751.05) {
            aux = 0.15 * salario;
        } else if (salario >= 3751.06 && salario < 4664.68) {
            aux = 0.225 * salario;
        } else if (salario > 4664.68) {
            aux = 0.275 * salario;
        }
        return aux;
    }

    public double calcularInss() {
        if (salario <= 1903.98) {
            salario = -(0.0 * salario) + salario;
        } else if (salario >= 1903.99 && salario < 2826.65) {
            salario = -(0.075 * salario) + salario;
        } else if (salario >= 2826.66 && salario < 3751.05) {
            salario = -(0.15 * salario) + salario;
        } else if (salario >= 3751.06 && salario < 4664.68) {
            salario = -(0.225 * salario) + salario;
        } else if (salario > 4664.68) {
            salario = -(0.275 * salario) + salario;
        }
        return (salario);
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Salario: " + salario);
        System.out.println("Desconto IRPF: " + calcularIrpf());
        System.out.println("Desconto INSS: " + calcularInss() + "\n");
    }

}
