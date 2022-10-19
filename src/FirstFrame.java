import javax.swing.JFrame;

import org.w3c.dom.events.Event;

import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstFrame extends JFrame implements ActionListener{

    public FirstFrame(){
    
        super("Primeiro Frame com botões");  //Titulo

        Container c = getContentPane();   //Criando Container

        
        //Criando botões com areas determinadas no padrão BorderLayout
        JButton botaonorte  = new JButton("Botão Norte");
        JButton botaoleste  = new JButton("Botão Leste");
        JButton botaooeste  = new JButton("Botão Oeste");
        JButton botaosul    = new JButton("Botão Sul");
        JButton botaocentro = new JButton("Botão Central");

        c.add(botaonorte,   BorderLayout.NORTH);
        c.add(botaoleste,   BorderLayout.EAST);
        c.add(botaooeste,   BorderLayout.WEST);
        c.add(botaosul,     BorderLayout.SOUTH);
        c.add(botaocentro,  BorderLayout.CENTER);


        //Criando Listeners para os botões
        botaonorte.addActionListener(this);
        botaoleste.addActionListener(this);
        botaooeste.addActionListener(this);
        botaosul.addActionListener(this);
        botaocentro.addActionListener(this);


        //Relacionando os botões com as ações
        botaonorte.setActionCommand("botaonorte");
        botaoleste.setActionCommand("botaoleste");
        botaooeste.setActionCommand("botaooeste");
        botaosul.setActionCommand("botaosul");
        botaocentro.setActionCommand("botaocentro");
       

        //Configurando o frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FirstFrame();
    }


    //Ações realizadas ao clicar nos botões
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        switch (e.getActionCommand()){
            case "botaonorte":
                System.out.println("Você clicou no botão Norte!");
            break;
            case "botaoleste":
                System.out.println("Você clicou no botão Leste!");
            break;
            case "botaooeste":
                System.out.println("Você clicou no botão Oeste!");
            break;
            case "botaosul":
                System.out.println("Você clicou no botão Sul!");
            break;
            case "botaocentro":
                System.out.println("Você clicou no botão Central!");
            break;

            default:
                System.out.println("Comando inválido!");
        }
    }

}