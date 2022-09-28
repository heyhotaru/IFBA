import javax.swing.*;

public class salario {
    public static void main(String[] arg) {
        String nome = "null";
        String sexo = "null";
        String hnovo = "null";
        int idade = 0;
        float salario = 0, vsalario = 0;
        int cn, cs, css, qpessoas, h, m, idades;
        qpessoas = 0;
        nome = JOptionPane.showInputDialog("Digite o nome do funcionario: ");
        qpessoas++;
        while (!nome.equals("fim")) {
            cn = 0;
            cs = 0;
            css = 0;
            idades = 0;
            sexo = JOptionPane.showInputDialog("Digite o sexo (h para homem e m para mulher)");
            cs++;
            salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario"));
            css++;
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade "));
            idades++;

            System.out.println(cs + "" + +css + "" + idades);

        }
    }
}
