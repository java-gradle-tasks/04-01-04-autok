import java.util.ArrayList;
import java.util.List;

public class Repo {

    private List<Auto> autok;

    public Repo() {
        autok = new ArrayList<Auto>();

        autok.add(new Auto("skoda",7.3,false,"kék",5));
        autok.add(new Auto("lada",8.7,false,"fehér",5));
        autok.add(new Auto("opel",7.9,true,"kék",7));
        autok.add(new Auto("toyota",5.9,true,"piros",5));
        autok.add(new Auto("nissan",7.2,false,"kék",7));
    }

    public List<Auto> getAutok() {
        return autok;
    }
}
