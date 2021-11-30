public class Exercice4 {
  public static void main (String... args) {
    String argument = "1234567891011";

    //En donnant une String au constructeur d'une longueur comprise entre 10 et 15 char,
    //On active le méchanisme interne qui va mettre à disposition le getter
    Cle4 cle = new Cle4(argument);

    System.out.println(cle.getValeur());
  }
}
