package mx.uv.castillo.formulariocontactos;

/**
 * Created by EmmanuelC on 9/24/16.
 */

public class contacto
{
    private String nombreContacto;
    private String fechaContacto;
    private String telefonoContacto;
    private String correoContacto;

    public contacto(String nombreContacto, String fechaContacto, String telefonoContacto, String correoContacto, String descripcionContacto) {
        this.nombreContacto = nombreContacto;
        this.fechaContacto = fechaContacto;
        this.telefonoContacto = telefonoContacto;
        this.correoContacto = correoContacto;
        this.descripcionContacto = descripcionContacto;
    }

    public String getDescripcionContacto() {
        return descripcionContacto;
    }

    public void setDescripcionContacto(String descripcionContacto) {
        this.descripcionContacto = descripcionContacto;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getFechaContacto() {
        return fechaContacto;
    }

    public void setFechaContacto(String fechaContacto) {
        this.fechaContacto = fechaContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    private String descripcionContacto;
}
