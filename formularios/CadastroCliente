package formularios;

import javax.swing.*;
import java.awt.Color;

public class CadastroCliente extends JDialog {
    private JPanel contentPane;
    private JLabel Hotel;
    private JTable Tabela;
    private JTextField cNome;
    private JTextField cCodigo;
    private JFormattedTextField cCpf;
    private JFormattedTextField cTelefone;
    private JTextField cEmail;
    private JLabel c;
    private JButton bntSalvar;
    private JButton bntCancelar;
    private JButton bntEditar;
    private JButton bntRemover;

    private JButton buttonOK;

    public CadastroCliente() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        Hotel.setForeground(Color.BLACK);

        configureTextField(cNome);
        configureTextField(cCodigo);
        configureTextField(cCpf);
        configureTextField(cTelefone);
        configureTextField(cEmail);

        configureButton(bntSalvar);
        configureButton(bntCancelar);
        configureButton(bntEditar);
        configureButton(bntRemover);

        configureTable(Tabela);
    }

    private void configureTextField(JTextField textField) {
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        textField.setCaretColor(Color.BLACK);
    }

    private void configureButton(JButton button) {
    }

    private void configureTable(JTable table) {
    }

    public static void main(String[] args) {
        CadastroCliente dialog = new CadastroCliente();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
