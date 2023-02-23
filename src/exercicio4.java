import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args) {
        // Faça uma função recursiva que receba um número inteiro positivo N 
        // e exiba todos os números de N até 0 em ordem decrescente

        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));
        exibir(n);
    }

    public static int exibir(int n) {
        System.out.println(n);
        if(n == 0){
            return 0;
        }
        else{
            return exibir(n-1);
        }
    }
}