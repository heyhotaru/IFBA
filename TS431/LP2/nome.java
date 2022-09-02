import javax.swing.*;
public class nome {
    public static void main (String [] arg){
        String nome = JOptionPane.showInputDialog("Digite o seu nome ");
        String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome ");
        
        System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
    }
}