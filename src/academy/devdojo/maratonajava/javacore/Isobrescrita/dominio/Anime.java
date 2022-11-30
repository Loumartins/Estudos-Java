package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                '}';
    }
}
