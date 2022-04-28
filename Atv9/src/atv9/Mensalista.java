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
public class Mensalista extends Empregado{
        private String cargo;
        
        public Mensalista(String n, String e, String c){
            super(n,e);
            cargo = c;
        }
        public void set_cargo(String c){
            cargo = c;
        }
        public String get_cargo(){
            return (cargo);
        }
        public void calcularSalario(){
            if(cargo.equals("Junior")){
            salario = 2500;
        }else if (cargo.equals("Pleno")){
            salario = 3500;
        }else if (cargo.equals("Senior")){
            salario = 5500;
        }else 
            System.out.println("invalido");
    }
}
