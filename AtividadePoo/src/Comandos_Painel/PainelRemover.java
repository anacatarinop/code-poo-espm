package Comandos_Painel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Models.Pessoa;

public class PainelRemover extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtCpf;
    private JTextArea txtAreaResultado;
    
    public PainelRemover() {
        setLayout(new BorderLayout(5, 5));
        
        JPanel pnlCampo = new JPanel();
        pnlCampo.setLayout(new GridLayout(1, 2, 5, 5));
        
        JLabel lblCpf = new JLabel("CPF:");
        pnlCampo.add(lblCpf);
        
        txtCpf = new JTextField();
        pnlCampo.add(txtCpf);
        
        add(pnlCampo, BorderLayout.NORTH);
        
        txtAreaResultado = new JTextArea();
        txtAreaResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaResultado);
        add(scrollPane, BorderLayout.CENTER);
    }
    
    public String getCpf() {
        return txtCpf.getText();
    }
    
    public void limpar() {
        txtCpf.setText("");
        txtAreaResultado.setText("");
    }
    
    public void exibirPessoa(Pessoa pessoa) {
        txtAreaResultado.setText(pessoa.toString());
    }
    
    public void exibirMensagem(String mensagem) {
        txtAreaResultado.setText(mensagem);
    }
}
