public class Exercice7 {
  public static void main (String... args) {
    Cle7 cle = new Cle7();

    boolean test = false;
    int valeurAleatoire;

    int compteur = 0;

    while (!test) {
      valeurAleatoire = cle.generateRandomKey();
      test = cle.unlockValeur(valeurAleatoire);

      compteur ++;
    }

    System.out.println(cle.getValeur());
    System.out.println("Valeur trouvée en " + compteur + " coups.");
  }
}
