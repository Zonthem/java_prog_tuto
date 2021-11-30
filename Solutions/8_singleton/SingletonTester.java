public class SingletonTester {
  public static void main(String[] args) {

    Exercice8 exo = Exercice8.getInstance();
    String newValue = "Nouvelle Valeur !";

    if (exo == null) {
      System.err.println("Vous n'avez pas créé d'instancede Exercice8.");
      return;
    }

    if (exo.getValeur() != null && !"".equals(exo.getValeur())) {
      System.err.println("L'objet Valeur n'a pas été initialisé à null.");
      return;
    }

    exo.setValeur(newValue);
    if (!newValue.equals(exo.getValeur())) {
      System.err.println("La valeur a été mal attribuée.");
      return;
    }

    exo = Exercice8.getInstance();
    if (!newValue.equals(exo.getValeur())) {
      System.err.println("La requête du singleton a généré une nouvelle instance.");
      return;
    }

    System.out.println("Bien joué !");
  }
}
