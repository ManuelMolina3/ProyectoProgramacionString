package com.chuidiang.ejemplos;
 

import java.util.List;
 
public class ClaseParaDepurar {
	private double suma;
	private List<Double> lista;
 
	public ClaseParaDepurar() {
    	System.out.println("construyendo clase");
	}
	public double echaCuentas() {
    	lista = null;
    	for (int i = 0; i<100;i++){
        	lista.add((double)i);
    	}
    	suma = 0.0;
    	for (Double valor : lista){
        	suma +=valor;
    	}
    	return suma;
	}
}
