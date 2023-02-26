package Mundial;
import java.util.Date;
public class Partido {
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    //constructor
    public Partido (Date fecha,Equipo local,Equipo visitante, Resultado resultado){
        this.fecha=fecha;
        this.local=local;
        this.visitante=visitante;
        this.resultado=resultado;}

    //getters y setters
    public Resultado getResultado() {
        return resultado;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setEquipo(EtapaMundial etapaMundial) {
    }
}
