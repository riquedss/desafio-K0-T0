//Tentativa de fazer o algoritmo mais eficiente.
//A ideia central foi gerar uma sequência que engloba todos os números de 3 e de 5.

class MultiplosTresOrCinco {
    public static void main(String[] args){
        int sequencia = 0;
        int soma = 0;
        int buf_3 = 3;
        int buf_5 = 5;

        while (sequencia < 1000) {
            soma += sequencia;

            if (buf_3 < buf_5){
                sequencia += buf_3;
                buf_5 -= buf_3;
                buf_3 = 3;
            } else if (buf_5 < buf_3) {
                sequencia += buf_5;
                buf_3 -= buf_5;
                buf_5 = 5;
            } else {
                sequencia += buf_5;
                buf_3 = 3;
                buf_5 = 5;
            }
        }

        System.out.printf("A soma da sequência é %d", soma);
    }
}
