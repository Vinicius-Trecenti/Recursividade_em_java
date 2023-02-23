import javax.swing.JOptionPane;

public class exercicio5 {
    public static void main(String[] args) {
        //Crie uma função recursiva 
        //que retorne a soma dos elementos de um vetor de N inteiros 
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de N: "));

        int vetor[] = new int[n];
        
        for(int i=0; i<n; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Digite o valor para a posição " + (i+1) +"º do vetor"));
        }

        int result=0;
        result = somar(vetor, n-1);
        System.out.println("O valor da soma dos valores é: " + result);
        
    }

    public static int somar(int vetor[], int N) {

        if(N > 0){
            return vetor[N] + somar(vetor, N-1);   
        }
        return vetor[N];
    }
}
