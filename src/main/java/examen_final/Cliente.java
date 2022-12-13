package examen_final;

public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String telefono;
    private String edad;
    private String numeroV;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String cedula, String correo, String telefono, String edad, String numeroV) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.numeroV = numeroV;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumeroV() {
        return this.numeroV;
    }

    public void setNumeroV(String numeroV) {
        this.numeroV = numeroV;
    }

    public String toString() {
        return "Cliente{nombre='" + this.nombre + "', apellido='" + this.apellido + "', cedula='" + this.cedula + "', correo='" + this.correo + "', telefono='" + this.telefono + "', edad='" + this.edad + "', numeroV='" + this.numeroV + "'}";
    }
}

