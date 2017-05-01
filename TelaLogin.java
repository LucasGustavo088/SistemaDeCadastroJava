import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame implements ActionListener {
//atributos e variaveis
   //labels
   private JLabel lLogin, lSenha, lLoginResultado;
   //campo de texto
   private JTextField tLogin, tSenha;
   //botões
   private JButton bLogar, bRegistrar;

//construtor   
   public TelaLogin(){
   super("Login");
   
   //instanciando os atributos
   //labels
   lLogin = new JLabel("Login");
   lSenha = new JLabel("Senha");
   lLoginResultado = new JLabel("");
   //campo de texto
   tLogin = new JTextField(10);
   tSenha = new JPasswordField(10);
   //botões
   bLogar = new JButton("Logar");
   bRegistrar = new JButton("Registrar!");
   
   //organizando os componentes (LAYOUT)
   Container container = getContentPane();
   container.setLayout(new FlowLayout());
   
   //adicionando os componentes na tela
   container.add(lLogin);
   container.add(tLogin);
   
   container.add(lSenha);
   container.add(tSenha);
   
   container.add(bLogar);
   container.add(bRegistrar);
   container.add(lLoginResultado);
   
   bLogar.addActionListener(this);
   //seta o tamanho e botao de sair para finalizar programa
   setSize(200,125);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setVisible(true);
   setResizable(false);
   }
   
   public boolean autenticarLogin(){
       //atribuindo login e senha a variaveis locais
      String login = tLogin.getText();
      String senha = new String(((JPasswordField) tSenha).getPassword());
      if(login.equals("admin") && senha.equals("admin")){
            lLoginResultado.setText("Logado com sucesso!");
            setSize(200,140);
            return true;
         } else {
            lLoginResultado.setText("Login Inválido!");
            setSize(200,140);
            return false;
         }
   }
   
   public void actionPerformed(ActionEvent e){
     
      if(e.getSource() == bLogar){
         autenticarLogin();
      }
   }
} 