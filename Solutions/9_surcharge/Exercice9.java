public class Exercice9 {

  private String couleur;

  public Exercice9() {

  }

  public void setCouleur(String couleur) {
    this.couleur = couleur;
  }

  public void setCouleur(Couleur couleur) {
    this.couleur = couleur.getCouleur();
  }

  public String getCouleur() {
    return this.couleur;
  }

}
