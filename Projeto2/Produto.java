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
public class Produto {
    private String marca, modelo;
    private int volume;
    private double preço;
    Porta porta = new Porta();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public Produto(String marca, String modelo, int volume, double preço, double comprimento, double largura, boolean vidro) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.preço = preço;
        porta.comprimento = comprimento;
        porta.largura = largura;
        porta.vidro = vidro;
    }

    public Produto(String marca, String modelo, int volume, double comprimento, double largura, boolean vidro) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        porta.comprimento = comprimento;
        porta.largura = largura;
        porta.vidro = vidro;
    }

    public Produto(String marca, String modelo, double preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.preço = preço;
    }

    public Produto(String marca, String modelo, double comprimento, double largura, boolean vidro) {
        this.marca = marca;
        this.modelo = modelo;
        porta.comprimento = comprimento;
        porta.largura = largura;
        porta.vidro = vidro;
    }

    public Produto(String marca, double preço) {
        this.marca = marca;
        this.preço = preço;
    }

    public Produto(String marca, int volume, double comprimento, double largura, boolean vidro) {
        this.marca = marca;
        this.volume = volume;
        porta.comprimento = comprimento;
        porta.largura = largura;
        porta.vidro = vidro;
    }

    public Produto(int volume, double preço) {
        this.volume = volume;
        this.preço = preço;
    }

    public Produto(double preço) {
        this.preço = preço;
    }
    
    public Produto(){
    }
    
    public void cadMarc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca do produto: "); //Marca
        setMarca(scanner.nextLine());
    }
    
    public void cadModel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo do produto: "); //Modelo
        setModelo(scanner.nextLine());
    }
    
    public void cadVolu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o volume do produto: "); //Volume
        setVolume(scanner.nextInt());
    }
    
    public void cadPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do produto: "); //Preço
        setPreço(scanner.nextDouble());
    }
    
    public void print(){
        if(getMarca() == null){
        } else {
            System.out.println("Marca do produto: "+ getMarca());
        }
        if(getModelo() == null){
        } else {
        System.out.println("Modelo do produto: "+ getModelo());
        }
        if(getVolume() == 0){
        } else {
        System.out.println("Volume do produto: "+ getVolume());
        }
        if(getPreço() == 0){
        } else {
        System.out.println("Preço do produto: "+ getPreço());
        }
    }
}
