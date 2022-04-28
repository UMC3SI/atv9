/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv9;

/**
 * Autor Leonardo Piascentini Bugmann RGM 11211100076
 * Co-Autor Renata Cristina da Silva RGM 11211100766
 */
public class FolhaPGTD {
    public static void main(String args[]){
        Mensalista men1,men2;
        Horista hora1,hora2;
        
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        men1.imprimir();

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        men2.imprimir();
        
        hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();
        hora1.imprimir();

        hora2 = new Horista("Cristina", "Rua do centro", 100);
        hora2.calcularSalario();
        hora2.imprimir();

    }
}
