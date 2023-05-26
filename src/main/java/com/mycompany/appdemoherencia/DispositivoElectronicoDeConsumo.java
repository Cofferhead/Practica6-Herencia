/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author Leo
 */
public abstract class DispositivoElectronicoDeConsumo extends DispositivoElectronico {
    //Atributos mutables
    protected boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
    }
    //Métodos
    public void encender ()
    {
        encendido = true;
    }
    public void apagar()
    {
        encendido = false;
    }
    //Getter
    public boolean isEncendido() {
        return encendido;
    }
    @Override
    public String toString ()
    {
        String salida = super.toString();
        salida += "Estado: ";
        if (this.encendido == true)
        {
            salida += "encendido \n";
        }
        else
        {
            salida += "apagado \n";
        }
        return salida;
    }
}
