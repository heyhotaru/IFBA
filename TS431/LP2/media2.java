import javax.swing.*;

public class media2 {
    public static void main(String[] arg) {
        String nome = "null";
        String momento;
        int cm, cr, ca;
        nome = JOptionPane.showInputDialog("Digite o nome do aluno: \n\t Ou digite fim para terminar");
        while (!nome.equals("fim")) {
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite as notas ")),
                    nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite as notas ")),
                    nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite as notas "));
            int faltas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas"));

            float somaMedia = nota1 + nota2 + nota3;

            float media = somaMedia / 3;
            cm = 0;
            cr = 0;
            ca = 0;

            if (media <= 6) {
                momento = "Reprovado por nota";
                cm++;
            } else {

            }
            if (faltas >= 18) {
                momento = "Reprovado por falta";
                cr++;
            } else {
                momento = "Aprovado";
                ca++;
            }
            nome = JOptionPane.showInputDialog("Digite o nome do aluno: \n\t Ou digite fim para terminar");
            System.out.println("Aluno " + nome + "\nMedia " + media + "\nFaltas " + faltas + "\nSituação " + momento);
        }
    }
}