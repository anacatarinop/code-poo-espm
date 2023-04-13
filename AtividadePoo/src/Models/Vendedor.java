package Models;

public class Vendedor extends Empregado {
    private double comissao;
    
    public Vendedor(String nome, String cpf, double salario, double comissao) {
        super(nome, cpf, salario);
        this.comissao = comissao;
    }
    
    public double getComissao() {
        return comissao;
    }
    
    @Override
    public double calcularPagamento() {
        return getSalario() + comissao;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCargo: Vendedor" + "\nComiss�o: " + comissao;
    }
}
