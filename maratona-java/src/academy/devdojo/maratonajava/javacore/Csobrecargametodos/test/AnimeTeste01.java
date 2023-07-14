package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Berserk", "TV", 195, "Drama/Aventura");
        anime.imprime();
    }
}
