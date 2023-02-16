public abstract class Usuario {
    private int cedula;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String celular;
    private String direccionDeResidencia;
    private String ciudadDeResidencia;

    public Usuario(int cedula, String nombre, String apellido, String correoElectronico, String celular, String direccionDeResidencia, String ciudadDeResidencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.direccionDeResidencia = direccionDeResidencia;
        this.ciudadDeResidencia = ciudadDeResidencia;
    }
}
