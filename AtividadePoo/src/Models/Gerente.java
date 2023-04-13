package Models;

public class Gerente extends Empregado {
    private String setor;

    public Gerente(String nome, String cpf, double salario, String setor) {
        super(nome, cpf, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSetor: " + setor;
    }

	@Override
	public double calcularPagamento() {
		// TODO Auto-generated method stub
		return 0;
	}
}
