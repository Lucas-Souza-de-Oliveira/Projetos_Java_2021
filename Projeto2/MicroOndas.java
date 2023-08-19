/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aia2;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class MicroOndas extends Produto{
    private int potenciaMinima;
    private int potenciaMaxima;
    Porta porta1 = new Porta();

    public void setPotenciaMinima(int potenciaMinima) {
        this.potenciaMinima = potenciaMinima;
    }
    
    public int getPotenciaMinima() {
        return potenciaMinima;
    }
    
    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }
    
    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public MicroOndas(int potenciaMinima, int potenciaMaxima, String marca, String modelo, int volume, double preço, double comprimento, double largura, boolean vidro) {
        super(marca, modelo, volume, preço, comprimento, largura, vidro);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
        porta1.comprimento = comprimento;
        porta1.largura = largura;
        porta1.vidro = vidro;
    }

    public MicroOndas(int potenciaMinima, int potenciaMaxima, String marca, String modelo, int volume, double comprimento, double largura, boolean vidro) {
        super(marca, modelo, volume, comprimento, largura, vidro);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
        porta1.comprimento = comprimento;
        porta1.largura = largura;
        porta1.vidro = vidro;
    }

    public MicroOndas(int potenciaMinima, int potenciaMaxima, String marca, String modelo, double comprimento, double largura, boolean vidro) {
        super(marca, modelo, comprimento, largura, vidro);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
        porta1.comprimento = comprimento;
        porta1.largura = largura;
        porta1.vidro = vidro;
    }

    public MicroOndas(int potenciaMinima, int potenciaMaxima, String marca, int volume, double comprimento, double largura, boolean vidro) {
        super(marca, volume, comprimento, largura, vidro);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
        porta1.comprimento = comprimento;
        porta1.largura = largura;
        porta1.vidro = vidro;
    }

    public MicroOndas(int potenciaMinima, int potenciaMaxima, int volume, double preço) {
        super(volume, preço);
        this.potenciaMinima = potenciaMinima;
        this.potenciaMaxima = potenciaMaxima;
    }

    public MicroOndas(String marca, String modelo, int volume, double comprimento, double largura, boolean vidro) {
        super(marca, modelo, volume, comprimento, largura, vidro);
        porta1.comprimento = comprimento;
        porta1.largura = largura;
        porta1.vidro = vidro;
    }

    public MicroOndas(String marca, String modelo, double preço) {
        super(marca, modelo, preço);
    }

    public MicroOndas(String marca, String modelo, double comprimento, double largura, boolean vidro) {
        super(marca, modelo, comprimento, largura, vidro);
        porta1.comprimento = comprimento;
        porta1.largura = largura;
        porta1.vidro = vidro;
    }

    public MicroOndas(String marca, double preço) {
        super(marca, preço);
    }

    public MicroOndas(double preço) {
        super(preço);
    }
    
    public MicroOndas(){
    }
    
    public void cadPotencMin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a potencia minima do produto: "); //Potencia minima
        setPotenciaMinima(scanner.nextInt());
    }
    
    public void cadPotencMax(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a potencia maxima do produto: "); //Potencia maxima
        setPotenciaMaxima(scanner.nextInt());
    }
    
    public void printMicro(){
        if(getPotenciaMinima() == 0){
        } else{
        System.out.println("Potencia minima da geladeira: "+ getPotenciaMinima());
        }
        if(getPotenciaMaxima() == 0){
        } else{
        System.out.println("Potencia maxima da geladeira: "+ getPotenciaMaxima());
        }
    }
    
    public void printAllMicro(){
        System.out.println("\n\t\t\t\tInformações cadastradas");
        System.out.println("\n=--------------------------------------------------------------------------------------=\n");
        print();
        printMicro();
        porta1.printPorta();
    }
    
    public void printAnyButDoorMicro(){
        System.out.println("\n\t\t\t\tInformações cadastradas\n");
        System.out.println("\n=--------------------------------------------------------------------------------------=\n");
        print();
        printMicro();
    }
}
