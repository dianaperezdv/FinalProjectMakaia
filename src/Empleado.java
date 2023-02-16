import java.time.LocalDate;
public class Empleado extends Usuario{

    private String tipoDeSangreRH;
    private LocalDate antiguedadEmpleado;
    private TipoEmpleado tipoDeEmpleado;


    public Empleado(int cedula, String nombre, String apellido, String correoElectronico, String celular, String direccionDeResidencia, String ciudadDeResidencia, String tipoDeSangreRH, LocalDate antiguedadEmpleado, TipoEmpleado tipoDeEmpleado) {
        super(cedula, nombre, apellido, correoElectronico, celular, direccionDeResidencia, ciudadDeResidencia);
        this.tipoDeSangreRH = tipoDeSangreRH;
        this.antiguedadEmpleado = antiguedadEmpleado;
        this.tipoDeEmpleado = tipoDeEmpleado;
    }
}
