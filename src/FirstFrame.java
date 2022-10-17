import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Container;

public class FirstFrame extends JFrame{

    public FirstFrame(){
    
        super("Primeiro Frame com botões");  //Titulo

        Container c = getContentPane();   //Criando Container

        //Criando botões com areas determinadas no padrão BorderLayout
        c.add(BorderLayout.NORTH, new JButton("Botão Norte"));      
        c.add(BorderLayout.CENTER, new JButton("Botão Central"));
        c.add(BorderLayout.EAST, new JButton("Botão Leste"));
        c.add(BorderLayout.WEST, new JButton("Botão Oeste"));
        c.add(BorderLayout.SOUTH, new JButton("Botão Sul"));
       

        //Configurando o frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FirstFrame();
    }

}