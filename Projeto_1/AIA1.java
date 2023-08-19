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
public class AIA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opSn = 1;
        
        System.out.print("\n=----------------------------------------------------=\n");
        System.out.print("=--------------Cadastro de informações---------------=");
        System.out.print("\n=----------------------------------------------------=\n\n");
        
        Scanner scanner = new Scanner(System.in);
        while(opSn == 1){
        System.out.println("De acordo com as opções abaixo: ");
        System.out.println("\n\t1- Lancha\n\t2- JetSki\n\t3- Iate");
        System.out.print("\nDigite o número da opção desejada: ");
        int op3 = scanner.nextInt();
        
        switch(op3){
            case 1:
                System.out.println("\n\nSegue abaixo a lista de modelos de cadastro para lanchas: ");
                System.out.println("\n\t1- Ficha completa");
                System.out.println("\t2- Ficha com: Marca, modelo, identificação, cor, tipo do casco e presença de banheiro");
                System.out.println("\t3- Ficha com: Identificação, tipo do casco, velocidade maxima e presença de banheiro");
                System.out.println("\t4- Ficha com: Marca, modelo, cor, tipo de casco e presença de banheiro");
                System.out.println("\t5- Ficha com: Marca, modelo, presença de banheiro");
                System.out.println("\t6- Ficha com: Marca, identificação e velocidade maxima");
                System.out.println("\t7- Ficha com: Marca, modelo, identificação e cor");
                System.out.println("\t8- Ficha com: Marca e modelo");
                System.out.println("\t9- Ficha com: Marca e preço");
                System.out.println("\t10- Ficha com: Identificação e preço");
                
                System.out.print("\nDigite o número da opção desejada: ");
                int op10 = scanner.nextInt();
                
                switch(op10){
                    case 1:
                        Lancha boat1 = new Lancha(true, "id", "", "", "", 1, 1, 1.0, 1.0, "");
                        boat1.setBanheiro();
                        boat1.setMarca();
                        boat1.setModelo();
                        boat1.setIdentificação();
                        boat1.setCor();
                        boat1.setNumeroPassageiros();
                        boat1.setVelocidadeMaxima();
                        boat1.setAlturaCalado();
                        boat1.setPreço();
                        boat1.setTipoCasco();
                        
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tBanheiro: "+boat1.getBanheiro());
                        System.out.println("\tMarca: "+boat1.getMarca());
                        System.out.println("\tModelo: "+boat1.getModelo());
                        System.out.println("\tIdentificação: "+boat1.getIdentificação());
                        System.out.println("\tCor: "+boat1.getCor());
                        System.out.println("\tNúmero de passageiros: "+boat1.getNumeroPassageiros());
                        System.out.println("\tVelocidade máxima: "+boat1.getVelocidadeMaxima());
                        System.out.println("\tAltura do calado: "+boat1.getAlturaCalado());
                        System.out.println("\tPreço: "+boat1.getPreço());
                        System.out.println("\tTipo de casco: "+boat1.getTipoCasco());
                    break;
                    case 2:
                        Lancha boat2 = new Lancha(true, "", "", "", "", "");
                        boat2.setBanheiro();
                        boat2.setTipoCasco();
                        boat2.setMarca();
                        boat2.setModelo();
                        boat2.setCor();
                        boat2.setIdentificação();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tBanheiro: "+boat2.getBanheiro());
                        System.out.println("\tMarca: "+boat2.getMarca());
                        System.out.println("\tModelo: "+boat2.getModelo());
                        System.out.println("\tIdentificação: "+boat2.getIdentificação());
                        System.out.println("\tCor: "+boat2.getCor());
                        System.out.println("\tTipo de casco: "+boat2.getTipoCasco());
                    break;
                    case 3:
                        Lancha boat3 = new Lancha(true, "", "", 1);
                        boat3.setBanheiro();
                        boat3.setTipoCasco();
                        boat3.setIdentificação();
                        boat3.setVelocidadeMaxima();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tBanheiro: "+boat3.getBanheiro());
                        System.out.println("\tTipo de casco: "+boat3.getTipoCasco());
                        System.out.println("\tIdentificação: "+boat3.getIdentificação());
                        System.out.println("\tVelocidade máxima: "+boat3.getVelocidadeMaxima());
                    break;
                    case 4:
                        Lancha boat4 = new Lancha(true, "", "", "", "");
                        boat4.setBanheiro();
                        boat4.setTipoCasco();
                        boat4.setMarca();
                        boat4.setModelo();
                        boat4.setCor();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tBanheiro: "+boat4.getBanheiro());
                        System.out.println("\tTipo de casco: "+boat4.getTipoCasco());
                        System.out.println("\tMarca: "+boat4.getMarca());
                        System.out.println("\tModelo: "+boat4.getModelo());
                        System.out.println("\tCor: "+boat4.getCor());
                    break;
                    case 5:
                        Lancha boat5 = new Lancha(true, "", "");
                        boat5.setBanheiro();
                        boat5.setMarca();
                        boat5.setModelo();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tBanheiro: "+boat5.getBanheiro());
                        System.out.println("\tMarca: "+boat5.getMarca());
                        System.out.println("\tModelo: "+boat5.getModelo());
                    break;
                    case 6:
                        Lancha boat6 = new Lancha("", "", 1);
                        boat6.setMarca();
                        boat6.setIdentificação();
                        boat6.setVelocidadeMaxima();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tMarca: "+boat6.getMarca());
                        System.out.println("\tIdentificação: "+boat6.getIdentificação());
                        System.out.println("\tVelocidade máxima: "+boat6.getVelocidadeMaxima());
                    break;
                    case 7:
                        Lancha boat7 = new Lancha("", "", "", "");
                        boat7.setIdentificação();
                        boat7.setMarca();
                        boat7.setModelo();
                        boat7.setCor();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tIdentificação: "+boat7.getIdentificação());
                        System.out.println("\tMarca: "+boat7.getMarca());
                        System.out.println("\tModelo: "+boat7.getModelo());
                        System.out.println("\tCor: "+boat7.getCor());
                    break;
                    case 8:
                        Lancha boat8 = new Lancha("", "");
                        boat8.setMarca();
                        boat8.setModelo();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tMarca: "+boat8.getMarca());
                        System.out.println("\tModelo: "+boat8.getModelo());
                    break;
                    case 9:
                        Lancha boat9 = new Lancha("", 1.0);
                        boat9.setMarca();
                        boat9.setPreço();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tMarca: "+boat9.getMarca());
                        System.out.println("\tPreço: "+boat9.getPreço());
                    break;
                    case 10:
                        Lancha boat10 = new Lancha(1.0, "");
                        boat10.setPreço();
                        boat10.setIdentificação();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tPreço: "+boat10.getPreço());
                        System.out.println("\tIdentificação: "+boat10.getIdentificação());
                    break;
                }
            break;
            case 2:
                System.out.println("\n\nSegue abaixo a lista de modelos de cadastro para jetskis: ");
                System.out.println("\n\t1- Ficha completa");
                System.out.println("\t2- Ficha com: Marca, modelo, identificação, cor, tipo do casco, presença de reboque, número de pessoas e velocidade máxima");
                System.out.println("\t3- Ficha com: Marca, modelo, cor, identificação, tipo do casco e presença de reboque");
                System.out.println("\t4- Ficha com: Identificação, velocidade máxima e presença de reboque");
                System.out.println("\t5- Ficha com: Marca, modelo, presença de reboque");
                System.out.println("\t6- Ficha com: Tipo de casco, identificação e velocidade maxima");
                System.out.println("\t7- Ficha com: Marca, modelo, tipo de casco e cor");
                System.out.println("\t8- Ficha com: Marca e modelo");
                System.out.println("\t9- Ficha com: Marca e preço");
                System.out.println("\t10- Ficha com: Identificação e preço");
                
                System.out.print("\nDigite o número da opção desejada: ");
                op10 = scanner.nextInt();
                
                switch(op10){
                    case 1:
                        JetSki jetski1 = new JetSki(true, "id", "", "", "", 1, 1, 1.0, 1.0, "");
                        jetski1.setReboque();
                        jetski1.setMarca();
                        jetski1.setModelo();
                        jetski1.setIdentificação();
                        jetski1.setCor();
                        jetski1.setNumeroPassageiros();
                        jetski1.setVelocidadeMaxima();
                        jetski1.setAlturaCalado();
                        jetski1.setPreço();
                        jetski1.setTipoCasco();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tReboque: "+jetski1.getReboque());
                        System.out.println("\tMarca: "+jetski1.getMarca());
                        System.out.println("\tModelo: "+jetski1.getModelo());
                        System.out.println("\tIdentificação: "+jetski1.getIdentificação());
                        System.out.println("\tCor: "+jetski1.getCor());
                        System.out.println("\tNúmero de passageiros: "+jetski1.getNumeroPassageiros());
                        System.out.println("\tVelocidade máxima: "+jetski1.getVelocidadeMaxima());
                        System.out.println("\tAltura do calado: "+jetski1.getAlturaCalado());
                        System.out.println("\tPreço: "+jetski1.getPreço());
                        System.out.println("\tTipo de casco: "+jetski1.getTipoCasco());
                    break;
                    case 2:
                        JetSki jetski2 = new JetSki(true, "", "", "", "", "", 1, 1);
                        jetski2.setReboque();
                        jetski2.setMarca();
                        jetski2.setModelo();
                        jetski2.setIdentificação();
                        jetski2.setCor();
                        jetski2.setNumeroPassageiros();
                        jetski2.setVelocidadeMaxima();
                        jetski2.setTipoCasco();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tReboque: "+jetski2.getReboque());
                        System.out.println("\tMarca: "+jetski2.getMarca());
                        System.out.println("\tModelo: "+jetski2.getModelo());
                        System.out.println("\tIdentificação: "+jetski2.getIdentificação());
                        System.out.println("\tCor: "+jetski2.getCor());
                        System.out.println("\tNúmero de passageiros: "+jetski2.getNumeroPassageiros());
                        System.out.println("\tVelocidade máxima: "+jetski2.getVelocidadeMaxima());
                        System.out.println("\tTipo de casco: "+jetski2.getTipoCasco());
                    break;
                    case 3:
                        JetSki jetski3 = new JetSki(true, "", "", "", "", "");
                        jetski3.setReboque();
                        jetski3.setMarca();
                        jetski3.setModelo();
                        jetski3.setIdentificação();
                        jetski3.setCor();
                        jetski3.setTipoCasco();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tReboque: "+jetski3.getReboque());
                        System.out.println("\tMarca: "+jetski3.getMarca());
                        System.out.println("\tModelo: "+jetski3.getModelo());
                        System.out.println("\tIdentificação: "+jetski3.getIdentificação());
                        System.out.println("\tCor: "+jetski3.getCor());
                        System.out.println("\tTipo de casco: "+jetski3.getTipoCasco());
                    break;
                    case 4:
                        JetSki jetski4 = new JetSki(true, "", "", 1);
                        jetski4.setReboque();
                        jetski4.setTipoCasco();
                        jetski4.setIdentificação();
                        jetski4.setVelocidadeMaxima();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tReboque: "+jetski4.getReboque());
                        System.out.println("\tTipo de casco: "+jetski4.getTipoCasco());
                        System.out.println("\tIdentificação: "+jetski4.getIdentificação());
                        System.out.println("\tVelocidade máxima: "+jetski4.getVelocidadeMaxima());
                    break;
                    case 5:
                        JetSki jetski5 = new JetSki(true, "", "");
                        jetski5.setReboque();
                        jetski5.setMarca();
                        jetski5.setModelo();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tReboque: "+jetski5.getReboque());
                        System.out.println("\tMarca: "+jetski5.getMarca());
                        System.out.println("\tModelo: "+jetski5.getModelo());
                    break;
                    case 6:
                        JetSki jetski6 = new JetSki("", "", 1);
                        jetski6.setTipoCasco();
                        jetski6.setIdentificação();
                        jetski6.setVelocidadeMaxima();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tTipo de casco: "+jetski6.getTipoCasco());
                        System.out.println("\tIdentificação: "+jetski6.getIdentificação());
                        System.out.println("\tVelocidade máxima: "+jetski6.getVelocidadeMaxima());
                    break;
                    case 7:
                        JetSki jetski7 = new JetSki("", "", "", "");
                        jetski7.setMarca();
                        jetski7.setModelo();
                        jetski7.setCor();
                        jetski7.setTipoCasco();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tMarca: "+jetski7.getMarca());
                        System.out.println("\tModelo: "+jetski7.getModelo());
                        System.out.println("\tCor: "+jetski7.getCor());
                        System.out.println("\tTipo de casco: "+jetski7.getTipoCasco());
                    break;
                    case 8:
                        JetSki jetski8 = new JetSki("", "");
                        jetski8.setMarca();
                        jetski8.setModelo();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tMarca: "+jetski8.getMarca());
                        System.out.println("\tModelo: "+jetski8.getModelo());
                    break;
                    case 9:
                        JetSki jetski9 = new JetSki("", 1.0);
                        jetski9.setMarca();
                        jetski9.setPreço();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tMarca: "+jetski9.getMarca());
                        System.out.println("\tPreço: "+jetski9.getPreço());
                    break;
                    case 10:
                        JetSki jetski10 = new JetSki(1.0, "");
                        jetski10.setPreço();
                        jetski10.setIdentificação();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tPreço: "+jetski10.getPreço());
                        System.out.println("\tIdentificação: "+jetski10.getIdentificação());
                    break;
                }
            break;
            case 3:
                System.out.println("\n\nSegue abaixo a lista de modelos de cadastro para iates: ");
                System.out.println("\n\t1- Ficha completa");
                System.out.println("\t2- Ficha com: Identificação, número de cabines, preço e presença de piscina");
                System.out.println("\t3- Ficha com: Marca e modelo");
                System.out.println("\t4- Ficha com: Marca e preço");
                System.out.println("\t5- Ficha com: Identificação e preço");
                System.out.println("\t6- Ficha com: Identificação e velocidade maxima");
                System.out.println("\t7- Ficha com: Marca, modelo, número de cabines e presença de piscina");
                System.out.println("\t8- Ficha com: Marca, modelo, cor, identificação, número de pessoas, velocidade máxima, número de cabines e presença de piscina");
                System.out.println("\t9- Ficha com: Marca, modelo, cor, identificação, número de cabines e presença de piscina");
                System.out.println("\t10- Ficha com: Marca, modelo, cor, identificação, número de pessoas, velocidade máxima, número de cabines, altura do calado e presença de piscina");
                
                System.out.print("\nDigite o número da opção desejada: ");
                op10 = scanner.nextInt();
                
                switch(op10){
                    case 1:
                        Iate iate1 = new Iate("", "", "", "", 1, 1, 1.0, 1.0, true, 1);
                        iate1.setPiscina();
                        iate1.setMarca();
                        iate1.setModelo();
                        iate1.setIdentificação();
                        iate1.setCor();
                        iate1.setNumeroPassageiros();
                        iate1.setVelocidadeMaxima();
                        iate1.setAlturaCalado();
                        iate1.setPreço();
                        iate1.setNumCabines();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tPiscina: "+iate1.getPiscina());
                        System.out.println("\tMarca: "+iate1.getMarca());
                        System.out.println("\tModelo: "+iate1.getModelo());
                        System.out.println("\tIdentificação: "+iate1.getIdentificação());
                        System.out.println("\tCor: "+iate1.getCor());
                        System.out.println("\tNúmero de passageiros: "+iate1.getNumeroPassageiros());
                        System.out.println("\tVelocidade máxima: "+iate1.getVelocidadeMaxima());
                        System.out.println("\tAltura do calado: "+iate1.getAlturaCalado());
                        System.out.println("\tPreço: "+iate1.getPreço());
                        System.out.println("\tNúmero de cabines: "+iate1.getNumCabines());
                    break;
                    case 2:
                        Iate iate2 = new Iate(true, 1, 1.0, "");
                        iate2.setPiscina();
                        iate2.setNumCabines();
                        iate2.setPreço();
                        iate2.setIdentificação();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tPiscina: "+iate2.getPiscina());
                        System.out.println("\tNúmero de cabines: "+iate2.getNumCabines());
                        System.out.println("\tPreço: "+iate2.getPreço());
                        System.out.println("\tIdentificação: "+iate2.getIdentificação());
                    break;
                    case 3:
                        Iate iate3 = new Iate("", "");
                        iate3.setMarca();
                        iate3.setModelo();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tMarca: "+iate3.getMarca());
                        System.out.println("\tModelo: "+iate3.getModelo());
                    break;
                    case 4:
                        Iate iate4 = new Iate("", 1.0);
                        iate4.setMarca();
                        iate4.setPreço();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tMarca: "+iate4.getMarca());
                        System.out.println("\tPreço: "+iate4.getPreço());
                    break;
                    case 5:
                        Iate iate5 = new Iate(1.0, "");
                        iate5.setPreço();
                        iate5.setIdentificação();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tPreço: "+iate5.getPreço());
                        System.out.println("\tIdentificação: "+iate5.getIdentificação());
                    break;
                    case 6:
                        Iate iate6 = new Iate("", 1);
                        iate6.setIdentificação();
                        iate6.setVelocidadeMaxima();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tIdentificação: "+iate6.getIdentificação());
                        System.out.println("\tVelocidade máxima: "+iate6.getVelocidadeMaxima());
                    break;
                    case 7:
                        Iate iate7 = new Iate(true, 1, "", "");
                        iate7.setPiscina();
                        iate7.setMarca();
                        iate7.setModelo();
                        iate7.setNumCabines();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tPiscina: "+iate7.getPiscina());
                        System.out.println("\tNúmero de cabines: "+iate7.getNumCabines());
                        System.out.println("\tMarca: "+iate7.getMarca());
                        System.out.println("\tModelo: "+iate7.getModelo());
                    break;
                    case 8:
                        Iate iate8 = new Iate(true, 1, "", "", "", "", 1, 1);
                        iate8.setPiscina();
                        iate8.setMarca();
                        iate8.setModelo();
                        iate8.setNumCabines();
                        iate8.setIdentificação();
                        iate8.setCor();
                        iate8.setNumeroPassageiros();
                        iate8.setVelocidadeMaxima();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tPiscina: "+iate8.getPiscina());
                        System.out.println("\tNúmero de cabines: "+iate8.getNumCabines());
                        System.out.println("\tMarca: "+iate8.getMarca());
                        System.out.println("\tModelo: "+iate8.getModelo());
                        System.out.println("\tIdentificação: "+iate8.getIdentificação());
                        System.out.println("\tCor: "+iate8.getCor());
                        System.out.println("\tNúmero de passageiros: "+iate8.getNumeroPassageiros());
                        System.out.println("\tVelocidade máxima: "+iate8.getVelocidadeMaxima());
                        
                    break;
                    case 9:
                        Iate iate9 = new Iate(true, 1, "", "", "", "");
                        iate9.setPiscina();
                        iate9.setMarca();
                        iate9.setModelo();
                        iate9.setNumCabines();
                        iate9.setIdentificação();
                        iate9.setCor();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tPiscina: "+iate9.getPiscina());
                        System.out.println("\tNúmero de cabines: "+iate9.getNumCabines());
                        System.out.println("\tMarca: "+iate9.getMarca());
                        System.out.println("\tModelo: "+iate9.getModelo());
                        System.out.println("\tIdentificação: "+iate9.getIdentificação());
                        System.out.println("\tCor: "+iate9.getCor());
                    break;
                    case 10:
                        Iate iate10 = new Iate(true, 1, "", "", "", "", 1, 1, 1.0);
                        iate10.setPiscina();
                        iate10.setMarca();
                        iate10.setModelo();
                        iate10.setNumCabines();
                        iate10.setIdentificação();
                        iate10.setCor();
                        iate10.setNumeroPassageiros();
                        iate10.setVelocidadeMaxima();
                        iate10.setAlturaCalado();
                        
                        //print
                        System.out.println(">--------------Objeto cadastrado--------------<\n");
                        System.out.println("\tPiscina: "+iate10.getPiscina());
                        System.out.println("\tNúmero de cabines: "+iate10.getNumCabines());
                        System.out.println("\tMarca: "+iate10.getMarca());
                        System.out.println("\tModelo: "+iate10.getModelo());
                        System.out.println("\tIdentificação: "+iate10.getIdentificação());
                        System.out.println("\tCor: "+iate10.getCor());
                        System.out.println("\tNúmero de passageiros: "+iate10.getNumeroPassageiros());
                        System.out.println("\tVelocidade máxima: "+iate10.getVelocidadeMaxima());
                        System.out.println("\tAltura do calado: "+iate10.getAlturaCalado());
                    break;
                }
            break;
            default:
                System.out.println("!--------------Opção invalida---------------!");
            break;
        }
        
        System.out.println("\nDeseja cadastrar mais objetos? Digite 1 para sim ou 2 para não: ");
        opSn = scanner.nextInt();
        }
    }
}
