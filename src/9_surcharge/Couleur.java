public class Couleur {
  
  private int rouge;
  private int vert;
  private int bleu;

  public Couleur(int rouge, int vert, int bleu) {
    this.rouge = (rouge > 255 ? 255 : (rouge < 0 ? 0 : rouge));
    this.vert = (vert > 255 ? 255 : (vert < 0 ? 0 : vert));
    this.bleu = (bleu > 255 ? 255 : (bleu < 0 ? 0 : bleu));
  }

  public String getCouleur() {
    String color = "#"
      + Integer.toHexString(rouge)
      + Integer.toHexString(vert)
      + Integer.toHexString(bleu);
    
    return color;
  }
}
