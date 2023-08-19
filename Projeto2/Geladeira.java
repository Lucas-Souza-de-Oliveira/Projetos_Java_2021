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
public class Geladeira extends Produto{
    private double temperaturaMinima;
    private double temperaturaMaxima;
    Porta porta1 = new Porta();

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public Geladeira(double temperaturaMinima, double temperaturaMaxima, String marca, String modelo, int volume, double preço, double comprimento, double largura, boolean vidro, double comprimento2, double largura2, boolean vidro2) {
        super(marca, modelo, volume, preço, comprimento, largura, vidro);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        porta1.comprimento = comprimento;
        porta1.largura = largura;
        porta1.vidro = vidro;
        porta1.comprimento2 = comprimento2;
        porta1.largura2 = largura2;
        porta1.vidro2 = vidro2;
    }

    public Geladeira(double temperaturaMinima, double temperaturaMaxima, String marca, String modelo, double preço) {
        super(marca, modelo, preço);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Geladeira(double temperaturaMinima, double temperaturaMaxima, String marca, String modelo, double comprimento, double largura, boolean vidro, double comprimento2, double largura2, boolean vidro2) {
        super(marca, modelo, comprimento, largura, vidro);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        porta1.comprimento = comprimento;
        porta1.largura = largura;
        porta1.vidro = vidro;
        porta1.comprimento2 = comprimento2;
        porta1.largura2 = largura2;
        porta1.vidro2 = vidro2;
    }

    public Geladeira(double temperaturaMinima, double temperaturaMaxima, String marca, int volume, double comprimento, double largura, boolean vidro, double comprimento2, double largura2, boolean vidro2) {
        super(marca, volume, comprimento, largura, vidro);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        porta1.comprimento = comprimento;
        porta1.largura = largura;
        porta1.vidro = vidro;
        porta1.comprimento2 = comprimento2;
        porta1.largura2 = largura2;
        porta1.vidro2 = vidro2;
    }

    public Geladeira(double preço, double temperaturaMinima, double temperaturaMaxima) {
        super(preço);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Geladeira(String marca, String modelo, double preço) {
        super(marca, modelo, preço);
    }

    public Geladeira(String marca, double preço) {
        super(marca, preço);
    }

    public Geladeira(String marca, int volume, double comprimento, double largura, boolean vidro, double comprimento2, double largura2, boolean vidro2) {
        super(marca, volume, comprimento, largura, vidro);
        porta1.comprimento = comprimento;
        porta1.largura = largura;
        porta1.vidro = vidro;
        porta1.comprimento2 = comprimento2;
        porta1.largura2 = largura2;
        porta1.vidro2 = vidro2;
    }

    public Geladeira(int volume, double preço) {
        super(volume, preço);
    }

    public Geladeira(double preço) {
        super(preço);
    }
    
    public Geladeira(){
    }
    
    public void cadTempMin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura minima do produto: "); //Temperatura minima
        setTemperaturaMinima(scanner.nextDouble());
    }
    
    public void cadTempMax(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura maxima do produto: "); //Temperatura maxima
        setTemperaturaMaxima(scanner.nextDouble());
    }
    
    public void printGelad(){
        if(getTemperaturaMinima() == 0){
        } else{
        System.out.println("Temperatura minima da geladeira: "+ getTemperaturaMinima());
        }
        if(getTemperaturaMaxima() == 0){
        } else{
        System.out.println("Temperatura maxima da geladeira: "+ getTemperaturaMaxima());
        }
    }
    
    public void printAllGelad(){
        System.out.println("\n\t\t\t\tInformações cadastradas");
        System.out.println("\n=--------------------------------------------------------------------------------------=\n");
        print();
        printGelad();
        porta1.printPorta2();
    }
    
    public void printAnyButDoorGelad(){
        System.out.println("\n\t\t\t\tInformações cadastradas\n");
        System.out.println("\n=--------------------------------------------------------------------------------------=\n");
        print();
        printGelad();
    }
}
