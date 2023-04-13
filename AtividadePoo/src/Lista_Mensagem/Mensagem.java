package Lista_Mensagem;

import javax.swing.JOptionPane;

public class Mensagem {
    public static void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static String pedirEntrada(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }
    
    public static String escolherOpcao(String[] opcoes) {
        return (String) JOptionPane.showInputDialog(null, "Escolha uma opcao:", "Opcoes", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
    }
    
    public static int mostrarConfirmacao(String mensagem) {
        return JOptionPane.showConfirmDialog(null, mensagem, "Confirmacao", JOptionPane.YES_NO_OPTION);
    }
}

