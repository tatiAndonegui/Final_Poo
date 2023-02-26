package Mundial;
import java.util.ArrayList;
import java.util.Date;
public class Equipo {
    private String nombre;
    private ArrayList<Partido> partidosJugados;
    private int puntaje;

    public Equipo (String nombre){
        this.nombre=nombre;
        this.puntaje=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
