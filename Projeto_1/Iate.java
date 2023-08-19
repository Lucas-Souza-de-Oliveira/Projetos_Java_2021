/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aia1;

import java.util.Scanner;


public class Iate extends VeiculosMar {
    boolean piscina;
    int numCabines;

    public Iate(String marc, String type, String color, String id, int numPeople, int veloMax, double caladAlt, double price, boolean pool, int numCab) {
        super(marc, type, color, id, numPeople, veloMax, caladAlt, price);
        piscina = pool;
        numCabines = numCab;
    }
    
    public Iate(boolean pool, int numCab, double price, String id) {
        super(price, id);
        piscina = pool;
        numCabines = numCab;
    }

    public Iate(String marc, String type) {
        super(marc, type);
    }

    public Iate(String marc, double price) {
        super(marc, price);
    }

    public Iate(double price, String id) {
        super(price, id);
    }

    public Iate(String id, int veloMax) {
        super(id, veloMax);
    }

    public Iate(boolean pool, int numCab, String marc, String type) {
        super(marc, type);
        piscina = pool;
        numCabines = numCab;
    }

    public Iate(boolean pool, int numCab, String marc, String type, String color, String id, int numPeople, int veloMax) {
        super(marc, type, color, id, numPeople, veloMax);
        piscina = pool;
        numCabines = numCab;
    }

    public Iate(boolean pool, int numCab, String marc, String type, String color, String id) {
        super(marc, type, color, id);
        piscina = pool;
        numCabines = numCab;
    }

    public Iate(boolean pool, int numCab, String marc, String type, String color, String id, int numPeople, int veloMax, double caladAlt) {
        super(marc, type, color, id, numPeople, veloMax, caladAlt);
        piscina = pool;
        numCabines = numCab;
    }
    
    public void setPiscina(boolean pool){  //boolean piscina  //Metodo
        piscina = pool;
    }
    public boolean getPiscina(){
        return piscina;
    }
    
    public void setNumCabines(int numCab){  //int NumCabines  //Metodo
        numCabines = numCab;
    }
    public int getNumCabines(){
        return numCabines;
    }
    
    public void setMarca(){  //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca do iate: ");  //Marca
        setMarca(scanner.nextLine());
    }
    
    public void setModelo(){  //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo do iate: ");  //Modelo
        setModelo(scanner.nextLine());
    }
    
    public void setIdentificação(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a identificação do iate: ");  //Identificação
        setIdentificação(scanner.nextLine());
    }
    
    public void setAlturaCalado(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura do calado do iate: ");  //Altura calado
        setAlturaCalado(scanner.nextDouble());
    }

    public void setPreço(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do iate: ");  //Preço
        double discont = scanner.nextDouble() * 0.92;
        setPreço(discont);
    }
    
    public void setNumeroPassageiros(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de passageiros do iate: ");  //Num passageiros
        setNumeroPassageiros(scanner.nextInt());
    }
    
    public void setVelocidadeMaxima(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a velocidade maxima do iate: ");  //Velocidade Maxima
        setVelocidadeMaxima(scanner.nextInt());
    }
    
    public void setNumCabines(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de cabines do iate: ");  //Numero de Cabines
        setNumCabines(scanner.nextInt());
    }
    
    public void setPiscina(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        int backsToBoo = 0;
        while(backsToBoo != 1 && backsToBoo != 2){
        System.out.println("Digite se há piscina no iate (1 para sim e 2 para não): ");  //Piscina
        int sToBoo = scanner.nextInt();
        switch (sToBoo) {
            case 1:
                setPiscina(true);
                backsToBoo = sToBoo;
                break;
            case 2:
                setPiscina(false);
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
