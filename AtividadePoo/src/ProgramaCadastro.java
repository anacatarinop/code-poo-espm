import java.util.ArrayList;
import javax.swing.JOptionPane;

import Comandos_Painel.PainelCadastrarCliente;
import Comandos_Painel.PainelCadastrarGerente;
import Comandos_Painel.PainelCadastrarVendedor;
import Comandos_Painel.PainelListarClientes;
import Comandos_Painel.PainelListarEmpregados;
import Comandos_Painel.PainelPesquisar;
import Comandos_Painel.PainelRemover;
import Models.Pessoa;
import Models.Vendedor;
import Models.Cliente;
import Models.Empregado;
import Models.Gerente;


public class ProgramaCadastro {
    private ArrayList<Pessoa> pessoas;

    public ProgramaCadastro() {
        pessoas = new ArrayList<Pessoa>();
    }

    public void adicionar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void remover(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public Pessoa pesquisar(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }


    
    public boolean remover(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                int opcao = JOptionPane.showConfirmDialog(null,
                        "Deseja remover a seguinte pessoa:\n" + pessoa, "Remover Pessoa", JOptionPane.YES_NO_OPTION);
                
                if (opcao == JOptionPane.YES_OPTION) {
                    pessoas.remove(pessoa);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        ProgramaCadastro programa = new ProgramaCadastro();
        
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o:\n"
                    + "1. Cadastrar Empregado\n"
                    + "2. Cadastrar Cliente\n"
                    + "3. Pesquisar\n"
                    + "4. Listar Empregados\n"
                    + "5. Listar Clientes\n"
                    + "6. Remover\n"
                    + "7. Finalizar"));
            
            switch (opcao) {
                case 1:
                    int opcaoEmpregado = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o:\n"
                            + "1. Cadastrar Gerente\n"
                            + "2. Cadastrar Vendedor"));
                    
                    if (opcaoEmpregado == 1) {
                        PainelCadastrarGerente painel = new PainelCadastrarGerente();
                        int resultado = JOptionPane.showConfirmDialog(null, painel, "Cadastrar Gerente",
                                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        
                        if (resultado == JOptionPane.OK_OPTION) {
                            Gerente gerente = painel.getGerente();
                            programa.adicionar(gerente);
                            JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso!");
                        }
                    } else if (opcaoEmpregado == 2) {
                        PainelCadastrarVendedor painel = new PainelCadastrarVendedor();
                        int resultado = JOptionPane.showConfirmDialog(null, painel, "Cadastrar Vendedor",
                                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        
                        if (resultado == JOptionPane.OK_OPTION) {
                            Vendedor vendedor = painel.getVendedor();
                            programa.adicionar(vendedor);
                            JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso!");
                        }
                    }
                    break;
                    
                case 2:
                    PainelCadastrarCliente painelCliente = new PainelCadastrarCliente();
                    int resultadoCliente = JOptionPane.showConfirmDialog(null, painelCliente, "Cadastrar Cliente",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    
                    if (resultadoCliente == JOptionPane.OK_OPTION) {
                        Cliente cliente = painelCliente.getCliente();
                        programa.adicionar(cliente);
                        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    }
                    break;
                    
                case 3:
                    PainelPesquisar painelPesquisar = new PainelPesquisar();
                    int resultadoPesquisar = JOptionPane.showConfirmDialog(null, painelPesquisar);
                            if (resultadoPesquisar == JOptionPane.OK_OPTION) {
                                String cpfPesquisar = painelPesquisar.getCpf();
                                Pessoa pessoaEncontrada = programa.pesquisar(cpfPesquisar);
                                
                                if (pessoaEncontrada != null) {
                                    if (pessoaEncontrada instanceof Empregado) {
                                        JOptionPane.showMessageDialog(null, pessoaEncontrada.toString() + "\n\n"
                                                + "Tipo: Empregado");
                                    } else if (pessoaEncontrada instanceof Cliente) {
                                        JOptionPane.showMessageDialog(null, pessoaEncontrada.toString() + "\n\n"
                                                + "Tipo: Cliente");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Pessoa n�o encontrada!");
                                }
                            }
                            break;
                            
                        case 4:
                            PainelListarEmpregados painelListarEmpregados = new PainelListarEmpregados();
                            painelListarEmpregados.listarEmpregados(programa.pessoas);
                            JOptionPane.showMessageDialog(null, painelListarEmpregados, "Listar Empregados",
                                    JOptionPane.PLAIN_MESSAGE);
                            break;
                            
                        case 5:
                            PainelListarClientes painelListarClientes = new PainelListarClientes();
                            painelListarClientes.listarClientes(programa.pessoas);
                            JOptionPane.showMessageDialog(null, painelListarClientes, "Listar Clientes",
                                    JOptionPane.PLAIN_MESSAGE);
                            break;
                            
                        case 6:
                            PainelRemover painelRemover = new PainelRemover();
                            int resultadoRemover = JOptionPane.showConfirmDialog(null, painelRemover, "Remover Pessoa",
                                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                            
                            if (resultadoRemover == JOptionPane.OK_OPTION) {
                                String cpfRemover = painelRemover.getCpf();
                                boolean resultado = programa.remover(cpfRemover);
                                
                                if (resultado) {
                                    JOptionPane.showMessageDialog(null, "Pessoa removida com sucesso!");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Pessoa n�o encontrada!");
                                }
                            }
                            break;
                            
                        case 7:
                            JOptionPane.showMessageDialog(null, "Programa finalizado!");
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
                            break;
                    }
                } while (opcao != 7);
            }

	public void executar() {
		
	}
        }

