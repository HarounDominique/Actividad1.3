/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad.teis.model;

/**
 *
 * @author a21dominicohl
 */
public class Persona {
    //Atributos 
    private long identificador;
    private String dni;
    private int edad;
    private float salario;
    
    //Constructor

    public Persona(long identificador, String dni, int edad, float salario) {
        this.identificador = identificador;
        this.dni = dni;
        this.edad = edad;
        this.salario = salario;
    }
    
    //Métodos

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
