public class Operadores {
    public static void main(String[] args) {
        // Operadores de comparação
        int num1 = 1;
        int num2 = 2;

        //verifica se a compração é verdadeira:
        boolean simNao = num1 == num2;

        //alterando o valor da verificação para verdadeiro: 
        // num2 = num1;
        // simNao = num1 == num2;

        //printa o resultado:
        System.out.println(simNao);
        
        //verifica e compara a negação de uma das variaves:
        simNao = num1 != num2;
        System.out.println(simNao);
    }
}