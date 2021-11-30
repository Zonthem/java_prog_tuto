import java.util.Random;

/**
 * Class Clé contenant la clé que l'on recherche
 */
public class CleEx7 {

  /**
   * L'attribut "valeur" correspond à la clé que l'on recherche
   */
  private String valeur = "Bien joué !";
  private boolean isValeurAccessible = false;
  private final int RANDOM_KEY;
  private Random r;

  public CleEx7() {
    this.r = new Random();
    this.RANDOM_KEY = r.nextInt(50);
  }

  /**
   * getter de la valeur clé
   * @return la valeur clé si le getter a été correctement débloqué
   */
  public String getValeur() {
    if (this.isValeurAccessible) {
      return this.valeur;
    } else {
      return "Perdu ! La valeur clé n'est pas encore accessible.";
    }
  }

  /**
   * Si la bonne clé est fournie, débloque le getter getValeur()
   * @param cle nombre entier correspondant à la clé
   * @return vrai si le getter est débloqué, faux sinon
   */
  public boolean unlockValeur(int cle) {
    this.isValeurAccessible = (cle == this.RANDOM_KEY);
    return (cle == this.RANDOM_KEY);
  }

  /**
   * Génère une clé aléatoire
   * @return une clé aléatoire
   */
  public int generateRandomKey() {
    return r.nextInt(50);
  }
}