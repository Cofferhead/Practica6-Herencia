/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author Leo
 */
public class Pantalla extends ComponenteElectronico {
    //Atributos inmutalbes
    private int resoluciónX;
    private int resoluciónY;
    //Constructor
    public Pantalla(int resoluciónX, int resoluciónY, String fabricante, String numeroSerie, String marca, float costo) {
        super(fabricante, numeroSerie, marca, "Pantalla", costo);
        this.resoluciónX = resoluciónX;
        this.resoluciónY = resoluciónY;
    }
    //Constructor copia.
    public Pantalla(Pantalla pantalla) {
        super(pantalla.getFabricante(), pantalla.getNumeroSerie(), pantalla.getMarca(), "Pantalla", pantalla.getCosto());
        this.resoluciónX = pantalla.getResoluciónX();
        this.resoluciónY = pantalla.getResoluciónY();
    }
    //Getters
    public int getResoluciónX() {
        return resoluciónX;
    }

    public int getResoluciónY() {
        return resoluciónY;
    }
    @Override
    public String toString ()
    {
        String salida;
        salida = super.toString();
        salida += "Resolución: \n";
        salida += "X: " + this.resoluciónX + "\n";
        salida += "Y: " + this.resoluciónY + "\n";
        return salida;
    }
    
}
