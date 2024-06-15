/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telinhaswingtextarea;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TelinhaSwingTextArea {

    TelinhaSwingTextArea()
    {
        JFrame f = new JFrame();
        JTextField area = new JTextField("Welcome to javapoint");
        
        area.setBounds(10,30,200,200);
        
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);       
    }
    
    public static void main(String[] args) {
       //new TelinhaSwingTextArea();
       TelinhaSwingTextArea2 tl = new TelinhaSwingTextArea2();
    }
    
}
