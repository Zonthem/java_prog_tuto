public class Exercice5 {
  public static void main (String... args) {
    Cle5 cle = new Cle5();

    //On récupère la valeur aléatoire générée dans la classe CleSol5 pour pouvoir s'en resservir ensuite.
    String valeurAleatoire = cle.getRandomCle();

    System.out.println(cle.unlockValeur(valeurAleatoire));
  }
}
