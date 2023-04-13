package Comandos_Painel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Models.Empregado;
import Models.Pessoa;

public class PainelListarEmpregados extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea txtAreaResultado;
    
    public PainelListarEmpregados() {
        setLayout(new BorderLayout(5, 5));
         JLabel lblTitulo = new JLabel("Empregados");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        add(lblTitulo, BorderLayout.NORTH);
        
        txtAreaResultado = new JTextArea();
        txtAreaResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaResultado);
        add(scrollPane, BorderLayout.CENTER);
    }
    
    public void listarEmpregados(ArrayList<Pessoa> pessoas) {
        StringBuilder sb = new StringBuilder();
        
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Empregado) {
                sb.append(pessoa.toString());
                sb.append("\n\n");
            }
        }
        
        txtAreaResultado.setText(sb.toString());
    }
}
