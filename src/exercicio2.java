import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {
        //Implemente, de forma recursiva, uma função int pot(int x, int n) 
        //que, dados dois números inteiros x e n, calcula o valor de x^n

        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));
        int elevado;
        elevado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite elevado a: "));

        JOptionPane.showMessageDialog(null, "O resultado da potencia é: " + pot(num, elevado));
    }

    public static int pot(int x, int n) {
        if(n == 1){
            return x;
        }
        else{
            return x*pot(x, n-1);
        }
    }
}
