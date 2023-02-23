import javax.swing.JOptionPane;

public class exercicio7 {
    public static void main(String[] args) {
        // Um problema típico em ciência da computação consiste em converter um número da sua forma decimal para a forma binária.
        // A forma mais simples de fazer isso é dividir o número sucessivamente por 2, onde o resto da i-ésima divisão vai ser o 
        // dígito i do número binário (da direita para a esquerda).

        // Por exemplo: 12 / 2 = 6, resto 0 (1º dígito da direita para esquerda), 6 / 2 = 3, resto 0 (2º dígito da direita para esquerda), 
        // 3 / 2 = 1 resto 1 (3º dígito da direita para esquerda), 1 / 2 = 0 resto 1 (4º dígito da direita para esquerda). 
        // Resultado: 12 = 1100


        // Escreva um método recursivo Dec2Bin(int n) que dado um número decimal exiba sua representação binária corretamente

        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor decimal para converter"));

        Dec2Bin(n);
    }

    public static void Dec2Bin(int n) {
        if(n>0){
            Dec2Bin(n/2);
            System.out.print(n%2);
        }else
            System.out.print(0);
        }
}
