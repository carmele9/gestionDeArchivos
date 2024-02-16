import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * La clase Persona instancia una persona que configurará caracteristicas basicas de un trabajador
 *
 * @author Carmen de los Ángeles Camacho Tejada
 * @version 1.0
 */

public abstract class Persona {

    // Propiedades se la clase principal
    protected String nombreCompleto;
    protected char sexo;
    protected LocalDate fechaNacimiento;
    protected int telefono;
    protected String correoElectronico;

    /**
     * Metodo constructor especifico de la clase
     *
     * @param nombreCompleto
     * @param sexo
     * @param fechaNacimiento
     * @param telefono
     * @param correoElectronico
     */
    public Persona(String nombreCompleto, char sexo, String fechaNacimiento, int telefono, String correoElectronico){
        this.nombreCompleto = nombreCompleto;
        this.sexo = sexo;
        setFechaNacimiento(fechaNacimiento);
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Metodo accesor del parametro nombreCompleto
     * @return nombreCompleto
     */
    protected String getNombreCompleto(){ return this.nombreCompleto;}

    /**
     * Metodo instaciador del parametro nombreCompleto
     * @param nombreCompleto
     */
    protected void setNombreCompleto(String nombreCompleto){this.nombreCompleto = nombreCompleto;}

    /**
     * Metodo accesor del parametro sexo
     * @return sexo
     */
    protected char getSexo(){return this.sexo;}

    /**
     * Metodo instaciador del parametro sexo
     * @param sexo
     */
    protected void setSexo(char sexo){this.sexo = sexo;}

    /**
     * Metodo accesor del parametro fechaNacimiento
     * @return fechaNacimiento
     */
    protected String getFechaNacimiento(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.fechaNacimiento.format(formato);
    }

    /**
     * Metodo instaciador del parametro fechaNacimiento
     * @param fecha
     */
    protected void setFechaNacimiento(String fecha){
        try {
            DateTimeFormatter formatoDDMM = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.fechaNacimiento = LocalDate.parse(fecha, formatoDDMM);
        } catch (Exception e) {
            System.out.println("la fecha de nacimento " + fecha + " no sigue con el formato dd/MM/yyyy");
        }
    }

    /**
     * Metodo accesor del parametro telefono
     * @return telefono
     */
    protected int getTelefono() {return this.telefono;}

    /**
     * Metodo instaciador del parametro telefono
     * @param telefono
     */
    protected void setTelefono(int telefono){this.telefono = telefono;}

    /**
     * Metodo accesor del parametro correoElectronico
     * @return correoElectronico
     */
    protected String getCorreoElectronico(){return this.correoElectronico;}

    /**
     * Metodo instaciador del parametro telefono
     * @param correoElectronico
     */
    protected void setCorreoElectronico(String correoElectronico){ this.correoElectronico = correoElectronico;}

}


