import data.ObjetivosData;
import model.Objetivo;
import services.ObjetivosService;

public class PoupeMaisMain {

    public static void main(String[] args) {
        ObjetivosData data = new ObjetivosData();
        ObjetivosService service = new ObjetivosService();

        Objetivo objetivo = new Objetivo(    "Casa Proprioa",
        "Rodrigo Neri",
        "casa",
        450000,
        5,
        2000);

        data.createObjetivos().add(objetivo);


    }
}
