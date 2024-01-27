public class SomaParesSeqFibonnaci {
    public static void main(String[] args){
        int fib = 1;
        int fib_anterior = 0;
        int soma = 0;
    
        while (fib < 4_000_000){
            int aux = fib;
            fib += fib_anterior;
            fib_anterior = aux;

            if(fib % 2 == 0){
                soma += fib;
            }
        }

        System.out.println(soma);
    }
}
