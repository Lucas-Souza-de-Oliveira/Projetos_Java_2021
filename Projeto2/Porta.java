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
public class Porta {
    double comprimento;
    double largura;
    boolean vidro;
    double comprimento2;
    double largura2;
    boolean vidro2;

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setVidro(boolean vidro) {
        this.vidro = vidro;
    }
    
    public boolean getVidro(){
        return vidro;
    }

    public double getComprimento2() {
        return comprimento2;
    }

    public void setComprimento2(double comprimento2) {
        this.comprimento2 = comprimento2;
    }

    public double getLargura2() {
        return largura2;
    }

    public void setLargura2(double largura2) {
        this.largura2 = largura2;
    }

    public boolean getVidro2() {
        return vidro2;
    }

    public void setVidro2(boolean vidro2) {
        this.vidro2 = vidro2;
    }
    
    
    public void cadCompri(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o comprimento da porta: ");
        setComprimento(scanner.nextDouble());
    }
    
    public void cadLarg(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura da porta: ");
        setLargura(scanner.nextDouble());
    }
    
    public void cadVidro(){
        Scanner scanner = new Scanner(System.in);
        int backsToBoo = 0;
        while(backsToBoo != 1 && backsToBoo != 2){
        System.out.println("Digite a porta possui vidro. 1 para sim ou 2 para não: ");
        int sToBoo = scanner.nextInt();
        switch (sToBoo) {
            case 1:
                setVidro(true);
                backsToBoo = sToBoo;
                break;
            case 2:
                setVidro(false);
                backsToBoo = sToBoo;
                break;
            default:
                System.out.println("\n!--------------Opção invalida---------------!\n");
                backsToBoo = sToBoo;
                break;
            }
        }
    }

    public void cadCompri2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o comprimento da porta: ");
        setComprimento2(scanner.nextDouble());
    }
    
    public void cadLarg2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura da porta: ");
        setLargura2(scanner.nextDouble());
    }
    
    public void cadVidro2(){
        Scanner scanner = new Scanner(System.in);
        int backsToBoo = 0;
        while(backsToBoo != 1 && backsToBoo != 2){
        System.out.println("Digite a porta possui vidro. 1 para sim ou 2 para não: ");
        int sToBoo = scanner.nextInt();
        switch (sToBoo) {
            case 1:
                setVidro2(true);
                backsToBoo = sToBoo;
                break;
            case 2:
                setVidro2(false);
                backsToBoo = sToBoo;
                break;
            default:
                System.out.println("\n!--------------Opção invalida---------------!\n");
                backsToBoo = sToBoo;
                break;
            }
        }
    }
    
    public void printPorta(){
        System.out.println("Comprimento da porta: "+ getComprimento());
        System.out.println("Largura da porta: "+ getLargura());
        boolean backVidro = getVidro();
        if(backVidro == true){
           System.out.println("Presença de vidro na porta: Possui"); 
        }else{
            System.out.println("Presença de vidro na porta: Não possui");
        }
    }
    
    public void printPorta2(){
        System.out.println("Comprimento da primeira porta: "+ getComprimento());
        System.out.println("Largura da primeira porta: "+ getLargura());
        boolean backVidro = getVidro();
        if(backVidro == true){
           System.out.println("Presença de vidro na primeira porta: Possui"); 
        }else{
            System.out.println("Presença de vidro na primeira porta: Não possui");
        }
        System.out.println("Comprimento da segunnda porta: "+ getComprimento2());
        System.out.println("Largura da segunda porta: "+ getLargura2());
        boolean backVidro2 = getVidro2();
        if(backVidro2 == true){
           System.out.println("Presença de vidro na segunda porta: Possui"); 
        }else{
            System.out.println("Presença de vidro na segunda porta: Não possui");
        }
    }
}
