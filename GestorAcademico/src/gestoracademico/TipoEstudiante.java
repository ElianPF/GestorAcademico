
package gestoracademico;


public class TipoEstudiante {
    
    private String nombre;
    private String mensaje;
    private boolean estado;
    
    
    public TipoEstudiante(String nombre, String mensaje, boolean estado){
        this.nombre=nombre;
        this.estado=estado;
        this.mensaje=mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public boolean isEstado() {
        return estado;
    }
    
}
