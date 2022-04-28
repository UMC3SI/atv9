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
public class Horista extends Empregado{
    private double horas;
    
    public Horista(String n, String e, double h){
        super(n,e);
        horas = h;
    }
    public void set_horas(double h){
        horas = h;
    }
    
    public double get_horas(){
        return horas;
    }
    public void calcularSalario(){
        salario = horas * 50;
    }
}
