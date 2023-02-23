import javax.swing.JOptionPane;

public class exercicio6 {
    //Escreva uma função recursiva que retorne o menor elemento de um vetor
    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor: "));
        int menor = 100000000;

        int vetor[] = new int[n];
        
        for(int i=0; i<n; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor para a posição " + (i+1) +"º do vetor"));
        }

        int result=0;

        result = menor(vetor, n-1, menor);
        System.out.println("O menor valor é: " + result);
    }

    public static int menor(int vetor[], int n, int menor) {
        
        if(n>=0){
            if(vetor[n] <= menor){
                menor = vetor[n];
                return menor(vetor, n-1, menor);
            }
        }
        return menor;
    }
}
