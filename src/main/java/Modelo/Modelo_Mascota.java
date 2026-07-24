package Modelo;

public class Modelo_Mascota {

       private String nombreMascota;
    private String especieMascota;
    private String pelajeMascota;
    private int edadMascota;
    private int pesoMascota;

    public Modelo_Mascota() {
    }

    public Modelo_Mascota(String nombreMascota, String especieMascota, String pelajeMascota, int edadMascota, int pesoMascota) {
        this.nombreMascota = nombreMascota;
        this.especieMascota = especieMascota;
        this.pelajeMascota = pelajeMascota;
        this.edadMascota = edadMascota;
        this.pesoMascota = pesoMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEspecieMascota() {
        return especieMascota;
    }

    public void setEspecieMascota(String especieMascota) {
        this.especieMascota = especieMascota;
    }

    public String getPelajeMascota() {
        return pelajeMascota;
    }

    public void setPelajeMascota(String pelajeMascota) {
        this.pelajeMascota = pelajeMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public int getPesoMascota() {
        return pesoMascota;
    }

    public void setPesoMascota(int pesoMascota) {
        this.pesoMascota = pesoMascota;
    }
}
