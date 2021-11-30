public class Exercice8 {
  
  private String valeur;
  private static Exercice8 instance;

  private Exercice8() {}

  public String getValeur() {
    return this.valeur;
  }

  public void setValeur(String valeur) {
    this.valeur = valeur;
  }

  public static Exercice8 getInstance() {
    if (instance == null) {
      instance = new Exercice8();
    }
  
    return instance;
  }

}
