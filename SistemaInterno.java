import javax.swing.JOptionPane;

public class SistemaInterno {
   public static void main(String [] args){
      
      
      TelaLogin login = new TelaLogin();
      JOptionPane.showMessageDialog(null, login.autenticarLogin());
      
   }
}