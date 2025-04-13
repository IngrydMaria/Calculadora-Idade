import javax.swing.*;

public class Calculadora {
    public static void main (String [] args){
        int ano = 2023;
        String nome;
        int anoNascimento;

        while (true){
            String lernome = JOptionPane.showInputDialog("Digite o nome da primeira pessoa: (ou '0000' para finalizar): ");
            nome = lernome;
            if (nome.equals("0000")){
                break;
            }
            String leridade = JOptionPane.showInputDialog( "Digite o ano de nascimento de "+nome+": ");
            anoNascimento = Integer.parseInt(leridade);

            int idade = ano-anoNascimento;

            if (idade <= 18){
                JOptionPane.showMessageDialog(null, "Nome: "+nome+" | Idade: "+idade+" anos (Menor que 18 anos.");
            }
            if (idade <= 30){
                JOptionPane.showMessageDialog(null, "Nome: "+ nome+ " | Idade: "+idade+" anos (Menor ou igual a 30 anos.");
            }
            if (idade <50){
                JOptionPane.showMessageDialog(null, "Nome: "+nome+ " | Idade: "+idade+" anos (Menor que 50 anos)");
            }
            if (idade <80){
                JOptionPane.showMessageDialog(null, "Nome "+nome+" | Idade: "+ idade+ " anos (Menor que 80 anos)");
            }

        }
        JOptionPane.showMessageDialog(null, "Programa finalizado.");
    }
}
