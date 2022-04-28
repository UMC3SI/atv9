public class Mensalista extends Empregado {

    private String cargo;
    
    public Mensalista(String n, String e, String c) {
        super(n, e);
        cargo = c;

    }

    public void set_cargo(String c) {
        cargo = c;
    }

    public String get_cargo() {
        return (cargo);
    }

    public void calcularSalario() {
        if (cargo=="Junior") {
            salario = 2500;
        } else if (cargo=="Pleno") {
            salario = 3500;
        } else if (cargo=="Senior") {
            salario = 5500;
        }
    }
    public void imprimir() {
        System.out.println();
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Salário: " + this.salario);
        System.out.println("cargo: " + this.cargo);
        System.out.println("Desconto do Inss: " + this.calcularInss());
        System.out.println("Desconto do Irpf: " + this.calcularIRPF());
        
    }
    
}
