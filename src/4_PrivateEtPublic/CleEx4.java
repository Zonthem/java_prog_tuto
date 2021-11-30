/**
 * Class Clé contenant la clé que l'on recherche
 */
public class CleEx4 {

  /**
   * L'attribut "valeur" correspond à la clé que l'on recherche
   */
  private String valeur = "Bien joué !";
  private boolean isValeurGettable = false;

  public CleEx4(String argument) {
    if (argument.length() > 10 && argument.length() < 15) {
      isValeurGettable = true;
    }
  }

  public String getValeur() {
    if (isValeurGettable) {
      return valeur;
    } else {
      return "Perdu !";
    }
  }
}