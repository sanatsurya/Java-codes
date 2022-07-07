package JavaEight.Steeems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ImparativeDeclarative {
    static class Movie{
        private String name;
        private int Like;
        private int Earnings;

        public Movie(String name, int like, int earnings) {
            this.name = name;
            Like = like;
            Earnings = earnings;
        }

        public String getName() {
            return name;
        }

        public int getLike() {
            return Like;
        }

        public int getEarnings() {
            return Earnings;
        }
    }

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
          new Movie("Kgf",25748,25000014),
          new Movie("Bahubali",54789,24557889),
          new Movie("Robot 2.0" ,52145,254778),
          new Movie("Adipurush",254788,2577845),
          new Movie("Jagahatarepagha",95749845,65789),
          new Movie("Rakhile Jaga Mariba Kie",454456,65789),
          new Movie("Tu thile mor Dara Kahaku",74981554,65789),
          new Movie("Patitapabana", (int) (Math.random()*10000),65789)
        );
        System.out.println(movies);
        int morelikes =0;
        int morethan2500 =0;
        //Imparative
        for (Movie movie: movies){
            if (movie.getLike()>morelikes){
                morelikes=movie.getLike();
            }
            if(movie.getLike()>25780){
                morethan2500++;
            }
        }
        System.out.println("Highest likes is " + morelikes);
        System.out.println("More than 25780 likes is" +morethan2500);
        Predicate<Movie> movieswith2500likes = movie -> movie.getLike()>2500;
        Stream<Movie> moviesstream = movies.stream();
        long Movies2500likesi = movies.stream().filter(movieswith2500likes).count();
        long Movies2500likes = moviesstream.filter(movieswith2500likes).count();
        long Movies2500likes4 = moviesstream.filter(movieswith2500likes).count();
        System.out.println(Movies2500likes+"steem test");
        System.out.println(Movies2500likesi);
     }

}
