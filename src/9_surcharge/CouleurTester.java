import java.util.Random;

public class CouleurTester {
  public static void main(String[] args) {
    Exercice9 ex1 = new Exercice9();
    Exercice9 ex2 = new Exercice9();

    Random r = new Random();
    int rouge = r.nextInt(255);
    int vert = r.nextInt(255);
    int bleu = r.nextInt(255);

    String color = "#"
      + Integer.toHexString(rouge)
      + Integer.toHexString(vert)
      + Integer.toHexString(bleu);

    Couleur c = new Couleur (rouge, vert, bleu);

    System.out.println("Couleur générée : " + color);

    ex1.setCouleur(c);
    ex2.setCouleur(color);

    System.out.println("Couleur appliquée 1 : " + ex1.getCouleur());
    System.out.println("Couleur appliquée 2 : " + ex2.getCouleur());

    if (c.getCouleur().equals(ex1.getCouleur()) && c.getCouleur().equals(ex2.getCouleur())) {
      System.out.println("Bien joué !");
    } else {
      System.err.println("Perdu !");
    }
  }
}
