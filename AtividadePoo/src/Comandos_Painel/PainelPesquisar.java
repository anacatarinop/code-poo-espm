package Comandos_Painel;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PainelPesquisar extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtCpf;

    public PainelPesquisar() {
        setLayout(new GridLayout(1, 2, 5, 5));

        JLabel lblCpf = new JLabel("CPF:");
        add(lblCpf);

        txtCpf = new JTextField(20);
        add(txtCpf);
    }

    public String getCpf() {
        return txtCpf.getText();
    }

    public void limparCampos() {
        txtCpf.setText("");
    }
}

