package atividadefixacao;

import javax.swing.*;

public class CotroleDeVoo {
    public static void main(String[] arg) {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a opção desejada\n\n1 Para criar NOVO VOO \n2 Para Informar Situação \n3 Para Imprimir Informações de Voo"));
        voo a;

        a = new voo();
        while (escolha != 4) {
            if (escolha == 1) {
                a.setNumero(JOptionPane.showInputDialog("Digite o número do voo: "));
                a.setCapacidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade do voo: ")));
                a.setOrigem(JOptionPane.showInputDialog("Digite a Origem do voo: "));
                a.setDestino(JOptionPane.showInputDialog("Digite o Destino do Voo: "));
            }
            if (escolha == 2) {
                a.setNoHorario(true);
                if (a.NoHorario == true) {
                    a.NoHorario = false;
                    System.out.println(a.getHorario());
                    escolha = 4;
                }
            }
            if (escolha == 3) {
                System.out.println("Numero do voo: " + a.getNumero() + "\nCapacidade de voo: " + a.getCapacidade()
                        + "\nOrigem do voo: " + a.getOrigem() + "\nDestino do voo: " + a.getDestino() + "\nNoHorario: "
                        + a.getHorario());
            }
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite a opção desejada\n 1 Para criar NOVO VOO \n2 Para Informar Situação \n 3 Para Imprimir Voo"));
        }
    }
}
