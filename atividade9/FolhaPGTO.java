
package atividade9;

/**
 *
 * @author Bruno Rodrigues (11211501661@alunos.umc.br)
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
