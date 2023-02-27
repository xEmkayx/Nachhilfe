package Februar.Mon27;

public enum Zutat {

    WASSER("Wasser"),
    KAFFEE("Kaffee"),
    KAKAO("Kakao"),
    ZUCKER("Zucker"),
    MILCH("Milch")
    ;

    private String name;

    Zutat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
