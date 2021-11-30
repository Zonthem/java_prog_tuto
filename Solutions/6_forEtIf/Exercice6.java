public class Exercice6 {
  public static void main (String... args) {
    Cle6 cle = new Cle6();

    String[] liste = cle.getListe();
    String valeurAleatoire = "";

    for (int i = 0; i < liste.length; i++) {
      if (!"null".equals(liste[i])) {
        valeurAleatoire = liste[i];
        System.out.println("clé : " + liste[i]);
        System.out.println("trouvé à l'index " + i + " de la liste");
      }
    }

    // Notez qu'il existe un autre type de boucle en java pour parcourir un tableau d'objet
    // for (String s : liste) {}

    //Une petite vérification que notre boucle a fonctionné !
    if (!"".equals(valeurAleatoire)) {
      System.out.println(cle.unlockValeur(valeurAleatoire));
    }
  }
}
