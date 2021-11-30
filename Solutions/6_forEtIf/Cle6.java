import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Class Clé contenant la clé que l'on recherche
 */
public class Cle6 {

  /**
   * L'attribut "valeur" correspond à la clé que l'on recherche
   */
  private String valeur = "Bien joué !";
  private String[] liste = new String[10];
  private final String RANDOM_KEY;

  public Cle6() {
    this.RANDOM_KEY = UUID.randomUUID().toString();

    Arrays.fill(this.liste, "null");
    this.liste[0] = RANDOM_KEY;
    Cle6.shuffleArray(liste);
  }

  public String unlockValeur(String cle) {
    if (RANDOM_KEY.equals(cle)) {
      return valeur;
    } else {
      return "Perdu ! La clé fournie n'est pas valide.";
    }
  }

  /**
   * La liste contient pleins de chaines de caractère "null", un seul de ces élément est la clé que l'on recherche
   * @return Une liste de String. (Au passage, on appelle ça un tableau et non une liste, le premier a une taille fixe quand le second est variable.
   * Mais par abus de langage on ne fait plus la distinction.)
  */
  public String[] getListe() {
    return liste;
  }

  /**
   * Simple fonction de mélange basée sur StackOverflow.
   * Le mélange s'effectue directement dans l'objet, la fonction n'a pas de retour car elle ne génère pas une seconde liste mélangée.
   * @param ar la liste a mélanger. 
   */
  static void shuffleArray(String[] ar)
  {
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      String a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
}