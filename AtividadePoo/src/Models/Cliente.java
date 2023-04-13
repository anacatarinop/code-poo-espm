package Models;

public class Cliente extends Pessoa {
    private String endereco;
    
    public Cliente(String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf);
        this.endereco = endereco;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nE-mail: " + endereco;
    }
}

