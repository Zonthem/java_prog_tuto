import java.util.UUID;

public class Compte {

  private final String SECRET_KEY;

  private double solde;

  public Compte(double solde) {
    this.solde = solde;
    this.SECRET_KEY = UUID.randomUUID().toString();
  }

  public String getSecretKey() {
    return this.SECRET_KEY;
  }

  public double getSolde() {
    return solde;
  }

  public void setSolde(double solde) {
    this.solde = solde;
  }

}
