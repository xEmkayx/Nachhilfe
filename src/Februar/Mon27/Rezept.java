package Februar.Mon27;

public class Rezept {

    private String name;

    private double wasserMenge;
    private double kaffeeMenge;
    private double kakaoMenge;
    private double zuckerMenge;
    private double milchMenge;

    public Rezept(String name, double wasserMenge, double kaffeeMenge, double kakaoMenge, double zuckerMenge, double milchMenge) {
        this.name = name;
        this.wasserMenge = wasserMenge;
        this.kaffeeMenge = kaffeeMenge;
        this.kakaoMenge = kakaoMenge;
        this.zuckerMenge = zuckerMenge;
        this.milchMenge = milchMenge;
    }

    public String getName() {
        return name;
    }

    public double getWasserMenge() {
        return wasserMenge;
    }

    public double getKaffeeMenge() {
        return kaffeeMenge;
    }

    public double getKakaoMenge() {
        return kakaoMenge;
    }

    public double getZuckerMenge() {
        return zuckerMenge;
    }

    public double getMilchMenge() {
        return milchMenge;
    }
}
