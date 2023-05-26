/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author Leo
 */
public class Sensor extends ComponenteElectronico{
    //Atributos inmutables
    private String tipo;
    private String unidadDeMedida;
    private int valor;
    //Constructor
    public Sensor(String tipo, String unidadDeMedida, int valor, String fabricante, String numeroSerie, String marca, float costo) {
        super(fabricante, numeroSerie, marca, "Sensor", costo);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }
    //Constructor copia
    public Sensor(Sensor sensor) {
        super(sensor.getFabricante(), sensor.getNumeroSerie(), sensor.getMarca(), "Sensor", sensor.getCosto());
        this.tipo = sensor.getTipo();
        this.unidadDeMedida = sensor.getUnidadDeMedida();
        this.valor = sensor.getValor();
    }
    //Getters
    public String getTipo() {
        return tipo;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public int getValor() {
        return valor;
    }
    @Override
    public String toString ()
    {
        String salida = super.toString();
        salida += "Tipo: " + this.tipo + "\n";
        salida += "Unidad de medida: " + this.unidadDeMedida + "\n";
        salida += "Valor actual: " + this.valor + "\n";
        return salida;
    }
}
