public class MaiorFatorPrimo {
    public static void main(String[] args){
        long numero = 600_851_475_143l;
        long maior_fator_primo = 1;

        if(numero % 2 == 0){
            numero = fatorar(numero, 2);
            maior_fator_primo = 2;
        }
    
        for(long i = 3; i <= numero; i += 2) {
            if(numero % i == 0){
                numero = fatorar(numero, i);
                maior_fator_primo = i;
            }
        }

        System.out.println(maior_fator_primo);
    }

    public static long fatorar(long num_fatorado, long num_fatorador){
        while (num_fatorado % num_fatorador == 0) {
            num_fatorado /= num_fatorador;
        }

        return num_fatorado;
    }

}
