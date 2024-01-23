package view;

import java.util.Scanner;
import model.Calcular;

/**
 *
 * @author Bruno
 */
public class Game {

    static Scanner sc = new Scanner(System.in);
    static int pontos = 0;
    static Calcular calc;

    public static void main(String[] args) {

        Game.jogar();

    }

    public static void jogar() {
        System.out.println("Informe o nível de dificuldade desejado de 01 à 04: ");
        int dificuldade = Game.sc.nextInt();

        Game.calc = new Calcular(dificuldade);

        System.out.println("Informe o resultado da seguinte operação: ");
        
        //somar
        if(calc.getOperacao() == 0){
            System.out.println(calc.getValor1()+ " + " + calc.getValor2());
            int resposta = Game.sc.nextInt();
            
            if(calc.somar(resposta)){
                //Ganha 1 ponto
                Game.pontos =+1;
                System.out.println("Você tem "+ Game.pontos + " ponto(s)");
            }
        }
        
        //subtracao
        else if(calc.getOperacao() == 1){
            System.out.println(calc.getValor1()+ " - " + calc.getValor2());
            int resposta = Game.sc.nextInt();
            
            if(calc.subtracao(resposta)){
                //Ganha 1 ponto
                Game.pontos =+1;
                System.out.println("Você tem "+ Game.pontos + " ponto(s)");
            }
        }
        
        //multiplicar
        else if(calc.getOperacao() == 1){
            System.out.println(calc.getValor1()+ " * " + calc.getValor2());
            int resposta = Game.sc.nextInt();
            
            if(calc.multiplicar(resposta)){
                //Ganha 1 ponto
                Game.pontos =+1;
                System.out.println("Você tem "+ Game.pontos + " ponto(s)");
            }
        }else{
            System.out.println("A operação "+  calc.getOperacao() + " não é reconhecida");
        }
        System.out.println("Deseja continuar? [1 - sim, 0 - não");
        int continuar = Game.sc.nextInt();
        
        if(continuar ==1){
            Game.jogar();
        }else{
            System.out.println("Você fez " + Game.pontos + " ponto(s)");
            System.out.println("Até a próxima");
            System.exit(0);
        }
    }

}
