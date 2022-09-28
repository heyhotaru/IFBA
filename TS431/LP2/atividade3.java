import javax.swing.*;

public class atividade3 {
    public static void main(String [] arg){
        String nome = "null";
        String sexo = "M ou F";
        int idade = 0;
        float salario = 0;

        while(!nome.equals("fim")){
            nome = JOptionPane.showInputDialog("Digite o nome do funcionario ou digite fim para sair");
            int countnome = 0;
                if(nome != "fim"){
                    countnome = countnome + 1;
                }
            
            sexo = JOptionPane.showInputDialog("Digite o seu sexo, M para masculino ou F para feminino");
            int countsexom = 0;
            int countsexof = 0;
            int idademMenor = 0;
            int idademMaior = 0;
            int idadefMenor = 0;
            int idadefMaior = 0;
            int idadem = 0;
            int idadef = 0;

                if(sexo == "M"){
                    countsexom = countsexom + 1;
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
                    idade = idadem;
                    if(idadem > idadem){
                        
                    }
                }else{
                    countsexof = countsexof + 1;
                }

                
        }

    }
    
}
