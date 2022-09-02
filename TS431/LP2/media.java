import javax.swing.*;
public class media {
    public static void main( String [] arg){
        String nomeAluno = JOptionPane.showInputDialog("Digite o seu nome");
        float a = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota "));
        float b = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota "));
        float c = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota "));
        float soma = a + b + c;
        float media = soma / 3;

        System.out.println("O nome do aluno é: " + nomeAluno + "\n" + "A média do aluno é: " + media);
    }
}