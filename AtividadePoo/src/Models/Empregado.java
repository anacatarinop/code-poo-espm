package Models;

public abstract class Empregado extends Pessoa {
    private double salario;
    
    public Empregado(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public abstract double calcularPagamento();
    
    @Override
    public String toString() {
        return super.toString() + "\nSal�rio: " + salario;
    }
}
