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
public class Horista extends Empregado {

    private double horas;

    public Horista(String n, String e, double h) {
        super(n, e);
        horas = h;
    }

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
