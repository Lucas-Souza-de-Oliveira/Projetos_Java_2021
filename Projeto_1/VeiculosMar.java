/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aia1;

/**
 *
 * @author lucas
 */
public class VeiculosMar {
    String marca, modelo, cor, identificação;
    int numeroPassageiros, velocidadeMaxima;
    double alturaCalado, preço;
    
    public VeiculosMar(String marc, String type, String color, String id, int numPeople, int veloMax, double caladAlt, double price){
        marca = marc;
        modelo = type;
        cor = color;
        identificação = id;
        numeroPassageiros = numPeople;
        velocidadeMaxima = veloMax;
        alturaCalado = caladAlt;
        preço = price;
    }
    
    public VeiculosMar(String marc, String type, String color, String id, int numPeople, int veloMax, double caladAlt){
        marca = marc;
        modelo = type;
        cor = color;
        identificação = id;
        numeroPassageiros = numPeople;
        velocidadeMaxima = veloMax;
        alturaCalado = caladAlt;
    }
    
    public VeiculosMar(String marc, String type, String color, String id, int numPeople, int veloMax){
        marca = marc;
        modelo = type;
        cor = color;
        identificação = id;
        numeroPassageiros = numPeople;
        velocidadeMaxima = veloMax;
    }
    
    public VeiculosMar(String marc, String type, String color, String id, int numPeople){
        marca = marc;
        modelo = type;
        cor = color;
        identificação = id;
        numeroPassageiros = numPeople;
    }
    
    public VeiculosMar(String marc, String type, String color, String id){
        marca = marc;
        modelo = type;
        cor = color;
        identificação = id;
    }
    
    public VeiculosMar(String marc, String type, String color){
        marca = marc;
        modelo = type;
        cor = color;
    }
    
    public VeiculosMar(String marc, String type){
        marca = marc;
        modelo = type;
    }
    
    public VeiculosMar(String marc, double price){
        marca = marc;
        preço = price;
    }
    
    public VeiculosMar(double price, String id){
        identificação = id;
        preço = price;
    }
    
    public VeiculosMar(String id, int veloMax){
        identificação = id;
        velocidadeMaxima = veloMax;
    }
    
    public void setMarca(String marc){  //String marca  //Metodo
        marca = marc;
    }
    public String getMarca(){ 
        return marca;
    }
    
    public void setModelo(String type){ //string modelo  //Metodo
        modelo = type;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setCor(String color){ //string cor  //Metodo
        cor = color;
    }
    public String getCor(){
        return cor;
    }
    
    public void setIdentificação(String id){ //string id  //Metodo
        identificação = id;
    }
    public String getIdentificação(){
        return identificação;
    }
    
    public void setNumeroPassageiros(int numPeople){ //int numPeople  //Metodo
        numeroPassageiros = numPeople;
    }
    public int getNumeroPassageiros(){
        return numeroPassageiros;
    }
    
    public void setVelocidadeMaxima(int veloMax){  //int veloMax  //Metodo
        velocidadeMaxima = veloMax;
    }
    public int getVelocidadeMaxima(){
        return velocidadeMaxima;
    }
    
    public void setAlturaCalado(double caladAlt){ //double AltCalado  //Metodo
        alturaCalado = caladAlt;
    }
    public double getAlturaCalado(){
        return alturaCalado;
    }
    
    public void setPreço(double price){  //double preço  //Metodo
        preço = price;
    }
    public double getPreço(){
        return preço;
    }
}
