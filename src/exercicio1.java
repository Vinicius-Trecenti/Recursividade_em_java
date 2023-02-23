import javax.swing.JOptionPane;

public class exercicio1 {
    public static void main(String[] args) {
        //Crie uma função recursiva int soma(int) 
        //que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N
        int num=0;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de N: "));
        
        JOptionPane.showMessageDialog(null, "O resultado é: " + soma(num));
    }

    public static int soma(int n) {
        if(n == 0 ){
            return 0;
        }
        else {
            return n = n+soma(n-1);
        }
    }
}