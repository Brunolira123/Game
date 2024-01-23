package model;

import java.util.Random;

/**
 *
 * @author Bruno
 */
public class Calcular {

    private int dificuldade;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultado;

    public Calcular(int dificuldade) {

        Random randon = new Random();
        //0 - somar, 1 - subtrair, 2 - multiplicar 
        this.operacao = randon.nextInt(3);
        this.dificuldade = dificuldade;

        if (dificuldade == 1) {
            //fácil
            this.valor1 = randon.nextInt(10); // gera valor de 0 a 9
            this.valor2 = randon.nextInt(10); // gera valor de 0 a 9      
        } else if (dificuldade == 2) {
            //médio
            this.valor1 = randon.nextInt(100); // gera valor de 0 a 99
            this.valor2 = randon.nextInt(100); // gera valor de 0 a 99   
        } else if (dificuldade == 3) {
            //dificil
            this.valor1 = randon.nextInt(1000); // gera valor de 0 a 999
            this.valor2 = randon.nextInt(1000); // gera valor de 0 a 999  
        } else if (dificuldade == 4) {
            //insano
            this.valor1 = randon.nextInt(1000); // gera valor de 0 a 9999
            this.valor2 = randon.nextInt(1000); // gera valor de 0 a 9999 
        } else {
            //ultra
            this.valor1 = randon.nextInt(10000); // gera valor de 0 a 99999
            this.valor2 = randon.nextInt(10000); // gera valor de 0 a 99999 
        }
    }

    /**
     * @return the dificuldade
     */
    public int getDificuldade() {
        return dificuldade;
    }

    /**
     * @return the valor1
     */
    public int getValor1() {
        return valor1;
    }

    /**
     * @return the valor2
     */
    public int getValor2() {
        return valor2;
    }

    /**
     * @return the operacao
     */
    public int getOperacao() {
        return operacao;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        String op;
        if (this.getOperacao() == 0) {
            op = "Somar";
        } else if (this.getOperacao() == 1) {
            op = "Subtracao";
        } else if (this.getOperacao() == 0) {
            op = "Multiplicar";
        } else {
            op = "Operação desconhecida";
        }
        return "Valor 1: " + this.getValor1()
                + "\nValor 2: " + this.getValor2()
                + "\nDificuldade : " + this.getDificuldade()
                + "\nOperação :" + op;
    }
    
    public boolean somar(int resposta){
        this.resultado = this.getValor1() + this.getValor2();
        boolean correto = false;
        
        if(resposta == this.getResultado()){
            System.out.println("Resposta Correta!");
            correto = true;
        }else{
            System.out.println("Resposta Errada!");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
        return correto;
    }
    
    public boolean subtracao(int resposta){
        this.resultado = this.getValor1() - this.getValor2();
        boolean correto = false;
        
        if(resposta == this.getResultado()){
            System.out.println("Resposta Correta!");
            correto = true;
        }else{
            System.out.println("Resposta Errada!");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
        return correto;
    }
    
    public boolean multiplicar(int resposta){
        this.resultado = this.getValor1() * this.getValor2();
        boolean correto = false;
        
        if(resposta == this.getResultado()){
            System.out.println("Resposta Correta!");
            correto = true;
        }else{
            System.out.println("Resposta Errada!");
        }
        System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());
        return correto;
    }

}
