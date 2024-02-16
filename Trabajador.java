import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
* La clase Trabajador instancia un trabajador de un departamento de una empresa
 *
 * @author Carmen de los Ángeles Camacho Tejada
 * @version 1.0
 */
public class Trabajador extends Persona{

    // Propiedades se la clase principal
    private Departamento departamento;
    private float salario;
    private String numeroSS;
    private LocalDate fechaAlta;
    private boolean esResponsable;

    /**
     * Metodo constructor de la clase
     * @param nombreCompleto
     * @param sexo
     * @param fechaNacimiento
     * @param telefono
     * @param correoElectronico
     * @param departmento
     * @param salario
     * @param fechaAlta
     * @param esResponsable
     * @param numeroSS
     */
    public Trabajador(String nombreCompleto, char sexo, String fechaNacimiento, int telefono, String correoElectronico, Departamento departmento, float salario,String fechaAlta, boolean esResponsable, String numeroSS) {
        super(nombreCompleto, sexo, fechaNacimiento, telefono, correoElectronico);
        this.departamento = departmento;
        this.salario = salario;
        setFechaAlta(fechaAlta);
        this.esResponsable = esResponsable;
        this.numeroSS = numeroSS;
    }

    /**
     * Metodo accesor del parametro departamento
     * @return departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Metodo instaciador del parametro departamento
     * @param departamento
     */
    public void setDepartamento(Departamento departamento) {
            this.departamento = departamento;
        }

    /**
     * Metodo accesor del parametro salario
     * @return salario
     */
    public float getSalario() {
            return salario;
        }

    /**
     * Metodo instaciador del parametro salario
     * @param salario
     */
    public void setSalario(float salario) {
            this.salario = salario;
        }

    /**
     * Metodo accesor del parametro numeroSS
     * @return numeroSS
     */
    public String getNumeroSS() {
            return numeroSS;
        }

    /**
    * Metodo instaciador del parametro numeroSS
    * @param numeroSS
    */
    public void setNumeroSS(String numeroSS) {
            this.numeroSS = numeroSS;
        }

    /**
    * Metodo accesor del parametro fechaAlta
     *
     * @return fechaAlta
     * */
    public String getFechaAlta() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaAlta.format(formatter);
    }

    /**
     * Metodo instaciador del parametro fechaAlta
     * @param fechaAlta
     */
    public void setFechaAlta(String fechaAlta) {
        try {
            DateTimeFormatter formatoDDMM = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.fechaAlta= LocalDate.parse(fechaAlta, formatoDDMM);

        } catch (Exception e) {
            System.out.println("la fecha de alta " + fechaAlta + " no sigue con el formato dd/MM/yyyy");
        }
    }

    /**
    * Metodo accesor del parametro esResponsable:
    * Para ello se establecera una relacion con el departamento para comprobar si este es su responsable.
    * @return esResponsable
    */
    public boolean esResponsable() {
        if (departamento.getResponsable().getNombreCompleto() == this.nombreCompleto) {this.esResponsable= true;}
        return this.esResponsable;
    }

    /**
    * Metodo instaciador del parametro esResponsable
    * @param esResponsable
    *
    */
    public void setResponsabilidad(boolean esResponsable) { this.esResponsable = esResponsable; }
}


