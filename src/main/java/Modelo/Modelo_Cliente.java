package Modelo;

public class Modelo_Cliente {
    
    private int DNIcliente;
    private int telefonoCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccionCliente;

    public int getDNIcliente() {
        return DNIcliente;
    }

    public void setDNIcliente(int DNIcliente) {
        this.DNIcliente = DNIcliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
}
