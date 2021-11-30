/**
 * Class Clé contenant la clé que l'on recherche
 */
public class CleEx5 {

  /**
   * L'attribut "valeur" correspond à la clé que l'on recherche
   */
  private String valeur = "Bien joué !";
  private final String RANDOM;

  public CleEx5() {
    RANDOM = UUID.randomUUID().toString();
  }

  public String unlockValeur(String cle) {
    if (RANDOM.equals(cle)) {
      return valeur;
    } else {
      return "Perdu ! La clé fournie n'est pas valide.";
    }
  }

  public String getRandomCle() {
    return RANDOM;
  }
}