import javax.swing.JOptionPane;

import Comandos_Painel.PainelCadastrarCliente;
import Comandos_Painel.PainelCadastrarGerente;
import Comandos_Painel.PainelCadastrarVendedor;
import Comandos_Painel.PainelPesquisar;
import Models.Cliente;
import Models.Empregado;
import Models.Gerente;
import Models.Pessoa;
import Models.Vendedor;

public class Main {
    public static void main(String[] args) {
        ProgramaCadastro programa = new ProgramaCadastro();

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Escolha uma opera��o:\n"
                            + "1. Cadastrar Empregado\n"
                            + "2. Cadastrar Cliente\n"
                            + "3. Pesquisar\n"
                            + "4. Listar Empregados\n"
                            + "5. Listar Clientes\n"
                            + "6. Remover\n"
                            + "7. Finalizar"));

            switch (opcao) {
                case 1:
                    int opcaoCadastrar = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Escolha o tipo de cadastro:\n\n"
                                    + "1. Gerente\n"
                                    + "2. Vendedor"));

                    if (opcaoCadastrar == 1) {
                        PainelCadastrarGerente painelCadastrarGerente = new PainelCadastrarGerente();
                        int resultadoCadastrarGerente = JOptionPane.showConfirmDialog(null, painelCadastrarGerente,
                                "Cadastrar Gerente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                        if (resultadoCadastrarGerente == JOptionPane.OK_OPTION) {
                            Gerente gerente = painelCadastrarGerente.getGerente();
                            programa.adicionar(gerente);
                            JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso!");
                            painelCadastrarGerente.limparCampos();
                        }
                    } else if (opcaoCadastrar == 2) {
                        PainelCadastrarVendedor painelCadastrarVendedor = new PainelCadastrarVendedor();
                        int resultadoCadastrarVendedor = JOptionPane.showConfirmDialog(null, painelCadastrarVendedor,
                                "Cadastrar Vendedor", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                        if (resultadoCadastrarVendedor == JOptionPane.OK_OPTION) {
                            Vendedor vendedor = painelCadastrarVendedor.getVendedor();
                            programa.adicionar(vendedor);
                            JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso!");
                            painelCadastrarVendedor.limparCampos();
                        }
                    }
                    break;

                case 2:
                    PainelCadastrarCliente painelCadastrarCliente = new PainelCadastrarCliente();
                    int resultadoCadastrarCliente = JOptionPane.showConfirmDialog(null, painelCadastrarCliente,
                            "Cadastrar Cliente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                    if (resultadoCadastrarCliente == JOptionPane.OK_OPTION) {
                        Cliente cliente = painelCadastrarCliente.getCliente();
                        programa.adicionar(cliente);
                        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                        painelCadastrarCliente.limparCampos();
                    }
                    break;

                case 3:
                    PainelPesquisar painelPesquisar = new PainelPesquisar();
                    int resultadoPesquisar = JOptionPane.showConfirmDialog(null, painelPesquisar, "Pesquisar Pessoa",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                    if (resultadoPesquisar == JOptionPane.OK_OPTION) {
                        String cpfPesquisar = painelPesquisar.getCpf();
                        Pessoa pessoaEncontrada = programa.pesquisar(cpfPesquisar);

                        if (pessoaEncontrada != null) {
                            if (pessoaEncontrada instanceof Empregado) {
                                JOptionPane.showMessageDialog(null, pessoaEncontrada.toString() + "\n\n"
                                        + "Tipo: Empregado");
                            } else if (pessoaEncontrada instanceof Cliente) {
                                JOptionPane 
                                .showMessageDialog(null, pessoaEncontrada.toString() + "\n\n"
                                        + "Tipo: Cliente");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Pessoa n�o encontrada!");
                        }
                        painelPesquisar.limparCampos();
                    }
                    break;

                case 4:
                    StringBuilder empregados = new StringBuilder();
                    for (Pessoa pessoa : programa.getPessoas()) {
                        if (pessoa instanceof Empregado) {
                            empregados.append(pessoa.toString()).append("\n\n");
                        }
                    }

                    if (empregados.length() > 0) {
                        JOptionPane.showMessageDialog(null, empregados.toString() + "Tipo: Empregado");
                    } else {
                        JOptionPane.showMessageDialog(null, "N�o h� empregados cadastrados!");
                    }
                    break;

                case 5:
                    StringBuilder clientes = new StringBuilder();
                    for (Pessoa pessoa : programa.getPessoas()) {
                        if (pessoa instanceof Cliente) {
                            clientes.append(pessoa.toString()).append("\n\n");
                        }
                    }

                    if (clientes.length() > 0) {
                        JOptionPane.showMessageDialog(null, clientes.toString() + "Tipo: Cliente");
                    } else {
                        JOptionPane.showMessageDialog(null, "N�o h� clientes cadastrados!");
                    }
                    break;

                case 6:
                    String cpfRemover = JOptionPane.showInputDialog(null, "Digite o CPF da pessoa a ser removida:");

                    Pessoa pessoaRemover = programa.pesquisar(cpfRemover);
                    if (pessoaRemover != null) {
                        int resultadoRemover = JOptionPane.showConfirmDialog(null,
                                "Tem certeza que deseja remover " + pessoaRemover.getNome() + "?");

                        if (resultadoRemover == JOptionPane.OK_OPTION) {
                            programa.remover(pessoaRemover);
                            JOptionPane.showMessageDialog(null, "Pessoa removida com sucesso!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Pessoa n�o encontrada!");
                    }
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
                    break;
            }
        } while (opcao != 7);
    }
}

