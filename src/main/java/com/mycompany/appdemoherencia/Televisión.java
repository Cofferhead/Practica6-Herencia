/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author Leo
 */
public class Televisión extends DispositivoElectronicoDeConsumo{
    //Atributo inmutable
    private Pantalla pantalla;
    //Constructor
    public Televisión(String fabricante, String numeroSerie, String marca, float costo, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, "Televisión", costo);
        this.pantalla = new Pantalla(pantalla);
        this.agregarComponente(pantalla);
    }
    //Getter
    public Pantalla getPantalla() {
        return pantalla;
    }
    @Override
    public String toString ()
    {
        String salida = super.toString();
        salida += pantalla.toString();
        return salida;
    }
    
}
