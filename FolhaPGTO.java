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
public class FolhaPGTO {

    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        men1 = new Mensalista("Jose", "Rua ABC", "Junior");
        men1.calcularInss();
        men1.calcularSalario();
        men1.imprimir();

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        men2.imprimir();

        //Empregados horistas
        hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();
        hora1.imprimir();

        hora2 = new Horista("Cristina", "Rua do centro", 100);
        hora2.calcularSalario();
        hora2.imprimir();
    }
}
