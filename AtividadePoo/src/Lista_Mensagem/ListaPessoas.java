package Lista_Mensagem;

import java.util.ArrayList;

import Models.Cliente;
import Models.Empregado;
import Models.Pessoa;

public class ListaPessoas {
    private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	private ArrayList<Pessoa> pessoas;
    
    public void adicionar(Pessoa pessoa) {
        lista.add(pessoa);
    }
    
    public void remover(String cpf) {
        Pessoa pessoaRemover = pesquisar(cpf);
        if (pessoaRemover != null) {
            pessoas = null;
			pessoas.remove(pessoaRemover);
        }
    }

    
    public Pessoa pesquisar(String cpf) {
        for (Pessoa pessoa : lista) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }
    
    public ArrayList<Empregado> listarEmpregados() {
        ArrayList<Empregado> empregados = new ArrayList<Empregado>();
        for (Pessoa pessoa : lista) {
            if (pessoa instanceof Empregado) {
                empregados.add((Empregado) pessoa);
            }
        }
        return empregados;
    }
    
    public ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        for (Pessoa pessoa : lista) {
            if (pessoa instanceof Cliente) {
                clientes.add((Cliente) pessoa);
            }
        }
        return clientes;
    }
    
    public ArrayList<Pessoa> getLista() {
        return lista;
    }
}
