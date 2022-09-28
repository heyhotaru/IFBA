import javax.swing.*;
public class petshop{
    public static void main(String [] arg) {
        meupet a;
        
        a = new meupet();
        a.setNome(JOptionPane.showInputDialog("Digite o nome do seu pet"));
        a.setEspecie(JOptionPane.showInputDialog("Digite a especie do seu pet"));
        a.setRaca(JOptionPane.showInputDialog("Digite a raça do seu pet"));
        a.setSexo(JOptionPane.showInputDialog("Digite o sexo do seu pet").charAt(0));
        a.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do seu pet")));
        a.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do seu pet")));


        System.out.println("Nome: " + a.getNome() + "\nEspecie: " + a.getEspecie() + "\nRaca: " + a.getRaca() + "\nSexo: " + a.getSexo() + "\nIdade: " + a.getIdade() + "\nPeso: " + a.getPeso());
    }
    
}
