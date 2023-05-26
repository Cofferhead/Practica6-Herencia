/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author Leo
 */
public class Smartphone extends Computadora {
    //Atributos inmutables
    private Sensor sensorDeHuella;
    private Pantalla pantalla;
    public Smartphone(String fabricante, String numeroSerie, String marca, String nombre, float costo, long ramMB, MicroProcesador cpu, Pantalla pantalla, Sensor sensor) {
        super(fabricante, numeroSerie, marca, nombre, costo, cpu, ramMB);
        this.pantalla = new Pantalla(pantalla);
        this.sensorDeHuella = new Sensor(sensor);
        this.agregarComponente(sensor);
        this.agregarComponente(pantalla);
    }
    //Getters

    public Sensor getSensorDeHuella() {
        return sensorDeHuella;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }
    @Override
    public String toString ()
    {
        String salida = super.toString();
        salida += pantalla.toString();
        salida += sensorDeHuella.toString();
        return salida;
    }
}
