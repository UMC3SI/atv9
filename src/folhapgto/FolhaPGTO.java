package folhapgto;

/**
 *
 * @author Julia Calazans - 11211102258@alunos.umc.br
 * @author Lucas da Silva Cardoso - 11211102438@alunos.umc.br
 */
public class FolhaPGTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        // Empregados mensalistas
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        men1.imprimir();

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        men2.imprimir();

        //Empregados horistas
        hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();
        hora1.imprimir();

        hora2 = new Horista("Cristina", "Rua do centro", 100);
        hora2.calcularSalario();
        hora2.imprimir();
    }

}
