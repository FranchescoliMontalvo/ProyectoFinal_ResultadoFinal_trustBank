package clases;
import interfaces.Interface_Cliente;
import interfaces.Interface_Sueldo;
public class Cliente implements Interface_Cliente{
    private String nombre, apellido, hijos, zona, cantidad;

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getHijos() {
        return hijos;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }
    private double total, bonoH, Czona;

    public double calculaZona(){
        switch (zona) {
            case "Lima Norte":
                Czona = 100;
                break;
            case "Lima Sur":
                Czona = 200 * CreditoAd;
                break;
            case "Lima Este":
                Czona = 300 * CreditoAd;
                break;
            case "Lima Oeste":
                Czona = 400 * CreditoAd;
                break;
            case "Lima Centro":
                Czona = 500 * CreditoAd;
                break;
            case "Callao":
                Czona = 600 * CreditoAd;
                break;
            case "otro...":
                Czona = 1000 * CreditoAd;
                break;
        }
        return Czona;
    } 
    
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getBonoH() {
        return bonoH;
    }

    public void setBonoH(double bonoH) {
        this.bonoH = bonoH;
    }

    
    public double getCzona() {
        return Czona;
    }

    public void setCzona(double Czona) {
        this.Czona = Czona;
    }
}
