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
public class Horista extends Empregado {

    private double horas;

    // Construtor
    public Horista(String n, String e, double h) {
        super(n, e);
        horas = h;
    }

    // Metodos de acesso
    public void set_horas(double h) {
        horas = h;
    }

    public double get_horas() {
        return horas;
    }

    public void calcularSalario() {
        salario = horas * 50;
    }
}
