package Mundial;
import java.util.ArrayList;
public class Llave extends EtapaMundial{
    public ArrayList<Equipo> getEquiposQueAvanzan () {
        ArrayList<Equipo> equiposGanadores= new ArrayList<Equipo>();
        ArrayList<Partido> listaPartidos = super.getPartidos();


        //calculo del puntaje de los equipos
        for (int i=0 ; i<listaPartidos.size() ; i++){
            Equipo visitante=listaPartidos.get(i).getVisitante();
            Equipo local=listaPartidos.get(i).getLocal();
            Resultado resultado=listaPartidos.get(i).getResultado();

            if (resultado.empate()){
                int ganadorPorPenales= (int) (Math.random() * 2);
                if (ganadorPorPenales==0){
                    equiposGanadores.add(local);
                }else{
                    equiposGanadores.add(visitante);
                }
            } else if (resultado.ganoLocal()){
                equiposGanadores.add(local);
            }else{
                equiposGanadores.add(visitante);
            }
        }

        return equiposGanadores;
    }
}
