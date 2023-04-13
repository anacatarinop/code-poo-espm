package Comandos_Painel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Models.Cliente;

public class PainelCadastrarCliente extends JPanel {
    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtEmail;
    private JTextField txtTelefone;
    private static final long serialVersionUID = 1L;

    public PainelCadastrarCliente() {
        setLayout(new GridLayout(4, 2, 5, 5));

        JLabel lblNome = new JLabel("Nome:");
        add(lblNome);

        txtNome = new JTextField(20);
        add(txtNome);

        JLabel lblCpf = new JLabel("CPF:");
        add(lblCpf);

        txtCpf = new JTextField(20);
        add(txtCpf);

        JLabel lblEmail = new JLabel("E-mail:");
        add(lblEmail);

        txtEmail = new JTextField(20);
        add(txtEmail);

        JLabel lblTelefone = new JLabel("Telefone:");
        add(lblTelefone);

        txtTelefone = new JTextField(20);
        add(txtTelefone);
    }

    public Cliente getCliente() {
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        String email = txtEmail.getText();
        String telefone = txtTelefone.getText();

        return new Cliente(nome, cpf, email, telefone);
    }

    public void limparCampos() {
        txtNome.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
    }
}
