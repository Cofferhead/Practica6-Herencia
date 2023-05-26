/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author Leo
 */
public abstract class ComponenteElectronico extends DispositivoElectronico{
    
    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
    }
    @Override
    public String toString ()
    {
        String salida = super.toString();
        return salida;
    }
}
