package JavaEight.Steeems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoviesStreamDemo {
    static class Movie{
        private String name;
        private int likes;

        public Movie(String name, int likes) {
            this.name = name;
            this.likes = likes;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        @Override
        public String toString() {
            return "Movie{" +
                    "name='" + name + '\'' +
                    ", likes=" + likes +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
          new Movie("khiladi420",7890),
          new Movie("Gajni",450),
          new Movie("Pk",6584),
          new Movie("Bhagvan",9875),
          new Movie("Don",6540),
          new Movie("Mere nam Joker",65478)
        );
//        for(Movie m:movies){
//            System.out.println(m.name);
//        }
//        movies.stream().forEach(i-> System.out.println(i.name));
        List<String> movie1 = Arrays.asList("RRR", "KGF","SIARAM","AVENGER INFINITY WAR");
        movie1.stream().forEach(name->System.out.println(name));
        movies.stream().sorted(Comparator.comparing(mo->mo.getLikes())).forEach(movie -> System.out.println(movie));
    }
}
