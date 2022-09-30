package fixacao2;

import javax.swing.*;

public class escola {
    public static void main(String[] arg) {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a opção desejada\n\n1 - Novo aluno \n2 - Inserir notas \n3 - Imprimir Resultado \n4 - Sair"));
        aluno a;

        a = new aluno();
        while (escolha != 4) {
            if (escolha == 1) {
                a.setnome(JOptionPane.showInputDialog("Digite o nome do aluno"));
                a.setmatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula do aluno")));
                escolha = 4;
            }
            if (escolha == 2) {
                a.setnota1(Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: ")));
                a.setnota2(Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota nota: ")));
                a.setnota3(Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: ")));
                escolha = 4;
            }
            if (escolha == 3) {
                System.out.println(
                        "Nome do aluno: " + a.getnome() + "\nMatricula do aluno: " + a.getmatricula() + "\n\nNota 1: "
                                + a.getnota1() + "\n\nNota 2: " + a.getnota2() + "\n\nNota 3: " + a.getnota3());
            }
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a opção desejada\n\n1 - Novo aluno \n2 - Inserir notas \n3 - Imprimir Resultado \n4 - Sair"));
            }
        }
    }


