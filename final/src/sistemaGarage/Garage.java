package sistemaGarage;
import Mundial.*;
import vehiculos.Vehicles;
import java.util.ArrayList;
import java.util.Date;

public class Garage {
    private int maximunSizeOfTheGarage;
    private int currentAumountOfVehicles;
    private double wheelChangePrice;
    private ArrayList<Vehicles> vehicles;


    public void vehicleEntry(Vehicles vehicle){
        if (currentAumountOfVehicles == maximunSizeOfTheGarage){
            System.out.println("El garage esta lleno");
        } else {
            this.vehicles.add(vehicle);
            currentAumountOfVehicles = currentAumountOfVehicles + 1;
        }

    }
    public void vehicleExit(Vehicles vehicle){
        if (currentAumountOfVehicles == 0){
            System.out.println("El garage esta vacio");
        } else {
            this.vehicles.remove(vehicle);
            currentAumountOfVehicles = currentAumountOfVehicles - 1;
            //aca va el sorteo del mundial cuando retira vehiculo
        }
    }
    public void setWheelChangePrice(double wheelChangePrice) {
        this.wheelChangePrice = wheelChangePrice;
    }
    public double getWheelChangePrice() {
        return wheelChangePrice;
    }

    public void setMaximunSizeOfTheGarage(int maximunSizeOfTheGarage) {
        this.maximunSizeOfTheGarage = maximunSizeOfTheGarage;
    }
    public int getMaximunSizeOfTheGarage() {
        return maximunSizeOfTheGarage;
    }


    public int getCurrentAumountOfVehicles() {
        return currentAumountOfVehicles;
    }

    public double getTotalPrice(Vehicles vehicle){
        return vehicle.getTotalWheels() * wheelChangePrice;
    }

    public double getAverageKilometers(ArrayList<Vehicles> vehicles){
        double kilometerTotal =0;
        for (int i = 0; i < vehicles.size(); i++) {
            kilometerTotal = kilometerTotal + vehicles.get(i).getKilometers();
        }
        return kilometerTotal /vehicles.size();
    }

     public String getGanadorMundial(){
         //grupo a
         Equipo qatar = new Equipo("qatar");
         Equipo ecuador = new Equipo("ecuador");
         Equipo senegal = new Equipo("senegal");
         Equipo paises_bajos = new Equipo("paises bajos");

         //grupo b
         Equipo inglaterra = new Equipo("inglaterra");
         Equipo eeuu = new Equipo("eeuu");
         Equipo iran = new Equipo("iran");
         Equipo gales = new Equipo("gales");

         //grupo c
         Equipo argentina = new Equipo("argentina");
         Equipo arabia = new Equipo("arabia");
         Equipo mexico = new Equipo("mexico");
         Equipo polonia = new Equipo("polonia");

         //grupo d
         Equipo francia = new Equipo("francia");
         Equipo dinamarca = new Equipo("dinamarca");
         Equipo australia = new Equipo("australia");
         Equipo tunez = new Equipo("tunez");

         //grupo e
         Equipo espania = new Equipo("espania");
         Equipo costa_rica = new Equipo("costa_rica");
         Equipo alemania = new Equipo("alemania");
         Equipo japon = new Equipo("japon");

         //grupo f
         Equipo belgica = new Equipo("belgica");
         Equipo marruecos = new Equipo("marruecos");
         Equipo canada = new Equipo("canada");
         Equipo croacia = new Equipo(" croacia");

         //grupo g
         Equipo brasil = new Equipo("brasil");
         Equipo suiza = new Equipo("suiza");
         Equipo camerun = new Equipo("camerun");
         Equipo serbia = new Equipo("serbia");

         //grupo h
         Equipo portugal = new Equipo("portugal");
         Equipo uruguay = new Equipo("uruguay");
         Equipo corea_del_sur = new Equipo("corea_del_sur");
         Equipo ghana = new Equipo("ghana");

         EtapaMundial grupoA = new Grupo();
         grupoA.setDescripcionEtapa("grupo a");
         grupoA.addPartido(new Partido(new Date(), qatar,ecuador,new Resultado()));
         grupoA.addPartido(new Partido(new Date(), senegal,paises_bajos,new Resultado()));
         grupoA.addPartido(new Partido(new Date(), qatar,senegal,new Resultado()));
         grupoA.addPartido(new Partido(new Date(), paises_bajos,ecuador,new Resultado()));
         grupoA.addPartido(new Partido(new Date(), paises_bajos,qatar,new Resultado()));
         grupoA.addPartido(new Partido(new Date(), ecuador,senegal,new Resultado()));

         EtapaMundial grupoB = new Grupo();
         grupoB.setDescripcionEtapa("grupo b");
         grupoB.addPartido(new Partido(new Date(), inglaterra,iran,new Resultado()));
         grupoB.addPartido(new Partido(new Date(), eeuu,gales,new Resultado()));
         grupoB.addPartido(new Partido(new Date(), inglaterra,eeuu,new Resultado()));
         grupoB.addPartido(new Partido(new Date(), gales,iran,new Resultado()));
         grupoB.addPartido(new Partido(new Date(), gales,inglaterra,new Resultado()));
         grupoB.addPartido(new Partido(new Date(), iran,eeuu,new Resultado()));

         EtapaMundial grupoC = new Grupo();
         grupoC.setDescripcionEtapa("grupo c");
         grupoC.addPartido(new Partido(new Date(), argentina,arabia,new Resultado()));
         grupoC.addPartido(new Partido(new Date(), mexico,polonia,new Resultado()));
         grupoC.addPartido(new Partido(new Date(), argentina,mexico,new Resultado()));
         grupoC.addPartido(new Partido(new Date(), polonia,arabia,new Resultado()));
         grupoC.addPartido(new Partido(new Date(), polonia,argentina,new Resultado()));
         grupoC.addPartido(new Partido(new Date(), arabia,mexico,new Resultado()));

         EtapaMundial grupoD = new Grupo();
         grupoD.setDescripcionEtapa("grupo d");
         grupoD.addPartido(new Partido(new Date(), francia,australia,new Resultado()));
         grupoD.addPartido(new Partido(new Date(), dinamarca,tunez,new Resultado()));
         grupoD.addPartido(new Partido(new Date(), francia,dinamarca,new Resultado()));
         grupoD.addPartido(new Partido(new Date(), tunez,australia,new Resultado()));
         grupoD.addPartido(new Partido(new Date(), tunez,francia,new Resultado()));
         grupoD.addPartido(new Partido(new Date(), australia,dinamarca,new Resultado()));

         EtapaMundial grupoE = new Grupo();
         grupoE.setDescripcionEtapa("grupo e");
         grupoE.addPartido(new Partido(new Date(), espania,costa_rica,new Resultado()));
         grupoE.addPartido(new Partido(new Date(), alemania,japon,new Resultado()));
         grupoE.addPartido(new Partido(new Date(), espania,alemania,new Resultado()));
         grupoE.addPartido(new Partido(new Date(), japon,costa_rica,new Resultado()));
         grupoE.addPartido(new Partido(new Date(), japon,espania,new Resultado()));
         grupoE.addPartido(new Partido(new Date(), costa_rica,alemania,new Resultado()));

         EtapaMundial grupoF = new Grupo();
         grupoF.setDescripcionEtapa("grupo f");
         grupoF.addPartido(new Partido(new Date(), belgica,canada,new Resultado()));
         grupoF.addPartido(new Partido(new Date(), marruecos,croacia,new Resultado()));
         grupoF.addPartido(new Partido(new Date(), belgica,marruecos,new Resultado()));
         grupoF.addPartido(new Partido(new Date(), croacia,canada,new Resultado()));
         grupoF.addPartido(new Partido(new Date(), croacia,belgica,new Resultado()));
         grupoF.addPartido(new Partido(new Date(), canada,marruecos,new Resultado()));

         EtapaMundial grupoG = new Grupo();
         grupoG.setDescripcionEtapa("grupo g");
         grupoG.addPartido(new Partido(new Date(), brasil,serbia,new Resultado()));
         grupoG.addPartido(new Partido(new Date(), suiza,camerun,new Resultado()));
         grupoG.addPartido(new Partido(new Date(), brasil,suiza,new Resultado()));
         grupoG.addPartido(new Partido(new Date(), camerun,serbia,new Resultado()));
         grupoG.addPartido(new Partido(new Date(), camerun,brasil,new Resultado()));
         grupoG.addPartido(new Partido(new Date(), serbia,suiza,new Resultado()));

         EtapaMundial grupoH = new Grupo();
         grupoH.setDescripcionEtapa("grupo h");
         grupoH.addPartido(new Partido(new Date(), portugal,ghana,new Resultado()));
         grupoH.addPartido(new Partido(new Date(), uruguay,corea_del_sur,new Resultado()));
         grupoH.addPartido(new Partido(new Date(), portugal,uruguay,new Resultado()));
         grupoH.addPartido(new Partido(new Date(), corea_del_sur,ghana,new Resultado()));
         grupoH.addPartido(new Partido(new Date(), corea_del_sur,portugal,new Resultado()));
         grupoH.addPartido(new Partido(new Date(), ghana,uruguay,new Resultado()));

         ArrayList<Equipo> mejoresGrupoA = grupoA.getEquiposQueAvanzan();
         ArrayList<Equipo> mejoresGrupoB = grupoB.getEquiposQueAvanzan();
         ArrayList<Equipo> mejoresGrupoC = grupoC.getEquiposQueAvanzan();
         ArrayList<Equipo> mejoresGrupoD = grupoD.getEquiposQueAvanzan();
         ArrayList<Equipo> mejoresGrupoE = grupoE.getEquiposQueAvanzan();
         ArrayList<Equipo> mejoresGrupoF = grupoF.getEquiposQueAvanzan();
         ArrayList<Equipo> mejoresGrupoG = grupoG.getEquiposQueAvanzan();
         ArrayList<Equipo> mejoresGrupoH = grupoH.getEquiposQueAvanzan();

         //OCTAVOS DE FINAL

         EtapaMundial octavosFinal = new Llave();
         octavosFinal.setDescripcionEtapa("octavos de final");
         // MEJORES POSICION 0 , SEGUNDOS MEJORES POSICION 1
         octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoA.get(0),mejoresGrupoB.get(1),new Resultado()));
         octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoC.get(0),mejoresGrupoD.get(1),new Resultado()));
         octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoE.get(0),mejoresGrupoF.get(1),new Resultado()));
         octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoG.get(0),mejoresGrupoH.get(1),new Resultado()));
         octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoB.get(0),mejoresGrupoA.get(1),new Resultado()));
         octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoD.get(0),mejoresGrupoC.get(1),new Resultado()));
         octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoF.get(0),mejoresGrupoE.get(1),new Resultado()));
         octavosFinal.addPartido(new Partido(new Date(),mejoresGrupoH.get(0),mejoresGrupoG.get(1),new Resultado()));

         System.out.println("Los equipos que pasan a octavos de final son: ");
         for (int i=0 ; i<mejoresGrupoA.size() ; i++){
             System.out.println(mejoresGrupoA.get(i).getNombre());
         }

         for (int i=0 ; i<mejoresGrupoB.size() ; i++){
             System.out.println(mejoresGrupoB.get(i).getNombre());
         }

         for (int i=0 ; i<mejoresGrupoC.size() ; i++){
             System.out.println(mejoresGrupoC.get(i).getNombre());
         }

         for (int i=0 ; i<mejoresGrupoD.size() ; i++){
             System.out.println(mejoresGrupoD.get(i).getNombre());
         }

         for (int i=0 ; i<mejoresGrupoE.size() ; i++){
             System.out.println(mejoresGrupoE.get(i).getNombre());
         }

         for (int i=0 ; i<mejoresGrupoF.size() ; i++){
             System.out.println(mejoresGrupoF.get(i).getNombre());
         }

         for (int i=0 ; i<mejoresGrupoG.size() ; i++){
             System.out.println(mejoresGrupoG.get(i).getNombre());
         }

         for (int i=0 ; i<mejoresGrupoH.size() ; i++){
             System.out.println(mejoresGrupoH.get(i).getNombre());
         }

         //CUARTOS DE FINAL
         EtapaMundial cuartosFinal = new Llave();
         cuartosFinal.setDescripcionEtapa("cuartos de final");
         ArrayList<Equipo> mejoresOctavos = octavosFinal.getEquiposQueAvanzan();

         System.out.println("Los equipos que pasan a cuartos de final son: ");
         for (int i=0 ; i<mejoresOctavos.size() ; i++){
             System.out.println(mejoresOctavos.get(i).getNombre());
         }

         cuartosFinal.addPartido(new Partido(new Date(),mejoresOctavos.get(0),mejoresOctavos.get(2),new Resultado()));
         cuartosFinal.addPartido(new Partido(new Date(),mejoresOctavos.get(1),mejoresOctavos.get(3),new Resultado()));
         cuartosFinal.addPartido(new Partido(new Date(),mejoresOctavos.get(4),mejoresOctavos.get(6),new Resultado()));
         cuartosFinal.addPartido(new Partido(new Date(),mejoresOctavos.get(5),mejoresOctavos.get(7),new Resultado()));

         //SEMI FINAL
         ArrayList<Equipo> mejoresCuartos = cuartosFinal.getEquiposQueAvanzan();

         System.out.println("Los equipos que pasan a semi final son: ");

         for (int i=0 ; i<mejoresCuartos.size() ; i++){
             System.out.println(mejoresCuartos.get(i).getNombre());
         }

         EtapaMundial semiFinal = new Llave();
         semiFinal.setDescripcionEtapa("semi final");

         semiFinal.addPartido(new Partido(new Date(),mejoresCuartos.get(0),mejoresCuartos.get(2),new Resultado()));
         semiFinal.addPartido(new Partido(new Date(),mejoresCuartos.get(1),mejoresCuartos.get(3),new Resultado()));

         // FINAL
         ArrayList<Equipo> mejoresSemifinal = semiFinal.getEquiposQueAvanzan();

         System.out.println("Los equipos que pasan a la final son: ");

         for (int i=0 ; i<mejoresSemifinal.size() ; i++){
             System.out.println(mejoresSemifinal.get(i).getNombre());
         }

         EtapaMundial partidoFinal = new Llave();
         partidoFinal.setDescripcionEtapa("final");

         partidoFinal.addPartido(new Partido(new Date(),mejoresSemifinal.get(0),mejoresSemifinal.get(1),new Resultado()));

         // Ganador del mundial
         ArrayList<Equipo> ganador = partidoFinal.getEquiposQueAvanzan();
         System.out.println("El ganador del mundial es " + ganador.get(0).getNombre());
            return ganador.get(0).getNombre();
     }

}

