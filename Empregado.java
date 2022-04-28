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
public class Empregado {

   protected String nome;
   protected String endereço;
   protected String salario;
   // Construtor
   
   public Empregado(String nome, String endereço){
       this.nome = nome;
       this.endereço = endereço;
   }
// Metodos de acesso
   
   public String getnome(){
       return nome;
   }
   public void setnome(String nome){
       this.nome = nome;
   }
   public String getendereço(){
       return endereço;
   }
   public void setendereço(String endereço){
       this.endereço = endereço;
   }
   public double getsalario(){
       return salario;
   }
   public void setsalario(double salario){
       this.salario = salario;
   }
   public double calcularIrpf(){
           double aux;
           if(salario < 1800){
               aux =0.1 * salario;
           }
           else{
               aux = 0.27 * salario;
           }
           return (aux);
   }
   
    public double calcularInss(){
        return (0.11 * salario);
}
   
   
   
   }
    

