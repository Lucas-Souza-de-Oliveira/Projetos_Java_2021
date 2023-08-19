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
public class AIA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int OpSn = 1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\n=----------------------------------------------------=\n");
        System.out.print("=------------------Menu de opções--------------------=");
        System.out.println("\n=----------------------------------------------------=\n");
        
        System.out.println("\n\t\t   Cadastrar produto\n");
        while(OpSn == 1){
                cadProdOp();
                System.out.print("\nDeseja cadastrar mais produtos? Digite 1 para sim ou 2 para não: ");
                OpSn = scanner.nextInt();
                }
        System.out.print("\n=-------------------------------------------------------------------------=\n");
    }
    
public static int cadProdOp(){
    int opSn; 
        System.out.println(">----------------------Produtos----------------------<");
                System.out.println("\n\t1- Geladeira\n\t2- Micro-ondas");
                System.out.print("\nDigite o número da opção desejada: ");
                Scanner scanner = new Scanner(System.in);
                int op2 = scanner.nextInt();
                
                switch(op2){
                    case 1:
                        System.out.println("\n\nLista de modelos de cadastro para geladeira: ");
                        System.out.println("\n\t1- Ficha completa");
                        System.out.println("\n\t2- Ficha com: Temperatura minima e maxima, marca, modelo e preço");
                        System.out.println("\n\t3- Ficha com: Temperatura minima e maxima, marca, modelo e informações das portas");
                        System.out.println("\n\t4- Ficha com: Temperatura minima e maxima, marca, volume e informações das portas");
                        System.out.println("\n\t5- Ficha com: Temperatura minima e maxima e preço");
                        System.out.println("\n\t6- Ficha com: Marca, modelo e preço");
                        System.out.println("\n\t7- Ficha com: Marca e preço");
                        System.out.println("\n\t8- Ficha com: Marca, volume e informações das portas");
                        System.out.println("\n\t9- Ficha com: Volume e preço");
                        System.out.println("\n\t10- Ficha com: Preço");
                        System.out.println("\nObservação: Produto será cadastrado com informações padrões");
                        System.out.print("\nDigite o número da opção desejada: ");
                        int op10 = scanner.nextInt();
                        
                        switch(op10){
                            case 1:
                               Geladeira geladeira1 = new Geladeira(-25.0, 7.0, "Basstemp", "BRJ55JK", 672000, 2500.0, 70.0, 60.0, true, 70.0, 60.0, false);
                               System.out.println("\n>-----------------------------Produto de tipo 1 cadastrado-----------------------------<\n");
                               geladeira1.printAllGelad();
                               System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    geladeira1.cadMarc();
                                    geladeira1.cadModel();
                                    geladeira1.cadVolu();
                                    geladeira1.cadPrice();
                                    geladeira1.cadTempMin();
                                    geladeira1.cadTempMax();
                                    geladeira1.porta1.cadCompri();
                                    geladeira1.porta1.cadLarg();
                                    geladeira1.porta1.cadVidro();
                                    geladeira1.porta1.cadCompri2();
                                    geladeira1.porta1.cadLarg2();
                                    geladeira1.porta1.cadVidro2();
                                    
                                    System.out.println("\n>------------------------------Produto de tipo 1 alterado------------------------------<\n");
                                    geladeira1.printAllGelad();
                                }
                            break;
                            case 2:
                               Geladeira geladeira2 = new Geladeira(-25.0, 7.0, "Basstemp", "BRJ55JK", 2500.0);
                               System.out.println("\n>-----------------------------Produto de tipo 2 cadastrado-----------------------------<\n");
                               geladeira2.printAnyButDoorGelad();
                               System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    geladeira2.cadMarc();
                                    geladeira2.cadModel();
                                    geladeira2.cadPrice();
                                    geladeira2.cadTempMin();
                                    geladeira2.cadTempMax();
                                    System.out.println("\n>------------------------------Produto de tipo 2 alterado------------------------------<\n");
                                    geladeira2.printAnyButDoorGelad();
                                }
                            break;
                            case 3:
                               Geladeira geladeira3 = new Geladeira(-25.0, 7.0, "Basstemp", "BRJ55JK", 70.0, 60.0, true, 70.0, 60.0, false);
                               System.out.println("\n>-----------------------------Produto de tipo 3 cadastrado-----------------------------<\n");
                               geladeira3.printAllGelad();
                               System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    geladeira3.cadMarc();
                                    geladeira3.cadModel();
                                    geladeira3.cadTempMin();
                                    geladeira3.cadTempMax();
                                    geladeira3.porta1.cadCompri();
                                    geladeira3.porta1.cadLarg();
                                    geladeira3.porta1.cadVidro();
                                    geladeira3.porta1.cadCompri2();
                                    geladeira3.porta1.cadLarg2();
                                    geladeira3.porta1.cadVidro2();
                                    System.out.println("\n>------------------------------Produto de tipo 3 alterado------------------------------<\n");
                                    geladeira3.printAllGelad();
                                }
                            break;
                            case 4:
                                Geladeira geladeira4 = new Geladeira(-25.0, 7.0, "Basstemp", 672000, 70.0, 60.0, true, 70.0, 60.0, false);
                                System.out.println("\n>-----------------------------Produto de tipo 4 cadastrado-----------------------------<\n");
                                geladeira4.printAllGelad();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    geladeira4.cadMarc();
                                    geladeira4.cadVolu();
                                    geladeira4.cadTempMin();
                                    geladeira4.cadTempMax();
                                    geladeira4.porta1.cadCompri();
                                    geladeira4.porta1.cadLarg();
                                    geladeira4.porta1.cadVidro();
                                    geladeira4.porta1.cadCompri2();
                                    geladeira4.porta1.cadLarg2();
                                    geladeira4.porta1.cadVidro2();
                                    System.out.println("\n>------------------------------Produto de tipo 4 alterado------------------------------<\n");
                                    geladeira4.printAllGelad();
                                }
                            break;
                            case 5:
                                Geladeira geladeira5 = new Geladeira(2500.0, -25.0, 7.0);
                                System.out.println("\n>-----------------------------Produto de tipo 5 cadastrado-----------------------------<\n");
                                geladeira5.printAnyButDoorGelad();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    geladeira5.cadPrice();
                                    geladeira5.cadTempMin();
                                    geladeira5.cadTempMax();
                                    System.out.println("\n>------------------------------Produto de tipo 5 alterado------------------------------<\n");
                                    geladeira5.printAnyButDoorGelad();
                                }
                            break;
                            case 6:
                                Geladeira geladeira6 = new Geladeira("Basstemp", "BRJ55JK", 2500.0);
                                System.out.println("\n>-----------------------------Produto de tipo 6 cadastrado-----------------------------<\n");
                                geladeira6.printAnyButDoorGelad();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    geladeira6.cadMarc();
                                    geladeira6.cadModel();
                                    geladeira6.cadPrice();
                                    System.out.println("\n>------------------------------Produto de tipo 6 alterado------------------------------<\n");
                                    geladeira6.printAnyButDoorGelad();
                                }
                            break;
                            case 7:
                                Geladeira geladeira7 = new Geladeira("Basstemp", 2500.0);
                                System.out.println("\n>-----------------------------Produto de tipo 7 cadastrado-----------------------------<\n");
                                geladeira7.printAnyButDoorGelad();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    geladeira7.cadMarc();
                                    geladeira7.cadPrice();
                                    System.out.println("\n>------------------------------Produto de tipo 7 alterado------------------------------<\n");
                                    geladeira7.printAnyButDoorGelad();
                                }
                            break;
                            case 8:
                                Geladeira geladeira8 = new Geladeira("Basstemp", 672000, 70.0, 60.0, true, 70.0, 60.0, false);
                                System.out.println("\n>-----------------------------Produto de tipo 8 cadastrado-----------------------------<\n");
                                geladeira8.printAllGelad();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    geladeira8.cadMarc();
                                    geladeira8.cadVolu();
                                    geladeira8.porta1.cadCompri();
                                    geladeira8.porta1.cadLarg();
                                    geladeira8.porta1.cadVidro();
                                    geladeira8.porta1.cadCompri2();
                                    geladeira8.porta1.cadLarg2();
                                    geladeira8.porta1.cadVidro2();
                                    System.out.println("\n>------------------------------Produto de tipo 8 alterado------------------------------<\n");
                                    geladeira8.printAllGelad();
                                }
                            break;
                            case 9:
                                Geladeira geladeira9 = new Geladeira(672000, 2500.0);
                                System.out.println("\n>-----------------------------Produto de tipo 9 cadastrado-----------------------------<\n");
                                geladeira9.printAnyButDoorGelad();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    geladeira9.cadVolu();
                                    geladeira9.cadPrice();
                                    System.out.println("\n>------------------------------Produto de tipo 9 alterado------------------------------<\n");
                                    geladeira9.printAnyButDoorGelad();
                                }
                            break;
                            case 10:
                                Geladeira geladeira10 = new Geladeira(2500.0);
                                System.out.println("\n>-----------------------------Produto de tipo 10 cadastrado-----------------------------<\n");
                                geladeira10.printAnyButDoorGelad();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    geladeira10.cadPrice();
                                    System.out.println("\n>------------------------------Produto de tipo 10 alterado-----------------------------<\n");
                                    geladeira10.printAnyButDoorGelad();
                                }
                            break;
                        }
                    break;
                    case 2:
                        System.out.println("\n\nLista de modelos de cadastro para micro-ondas: ");
                        System.out.println("\n\t1- Ficha completa");
                        System.out.println("\n\t2- Ficha com: Potencia minima e maxima, marca, modelo, volume e informações da porta");
                        System.out.println("\n\t3- Ficha com: Potencia minima e maxima, marca, modelo e informações da porta");
                        System.out.println("\n\t4- Ficha com: Potencia minima e maxima, marca, volume e informações da porta");
                        System.out.println("\n\t5- Ficha com: Potencia minima e maxima, volume e preço");
                        System.out.println("\n\t6- Ficha com: Marca, modelo, volume e informações da porta");
                        System.out.println("\n\t7- Ficha com: Marca, modelo e preço");
                        System.out.println("\n\t8- Ficha com: Marca, modelo e informações da porta");
                        System.out.println("\n\t9- Ficha com: Marca e preço");
                        System.out.println("\n\t10- Ficha com: Preço");
                        System.out.println("\nObservação: Produto será cadastrado com informações padrões");
                        System.out.print("\nDigite o número da opção desejada: ");
                        op10 = scanner.nextInt();
                        
                        switch(op10){
                            case 1:
                                MicroOndas microOndas1 = new MicroOndas(600, 1200, "Elolux", "MKX37", 20, 450.0, 45.0, 25.0, true);
                                System.out.println("\n>-----------------------------Produto de tipo 1 cadastrado-----------------------------<\n");
                                microOndas1.printAllMicro();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    microOndas1.cadMarc();
                                    microOndas1.cadModel();
                                    microOndas1.cadVolu();
                                    microOndas1.cadPrice();
                                    microOndas1.cadPotencMin();
                                    microOndas1.cadPotencMax();
                                    microOndas1.porta1.cadCompri();
                                    microOndas1.porta1.cadLarg();
                                    microOndas1.porta1.cadVidro();
                                    
                                    System.out.println("\n>------------------------------Produto de tipo 1 alterado-----------------------------<\n");
                                    microOndas1.printAllMicro();
                                }
                            break;
                            case 2:
                                MicroOndas microOndas2 = new MicroOndas(600, 1200, "Elolux", "MKX37", 20, 45.0, 25.0, true);
                                System.out.println("\n>-----------------------------Produto de tipo 2 cadastrado-----------------------------<\n");
                                microOndas2.printAllMicro();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    microOndas2.cadMarc();
                                    microOndas2.cadModel();
                                    microOndas2.cadVolu();
                                    microOndas2.cadPotencMin();
                                    microOndas2.cadPotencMax();
                                    microOndas2.porta1.cadCompri();
                                    microOndas2.porta1.cadLarg();
                                    microOndas2.porta1.cadVidro();
                                    System.out.println("\n>------------------------------Produto de tipo 2 alterado-----------------------------<\n");
                                    microOndas2.printAllMicro();
                                }
                            break;
                            case 3:
                                MicroOndas microOndas3 = new MicroOndas(600, 1200, "Elolux", "MKX37", 45.0, 25.0, true);
                                System.out.println("\n>-----------------------------Produto de tipo 3 cadastrado-----------------------------<\n");
                                microOndas3.printAllMicro();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    microOndas3.cadMarc();
                                    microOndas3.cadModel();
                                    microOndas3.cadPotencMin();
                                    microOndas3.cadPotencMax();
                                    microOndas3.porta1.cadCompri();
                                    microOndas3.porta1.cadLarg();
                                    microOndas3.porta1.cadVidro();
                                    System.out.println("\n>------------------------------Produto de tipo 3 alterado-----------------------------<\n");
                                    microOndas3.printAllMicro();
                                }
                            break;
                            case 4:
                                MicroOndas microOndas4 = new MicroOndas(600, 1200, "Elolux", 20, 45.0, 25.0, true);
                                System.out.println("\n>-----------------------------Produto de tipo 4 cadastrado-----------------------------<\n");
                                microOndas4.printAllMicro();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    microOndas4.cadMarc();
                                    microOndas4.cadVolu();
                                    microOndas4.cadPotencMin();
                                    microOndas4.cadPotencMax();
                                    microOndas4.porta1.cadCompri();
                                    microOndas4.porta1.cadLarg();
                                    microOndas4.porta1.cadVidro();
                                    System.out.println("\n>------------------------------Produto de tipo 4 alterado-----------------------------<\n");
                                    microOndas4.printAllMicro();
                                }
                            break;
                            case 5:
                                MicroOndas microOndas5 = new MicroOndas(600, 1200, 20, 450.0);
                                System.out.println("\n>-----------------------------Produto de tipo 5 cadastrado-----------------------------<\n");
                                microOndas5.printAnyButDoorMicro();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    microOndas5.cadVolu();
                                    microOndas5.cadPrice();
                                    microOndas5.cadPotencMin();
                                    microOndas5.cadPotencMax();
                                    System.out.println("\n>------------------------------Produto de tipo 5 alterado-----------------------------<\n");
                                    microOndas5.printAnyButDoorMicro();
                                }
                            break;
                            case 6:
                                MicroOndas microOndas6 = new MicroOndas("Elolux", "MKX37", 20, 45.0, 25.0, true);
                                System.out.println("\n>-----------------------------Produto de tipo 6 cadastrado-----------------------------<\n");
                                microOndas6.printAllMicro();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    microOndas6.cadMarc();
                                    microOndas6.cadModel();
                                    microOndas6.cadVolu();
                                    microOndas6.porta1.cadCompri();
                                    microOndas6.porta1.cadLarg();
                                    microOndas6.porta1.cadVidro();
                                    System.out.println("\n>------------------------------Produto de tipo 6 alterado-----------------------------<\n");
                                    microOndas6.printAllMicro();
                                }
                            break;
                            case 7:
                                MicroOndas microOndas7 = new MicroOndas("Elolux", "MKX37", 450.0);
                                System.out.println("\n>-----------------------------Produto de tipo 7 cadastrado-----------------------------<\n");
                                microOndas7.printAnyButDoorMicro();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    microOndas7.cadMarc();
                                    microOndas7.cadModel();
                                    microOndas7.cadPrice();
                                    System.out.println("\n>------------------------------Produto de tipo 7 alterado-----------------------------<\n");
                                    microOndas7.printAnyButDoorMicro();
                                }
                            break;
                            case 8:
                                MicroOndas microOndas8 = new MicroOndas("Elolux", "MKX37", 45.0, 25.0, true);
                                System.out.println("\n>-----------------------------Produto de tipo 8 cadastrado-----------------------------<\n");
                                microOndas8.printAllMicro();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    microOndas8.cadMarc();
                                    microOndas8.cadModel();
                                    microOndas8.porta1.cadCompri();
                                    microOndas8.porta1.cadLarg();
                                    microOndas8.porta1.cadVidro();
                                    System.out.println("\n>------------------------------Produto de tipo 8 alterado-----------------------------<\n");
                                    microOndas8.printAllMicro();
                                }
                            break;
                            case 9:
                                MicroOndas microOndas9 = new MicroOndas("Elolux", 450.0);
                                System.out.println("\n>-----------------------------Produto de tipo 9 cadastrado-----------------------------<\n");
                                microOndas9.printAnyButDoorMicro();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    microOndas9.cadMarc();
                                    microOndas9.cadPrice();
                                    System.out.println("\n>------------------------------Produto de tipo 9 alterado-----------------------------<\n");
                                    microOndas9.printAnyButDoorMicro();
                                }
                            break;
                            case 10:
                                MicroOndas microOndas10 = new MicroOndas(450.0);
                                System.out.println("\n>-----------------------------Produto de tipo 10 cadastrado----------------------------<\n");
                                microOndas10.printAnyButDoorMicro();
                                System.out.println("\n=--------------------------------------------------------------------------------------=\n");
                                System.out.print("\nDeseja alterar as informações? Digite 1 para sim ou 2 para não: ");
                                opSn = scanner.nextInt();
                                if(opSn == 1){
                                    microOndas10.cadPrice();
                                    System.out.println("\n>------------------------------Produto de tipo 10 alterado----------------------------<\n");
                                    microOndas10.printAnyButDoorMicro();
                                }
                            break;
                        }
                    break;
                }
    return 0;        
    }  
}
