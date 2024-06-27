import br.alura.conversor.ConversorMoedas;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConversorMoedas moedas = new ConversorMoedas();

        System.out.println(moedas.setDollar(15) );
        moedas.converterDolarParaReal();
    }
}