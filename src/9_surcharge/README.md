# Exercice 9

Cet exercice n'est pas très compliqué par rapport aux autres, il veut simplement mettre le système de surcharge de signature.

Vous devez coder une classe java qui va permettre de gérer une propriété couleur de type String.
Cette propriété aura besoin de setter et de getter **mais** il est possible de donner deux types d'objets au setter :

```java
String s = "";
Obj.setCouleur(s);
Couleur c = new Couleur(r, g, b);
Obj.setCouleur(c);
```

Vous allez devoir donc gérer la classe Exercice9 de telle sorte à ce que son fonctionnement soit identique, que l'on fournisse une instance de Couleur ou une String.