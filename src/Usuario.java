public class Usuario {
    private double cedula;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private double celular;
    private String direccionDeResidencia;
    private String ciudadDeResidencia;

    public Usuario(double cedula, String nombre, String apellido, String correoElectronico, double celular, String direccionDeResidencia, String ciudadDeResidencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.direccionDeResidencia = direccionDeResidencia;
        this.ciudadDeResidencia = ciudadDeResidencia;
    }
}
