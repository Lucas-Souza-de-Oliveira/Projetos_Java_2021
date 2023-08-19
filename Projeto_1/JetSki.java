/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aia1;

import java.util.Scanner;


public class JetSki extends TipoCasco {
    boolean reboque;

    public JetSki(boolean reboq, String marc, String type, String color, String id, int numPeople, int veloMax, double caladAlt, double price, String cascoTipo) {
        super(marc, type, color, id, numPeople, veloMax, caladAlt, price, cascoTipo);
        reboque = reboq;
    }

    public JetSki(boolean reboq, String cascoTipo, String marc, String type, String color, String id, int numPeople, int veloMax) {
        super(cascoTipo, marc, type, color, id, numPeople, veloMax);
        reboque = reboq;
    }

    public JetSki(boolean reboq, String cascoTipo, String marc, String type, String color, String id) {
        super(cascoTipo, marc, type, color, id);
        reboque = reboq;
    }

    public JetSki(boolean reboq, String cascoTipo, String id, int veloMax) {
        super(cascoTipo, id, veloMax);
        reboque = reboq;
    }

    public JetSki(boolean reboq, String marc, String type) {
        super(marc, type);
        reboque = reboq;
    }

    public JetSki(String cascoTipo, String id, int veloMax) {
        super(cascoTipo, id, veloMax);
    }

    public JetSki(String cascoTipo, String marc, String type, String color) {
        super(cascoTipo, marc, type, color);
    }

    public JetSki(String marc, String type) {
        super(marc, type);
    }

    public JetSki(String marc, double price) {
        super(marc, price);
    }

    public JetSki(double price, String id) {
        super(price, id);
    }
    
    public void setReboque(boolean reboq){  //boolean reboque  //Metodo
        reboque = reboq;
    }
    public boolean getReboque(){
        return reboque;
    }
    
    public void setMarca(){  //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca do JetSki: ");  //Marca
        setMarca(scanner.nextLine());
    }
    
    public void setModelo(){  //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo do JetSki: ");  //Modelo
        setModelo(scanner.nextLine());
    }
    
    public void setIdentificação(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a identificação do JetSki: ");  //Identificação
        setIdentificação(scanner.nextLine());
    }
    
    public void setAlturaCalado(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura do calado do JetSki: ");  //Altura calado
        setAlturaCalado(scanner.nextDouble());
    }

    public void setPreço(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do JetSki: ");  //Preço
        double discont = scanner.nextDouble() * 0.85;
        setPreço(discont);
    }
    
    public void setNumeroPassageiros(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de passageiros do JetSki: ");  //Num passageiros
        setNumeroPassageiros(scanner.nextInt());
    }
    
    public void setVelocidadeMaxima(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a velocidade maxima do JetSki: ");  //Velocidade Maxima
        setVelocidadeMaxima(scanner.nextInt());
    }
    
    public void setTipoCasco(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo do casco do JetSki: ");  //Casco
        setTipoCasco(scanner.nextLine());
    }
    
    public void setReboque(){ //metodo scan
        Scanner scanner = new Scanner(System.in);
        int backsToBoo = 0;
        while(backsToBoo != 1 && backsToBoo != 2){
        System.out.println("Digite se há reboque no JetSki (1 para sim e 2 para não): ");  //Reboque
        int sToBoo = scanner.nextInt();
        switch (sToBoo) {
            case 1:
                setReboque(true);
                backsToBoo = sToBoo;
                break;
            case 2:
                setReboque(false);
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
