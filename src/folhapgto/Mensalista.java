/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapgto;

/**
 *
 * @author Julia Calazans - 11211102258@alunos.umc.br
 * @author Lucas da Silva Cardoso - 11211102438@alunos.umc.br
 */
public class Mensalista extends Empregado {

    private String cargo;

    //Construtor
    public Mensalista(String n, String e, String c) {
        super(n, e);
        cargo = c;
    }

    //Metodos de acesso
    public void set_cargo(String c) {
        cargo = c;
    }

    public String get_cargo() {
        return (cargo);
    }

    public void calcularSalario() {
        if (cargo.equals("Junior")) {
            salario = 2500;
        } else if (cargo.equals("Pleno")) {
            salario = 3500;
        } else if (cargo.equals("Senior")){
            salario = 5500;
        } else{
            System.out.println("Cargo inválido");
            salario = 0;
        }
    }
}
