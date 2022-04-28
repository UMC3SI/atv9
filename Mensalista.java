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

    
    public class Mensalista extends Empregado {
        private String cargo;
        //Construtor
        
        public Mensalista (String n, String e, String c){
            super (n, e);
            cargo = c;
        }
        // Metodos de acesso
        public void set_cargo(String c){
            cargo = c;
        }
        public String get_cargo() {
            return (cargo);
    
        }
        
        public void calcularSalario(){
            if (cargo.equals("junior")){
                salario = 2500;
            }
            else if (cargo.equals("pleno")){
                salario = 3500;
            }
            else{
                salario = 5500;
            }   
            }
        }
    
    
    
