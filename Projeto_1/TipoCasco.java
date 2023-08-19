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
public class TipoCasco extends VeiculosMar {
    String tipoCasco;

    public TipoCasco(String id, int veloMax) {
        super(id, veloMax);
    }
    
    public TipoCasco(String marc, String type, String color, String id, int numPeople, int veloMax, double caladAlt, double price, String cascoTipo){
        super(marc, type, color, id, numPeople, veloMax, caladAlt, price);
        tipoCasco = cascoTipo;
    }

    public TipoCasco(String cascoTipo, String marc, String type, String color, String id, int numPeople, int veloMax) {
        super(marc, type, color, id, numPeople, veloMax);
        tipoCasco = cascoTipo;
    }

    public TipoCasco(String cascoTipo, String marc, String type, String color, String id, int numPeople) {
        super(marc, type, color, id, numPeople);
        tipoCasco = cascoTipo;
    }

    public TipoCasco(String cascoTipo, String marc, String type, String color, String id) {
        super(marc, type, color, id);
        tipoCasco = cascoTipo;
    }

    public TipoCasco(String cascoTipo, String id, int veloMax) {
        super(id, veloMax);
        tipoCasco = cascoTipo;
    }

    public TipoCasco(String cascoTipo, String marc, String type, String color) {
        super(marc, type, color);
        tipoCasco = cascoTipo;
    }

    public TipoCasco(String marc, String type) {
        super(marc, type);
    }

    public TipoCasco(String marc, double price) {
        super(marc, price);
    }

    public TipoCasco(double price, String id) {
        super(price, id);
    }
    
    public void setTipoCasco(String cascoTipo){ //string casco  //Metodo
        tipoCasco = cascoTipo;
    }
    public String getTipoCasco(){
        return tipoCasco;
    }
}
