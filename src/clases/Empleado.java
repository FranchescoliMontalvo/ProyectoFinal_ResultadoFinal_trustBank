package clases;

import interfaces.Interface_Sueldo;

public class Empleado implements Interface_Sueldo{

    private String tipo;
    private double adicional;
    private String nombre;
    private double total;
    private String numTelefono;
    private double bono;
    private String PCuenta;

    public double calcularArea() {
        switch (tipo) {
            case "Zona de ventanillas":
                adicional = 0;
                break;
            case "Área de créditos":
                adicional = 0.30 * Pago_Basico;
                break;
            case "Gerente de agencia":
                adicional = 0.50 * Pago_Basico;
                break;
            case "Recepcionista":
                adicional = 0.40 * Pago_Basico;
                break;
        }
        return adicional;
    }
    
    public double calcularTotal(){
        total = Pago_Basico + adicional;
        return total;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String setNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
    
    public String getPCuenta() {
        return PCuenta;
    }

    public void setPCuenta(String PCuenta) {
        this.PCuenta = PCuenta;
    }
    
    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    

}
