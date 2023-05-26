/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author Leo
 */
public class Computadora extends DispositivoElectronicoDeConsumo {
    //Atributos mutables
    private MicroProcesador cpu;
    private long ramMB;
    //Constructor
    public Computadora(String fabricante, String numeroSerie, String marca, float costo, MicroProcesador cpu, long ramMB) {
        super(fabricante, numeroSerie, marca, "Computadora", costo);
        this.cpu = new MicroProcesador(cpu);
        this.ramMB = ramMB;
    }   
    //Constructor para nombres
    public Computadora(String fabricante, String numeroSerie, String marca, String nombre, float costo, MicroProcesador cpu, long ramMB) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cpu = new MicroProcesador(cpu);
        this.ramMB = ramMB;
        this.agregarComponente(cpu);
    }   
    //Getters

    public MicroProcesador getCpu() {
        return cpu;
    }
    public long getRamMB ()
    {
        return ramMB;
    }
    //Setter

    public void setRamMB(long ramMB) {
        this.ramMB = ramMB;
    }

    public void setCpu(MicroProcesador cpu) {
        this.cpu = cpu;
    }
    @Override 
    public String toString ()
    {
        String salida = super.toString();
        salida += cpu.toString();
        salida += "Ram (MB): " + this.ramMB + "\n";
        return salida;
    }
}
