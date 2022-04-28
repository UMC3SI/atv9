/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

/**
 *
 * @author alunocmc
 */
public class horista extends Empregado {
    
    private double horas;
            //Construtor
    
    public horista(String n, string e, double h) {
        super(n, e);
        horas = h;
        
    }
    // metodos de acesso
    
    public double get_horas() {
        return horas;
    }
    public void calcularSalario(){
        salario = horas * 50
    }
}
