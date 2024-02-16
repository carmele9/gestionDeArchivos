    /**
    * La clase Departamento instancia un departameto de una empresa
     *
     * @author Carmen de los Ángeles Camacho Tejada
     * @version 1.0
     */
    public class Departamento {

        // Propiedades se la clase principal
        private String nombre;
        private String descripcion;
        private Departamento dependencia;
        private Trabajador responsable;

        /**
         * Método constructor específico de la clase
         *
         * @param nombre Nombre del archivo
         * @param descripcion Descripcion del departamento
         * @param dependencia Departamento con el que es dependiente
         * @param responsable Trabajador Responsable del departamento
         */
        public Departamento(String nombre, String descripcion, Departamento dependencia, Trabajador responsable){
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.dependencia = dependencia;
            this.responsable =responsable;
        }

        /**
         * Método accesor del parametro nombre
         * @return nombre
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Método accesor del parametro nombre
         * @param nombre
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Metodo accesor del parametro descripcion
         * @return descripcion
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Metodo instaciador del parametro descripcion
         * @param descripcion
         */
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        /**
         * Metodo accesor del parametro dependencia
         * @return depedencia
         */
        public Departamento getDependencia() {
            return dependencia;
        }

        /**
         * Metodo instaciódor del parametro dependencia
         * @param dependencia
         */
        public void setDependencia(Departamento dependencia) {
            this.dependencia = dependencia;
        }

        /**
         * Metodo accesor del parametro responsable
         * @return responsable
         */
        public Trabajador getResponsable() {
            return this.responsable;
        }

        /**
         * Metodo instaciador del parametro responsable
         * @param responsable
         */
        public void setResponsable(Trabajador responsable) {
            this.responsable = responsable;
        }
    }


