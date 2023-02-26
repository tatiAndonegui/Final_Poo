package Mundial;
import java.util.ArrayList;
public class Grupo extends EtapaMundial{
    public ArrayList<Equipo> getEquiposQueAvanzan () {
        ArrayList<Equipo> equiposGanadores= new ArrayList<Equipo>();
        ArrayList<Partido> listaPartidos = super.getPartidos();
        Equipo mejorEquipo = new Equipo("");
        Equipo segundoMejor = new Equipo("");
        int mejorPuntaje = 0;
        int segundoMejorPuntaje=0;

        //calculo del puntaje de los equipos
        for (int i=0 ; i<listaPartidos.size() ; i++){
            Equipo visitante=listaPartidos.get(i).getVisitante();
            Equipo local=listaPartidos.get(i).getLocal();
            Resultado resultado=listaPartidos.get(i).getResultado();
            System.out.println(visitante.getNombre() + ": " + resultado.getGolesVisitante() + " " + local.getNombre() + ": " + resultado.getGolesLocales());
            if (resultado.empate()){
                visitante.setPuntaje(visitante.getPuntaje() + 1);
                local.setPuntaje(local.getPuntaje() + 1);
            }
            if (resultado.ganoLocal()){
                local.setPuntaje(local.getPuntaje() + 2);
            }else{
                visitante.setPuntaje(local.getPuntaje() + 2);
            }
        }

        // se ven cuales son los dos mejores equipos
        for (int i=0 ; i<listaPartidos.size() ; i++){
            Equipo visitante=listaPartidos.get(i).getVisitante();
            Equipo local=listaPartidos.get(i).getLocal();

            if (mejorPuntaje< visitante.getPuntaje()){
                mejorPuntaje= visitante.getPuntaje();
                mejorEquipo=visitante;
            }
            if (mejorPuntaje< local.getPuntaje()){
                mejorPuntaje= local.getPuntaje();
                mejorEquipo=local;
            }

            if (segundoMejorPuntaje < visitante.getPuntaje() && !mejorEquipo.getNombre().equals(visitante.getNombre())){
                segundoMejorPuntaje= visitante.getPuntaje();
                segundoMejor=visitante;
            }
            if (segundoMejorPuntaje < local.getPuntaje() && !mejorEquipo.getNombre().equals(local.getNombre())){
                segundoMejorPuntaje= local.getPuntaje();
                segundoMejor=local;
            }
        }

        equiposGanadores.add(mejorEquipo);
        equiposGanadores.add(segundoMejor);
        return equiposGanadores;
    }
}
