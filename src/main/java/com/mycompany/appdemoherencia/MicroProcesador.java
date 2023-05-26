/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

import java.util.ArrayList;

/**
 *
 * @author Leo
 */
public class MicroProcesador extends ComponenteElectronico{
    //Atributos inmutables
    private int cacheRAM;
    private long velocidad;
    //Constructor
    public MicroProcesador(int cacheRAM, long velocidad, String fabricante, String numeroSerie, String marca, float costo) {
        super(fabricante, numeroSerie, marca, "Microprocesador", costo);
        this.cacheRAM = cacheRAM;
        this.velocidad = velocidad;
    }
    //Constructor para nombre nuevo
    public MicroProcesador(int cacheRAM, long velocidad, String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cacheRAM = cacheRAM;
        this.velocidad = velocidad;
    }
    //Constructor copia
    public MicroProcesador(MicroProcesador cpu) {
        super(cpu.getFabricante(), cpu.getNumeroSerie(), cpu.getMarca(), cpu.getNombre(), cpu.getCosto());
        this.cacheRAM = cpu.getCacheRAM();
        this.velocidad = cpu.getVelocidad();
    }
    //Getters
    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidad() {
        return velocidad;
    }
    @Override
    public String toString()
    {
        String salida = super.toString();
        salida += "RAM: " + this.cacheRAM + "\n";
        salida += "Velocidad: " + this.velocidad + "\n";
        return salida;
    }
}
