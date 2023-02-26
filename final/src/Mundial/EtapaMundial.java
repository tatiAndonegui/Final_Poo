package Mundial;
import java.util.ArrayList;
import java.util.Date;
public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList <Partido> partidos;

    //constructor
    public EtapaMundial(){
        this.partidos= new ArrayList<Partido>();
    };

    //getters y setters

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public void addPartido(Partido partido){
        this.partidos.add(partido);
    }

    protected ArrayList <Partido> getPartidos(){
        return partidos;
    }

    public ArrayList <Equipo> getEquiposQueAvanzan (){
        return null;

    }

}
