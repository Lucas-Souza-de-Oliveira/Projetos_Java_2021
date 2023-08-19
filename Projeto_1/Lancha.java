/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aia1;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Lancha extends TipoCasco {  //Classe lancha
    boolean banheiro;

    public Lancha(boolean bathroom, String marc, String type, String color, String id, int numPeople, int veloMax, double caladAlt, double price, String cascoTipo) {
        super(marc, type, color, id, numPeople, veloMax, caladAlt, price, cascoTipo);
        banheiro = bathroom;
    }

    public Lancha(boolean bathroom, String cascoTipo, String marc, String type, String color, String id) {
        super(cascoTipo, marc, type, color, id);
        banheiro = bathroom;
    }

    public Lancha(boolean bathroom, String cascoTipo, String id, int veloMax) {
        super(cascoTipo, id, veloMax);
        banheiro = bathroom;
    }

    public Lancha(boolean bathroom, String cascoTipo, String marc, String type, String color) {
        super(cascoTipo, marc, type, color);
        banheiro = bathroom;
    }

    public Lancha(boolean bathroom, String marc, String type) {
        super(marc, type);
        banheiro = bathroom;
    }

    public Lancha(String marc, String id, int veloMax) {
        super(marc, id, veloMax);
    }

    public Lancha(String id, String marc, String type, String color) {
        super(id, marc, type, color);
    }

    public Lancha(String marc, String type) {
        super(marc, type);
    }

    public Lancha(String marc, double price) {
        super(marc, price);
    }

    public Lancha(double price, String id) {
        super(price, id);
    }
    
    public void setBanheiro(boolean bathroom){  //boolean banheiro  //Metodo
        banheiro = bathroom;
    }
    public boolean getBanheiro(){
        return banheiro;
    }
    
    public void setMarca(){  //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca da lancha: ");  //Marca
        setMarca(scanner.nextLine());
    }
    
    public void setModelo(){  //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo da lancha: ");  //Modelo
        setModelo(scanner.nextLine());
    }
    
    public void setIdentificação(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a identificação da lancha: ");  //Identificação
        setIdentificação(scanner.nextLine());
    }
    
    public void setAlturaCalado(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura do calado da lancha: ");  //Altura calado
        setAlturaCalado(scanner.nextDouble());
    }

    public void setPreço(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço da lancha: ");  //Preço
        double discont = scanner.nextDouble() * 0.90;
        setPreço(discont);
    }
    
    public void setNumeroPassageiros(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de passageiros da lancha: ");  //Num passageiros
        setNumeroPassageiros(scanner.nextInt());
    }
    
    public void setVelocidadeMaxima(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a velocidade maxima da lancha: ");  //Velocidade Maxima
        setVelocidadeMaxima(scanner.nextInt());
    }
    
    public void setTipoCasco(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo do casco da lancha: ");  //Casco
        setTipoCasco(scanner.nextLine());
    }
    
    public void setBanheiro(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        int backsToBoo = 0;
        while(backsToBoo != 1 && backsToBoo != 2){
        System.out.println("Digite se há banheiro na lancha (1 para sim e 2 para não): ");  //Banheiro
        int sToBoo = scanner.nextInt();
        switch (sToBoo) {
            case 1:
                setBanheiro(true);
                backsToBoo = sToBoo;
                break;
            case 2:
                setBanheiro(false);
                backsToBoo = sToBoo;
                break;
            default:
                System.out.println("\n!--------------Opção invalida---------------!\n");
                backsToBoo = sToBoo;
                break;
            }
        }
    }
    
    public void setCor(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a cor da lancha: ");  //Cor
        setCor(scanner.nextLine());
    }
}
