package Mundial;

public class Resultado {
    private int golesLocales;
    private int golesVisitante;

    public Resultado (int golesLocales, int golesVisitante ){
        this.golesLocales=golesLocales;
        this.golesVisitante=golesVisitante;
    }

    public Resultado (){
        this.golesLocales= (int) (Math.random()*5);
        this.golesVisitante=(int) (Math.random()*5);
    }

    public int getGolesLocales() {
        return golesLocales;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public boolean ganoLocal() {
        if (golesLocales > golesVisitante) {
            return true;
        } else {
            return false;
        }
    }

    public boolean empate() {
        if (golesLocales == golesVisitante) {
            return true;
        }
        return false;
    }
}
