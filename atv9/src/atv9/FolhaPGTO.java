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
public class FolhaPGTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mensalista men1, men2;
        Horista horal, hora2;

// Empregados mensalistas
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        men1.imprimir();

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        men2.imprimir();

// Empregados horistas
        horal = new Horista("Carlos", "Rua xyz", 20);
        horal.calcularSalario();
        horal.imprimir();

        hora2 = new Horista("Cristina", "Rua do centro", 100);
        hora2.calcularSalario();
        hora2.imprimir();
    }
}
