import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[] args) {
        //Faça uma função recursiva que receba um número inteiro positivo N 
        //e exiba todos os números de 0 até N em ordem crescente
        int n;
        int cont=0;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));

        exibir(n, cont);
    }

    public static int exibir(int n, int cont) {
        if(n<0){
            return cont;
        }
        else{
            System.out.println(cont);
            cont++;
            return exibir(n-1, cont);
        }
    }
}
