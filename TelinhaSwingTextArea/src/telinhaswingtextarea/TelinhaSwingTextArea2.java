package telinhaswingtextarea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelinhaSwingTextArea2 implements ActionListener {

    private JTextField textField;
    private JTextArea textArea;

    public TelinhaSwingTextArea2() {
        JFrame frame = new JFrame("Exemplo de TextArea");

        textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);

        textArea = new JTextArea();
        textArea.setBounds(50, 100, 300, 200);

        JButton button = new JButton("Adicionar texto");
        button.setBounds(50, 350, 150, 30);
        button.addActionListener(this); // Registrar esta classe como ouvinte

        frame.add(textField);
        frame.add(textArea);
        frame.add(button);

        frame.setSize(400, 450);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String texto = textField.getText();
        textArea.append(texto + "\n");
        textField.setText(""); // Limpar o campo de texto após adicionar o texto na área de texto
    }
}
