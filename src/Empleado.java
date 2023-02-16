public class Empleado extends Usuario{

    private String tipoDeSangreRH;
    private int antiguedadEmpleado;
    private String tipoDeEmpleado;


    public Empleado(double cedula, String nombre, String apellido, String correoElectronico, double celular, String direccionDeResidencia, String ciudadDeResidencia, String tipoDeSangreRH, int antiguedadEmpleado, String tipoDeEmpleado) {
        super(cedula, nombre, apellido, correoElectronico, celular, direccionDeResidencia, ciudadDeResidencia);
        this.tipoDeSangreRH = tipoDeSangreRH;
        this.antiguedadEmpleado = antiguedadEmpleado;
        this.tipoDeEmpleado = tipoDeEmpleado;
    }
}
