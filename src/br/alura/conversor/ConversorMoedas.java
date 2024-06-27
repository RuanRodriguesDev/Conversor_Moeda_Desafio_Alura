package br.alura.conversor;

import java.util.Scanner;

public class ConversorMoedas implements ConversaoFinanceira {
    public double dollar;
    public double real;
    public double conversao;
    private double cotacao = 5.12;


    public double getDollar() {
        return dollar;
    }

    public double setDollar(double dollar) {
        this.dollar = dollar;

        return dollar;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }


    @Override
    public double converterDolarParaReal() {

        if(converterDolarParaReal() == dollar){
            return conversao = real / cotacao;
        }else if(converterDolarParaReal() == real ){
            return conversao = dollar * cotacao;
        }

        return 0;
    }
}
