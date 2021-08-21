package lista2.academico;

import javax.swing.JOptionPane;
public class TestaAluno {


    public static void main(String args[]){
        aluno obj1 = new aluno();

        obj1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade")));
        obj1.setNumeroAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe número do aluno ")));
        obj1.setNome(JOptionPane.showInputDialog("Informe seu nome"));
        obj1.setP1(Float.parseFloat(JOptionPane.showInputDialog("Informe nota 1")));
        obj1.setP2(Float.parseFloat(JOptionPane.showInputDialog("Informe nota 2")));
    }
}