package Comandos_Painel;
import javax.swing.*;

import Models.Gerente;

import java.awt.*;

public class PainelCadastrarGerente extends JPanel {
    /**
	 * 
	 */
	private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtSalario;
    private JTextField txtSetor;
	private static final long serialVersionUID = 1L;

    public PainelCadastrarGerente() {
        setLayout(new GridLayout(4, 2, 5, 5));

        JLabel lblNome = new JLabel("Nome:");
        add(lblNome);

        txtNome = new JTextField(20);
        add(txtNome);

        JLabel lblCpf = new JLabel("CPF:");
        add(lblCpf);

        txtCpf = new JTextField(20);
        add(txtCpf);

        JLabel lblSalario = new JLabel("Sal�rio:");
        add(lblSalario);

        txtSalario = new JTextField(20);
        add(txtSalario);

        JLabel lblSetor = new JLabel("Setor:");
        add(lblSetor);

        txtSetor = new JTextField(20);
        add(txtSetor);
    }

    public Gerente getGerente() {
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        double salario = Double.parseDouble(txtSalario.getText());
        String setor = txtSetor.getText();

        return new Gerente(nome, cpf, salario, setor);
    }

    public void limparCampos() {
        txtNome.setText("");
        txtCpf.setText("");
        txtSalario.setText("");
        txtSetor.setText("");
    }
}
