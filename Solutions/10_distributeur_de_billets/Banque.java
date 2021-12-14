import java.util.ArrayList;

public class Banque {

  private static Banque instance;

  private ArrayList<Compte> listeComptes;

  private Banque() {
    this.listeComptes = new ArrayList<>();
  }

  public Banque getInstance() {
    if (instance == null) {
      instance = new Banque();
    }

    return instance;
  }

  public String addCompte(double soldeInitial) {
    Compte c = new Compte(soldeInitial);
    this.listeComptes.add(c);

    return c.getSecretKey();
  }

  public boolean addFonts(String key, double argent) {
    Compte c = listeComptes.stream().filter(compte -> compte.getSecretKey().equals(key)).findFirst().orElse(null);

    if (c == null || argent <= 0) {
      return false;
    } else {
      c.setSolde(c.getSolde() + argent);
      return true;
    }
  }

  public boolean withdrawFonds(String key, double argent) {
    Compte c = listeComptes.stream().filter(compte -> compte.getSecretKey().equals(key)).findFirst().orElse(null);

    if (c == null || argent <= 0) {
      return false;
    } else if (c.getSolde() < argent) {
      return false;
    }else {
      c.setSolde(c.getSolde() - argent);
      return true;
    }
  }
}
