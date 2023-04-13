package Comandos_Painel;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Models.Vendedor;

public class PainelCadastrarVendedor extends JPanel {
    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtSalario;
    private JTextField txtComissao;
	private static final long serialVersionUID = 1L;

    
    public PainelCadastrarVendedor() {
        setLayout(new GridLayout(4, 2, 5, 5));
        
        JLabel lblNome = new JLabel("Nome:");
        add(lblNome);
        
        txtNome = new JTextField();
        add(txtNome);
        
        JLabel lblCpf = new JLabel("CPF:");
        add(lblCpf);
        
        txtCpf = new JTextField();
        add(txtCpf);
        
        JLabel lblSalario = new JLabel("Sal�rio:");
        add(lblSalario);
        
        txtSalario = new JTextField();
        add(txtSalario);
        
        JLabel lblComissao = new JLabel("Comiss�o:");
        add(lblComissao);
        
        txtComissao = new JTextField();
        add(txtComissao);
    }
    
    public Vendedor getVendedor() {
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        double salario = Double.parseDouble(txtSalario.getText());
        double comissao = Double.parseDouble(txtComissao.getText());
        
        return new Vendedor(nome, cpf, salario, comissao);
    }

	public void limparCampos() {
		// TODO Auto-generated method stub
		
	}

		
}
