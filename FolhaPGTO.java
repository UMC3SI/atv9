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
public class FolhaPGTO {
    
    public static void (String args[]){
        Mensalista men1, men2;
        horista hora1, hora2;
        // Empregados mensalistas
        men1 = new Mensalista("Jose","rua aaa", "junior");
        men1.calcularSalario();
        men1.calcularInss();
        Sytem.out.println("nome" + men1.getnome());
        System.out.println("endereço" + men1 getEndereço());
        System.out.println("salario" + men1.getSalario);
        
        
        
        
        men2 = new Mensalista("ana", "rua bbb", "senior");
        men2.calcularSalario();
        men2.calcularInss();
        Sytem.out.println("nome" + men2.getnome());
        System.out.println("endereço" + men2 getEndereço());
        System.out.println("salario" + men2.getSalario());
        
        
        
        //emepregados horistas
        
        hora1 = new Horista("carlos", "rua ccc", 20);
        hora1.calcularSalario();
        System.out.println("nome" + hora1.getnome());
        System.out.println("endereço" + hora1.getendereço());
        System.out.println("salario" + hora1.getSalario());
        
        
        
        hora2 = new Horista("lari", "rua abc", 160);
        hora2.calcularSalario();
        System.out.println("nome" + hora2.getnome());
        System.out.println("endereço" + hora2.getendereço());
        System.out.println("salario" + hora2.getSalario());
        
    }
    
    
}
