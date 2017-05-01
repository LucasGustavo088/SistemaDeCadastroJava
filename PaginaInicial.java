import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaginaInicial extends JFrame implements ActionListener{
//atributos e variaveis
   //labels
   private JLabel lBemVindo;
   
//construtor
   public PaginaInicial(){
   super("Sistema de Cadastro de Cliente");
   
   //instaciando os atributos
   lBemVindo = new JLabel("Bem Vindo!");
   
   //organizando os componentes (LAYOUT)
   Container container = getContentPane();
   container.setLayout(new FlowLayout());
   
   //adicionando os componentes na tela
   container.add(lBemVindo);
   
   //seta o tamanho da tela e programa pra fechar o programa quando sair
   setSize(400,300);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setVisible(false);
   }  
   
   public void actionPerformed(ActionEvent e){
   
   }
}