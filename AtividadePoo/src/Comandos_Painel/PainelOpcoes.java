package Comandos_Painel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelOpcoes extends JPanel {
    private static final long serialVersionUID = 1L;
    private JButton botaoCadastrarEmpregado;
    private JButton botaoCadastrarCliente;
    private JButton botaoPesquisar;
    private JButton botaoListarEmpregados;
    private JButton botaoListarClientes;
    private JButton botaoRemover;
    private JButton botaoFinalizar;
    
    public PainelOpcoes() {
        setLayout(new GridBagLayout());
        
        botaoCadastrarEmpregado = new JButton("Cadastrar Empregado");
        botaoCadastrarCliente = new JButton("Cadastrar Cliente");
        botaoPesquisar = new JButton("Pesquisar");
        botaoListarEmpregados = new JButton("Listar Empregados");
        botaoListarClientes = new JButton("Listar Clientes");
        botaoRemover = new JButton("Remover");
        botaoFinalizar = new JButton("Finalizar");
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        add(botaoCadastrarEmpregado, gbc);
        
        gbc.gridx++;
        add(botaoCadastrarCliente, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        add(botaoPesquisar, gbc);
        
        gbc.gridx++;
        add(botaoListarEmpregados, gbc);
        
        gbc.gridx++;
        add(botaoListarClientes, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        add(botaoRemover, gbc);
        
        gbc.gridx++;
        add(botaoFinalizar, gbc);
    }
    
    public JButton getBotaoCadastrarEmpregado() {
        return botaoCadastrarEmpregado;
    }
    
    public JButton getBotaoCadastrarCliente() {
        return botaoCadastrarCliente;
    }
    
    public JButton getBotaoPesquisar() {
        return botaoPesquisar;
    }
    
    public JButton getBotaoListarEmpregados() {
        return botaoListarEmpregados;
    }
    
    public JButton getBotaoListarClientes() {
        return botaoListarClientes;
    }
    
    public JButton getBotaoRemover() {
        return botaoRemover;
    }
    
    public JButton getBotaoFinalizar() {
        return botaoFinalizar;
    }
}
