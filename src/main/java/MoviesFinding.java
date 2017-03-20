import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MoviesFinding
{
    class Movie
    {
        private int movieId;

        private float rating;

        private ArrayList<Movie> similaMovies;

        public Movie(final int movieId, final float rating)
        {
            this.movieId = movieId;
            this.rating = rating;
        }

        public int getId()
        {
            return movieId;
        }

        public float getRating()
        {
            return rating;
        }

        public void addSimilarMovies(Movie movie)
        {
            similaMovies.add(movie);
        }

        public List<Movie> getSimilarMovies()
        {
            return similaMovies;
        }
    }

    public Set<Movie> getMovieRecommendations(Movie movie, int N)
    {
        if(N ==0){
            return new HashSet<>();
        }

        Map<Integer, Boolean> alreadySeenMovie = new HashMap<>();
        List<Movie> relatedMovies = getMovieRecommendations(movie, alreadySeenMovie, new ArrayList<>());

        relatedMovies.remove(movie);

        if(relatedMovies.size() <= N) {
            return new HashSet<>(relatedMovies);
        }

        relatedMovies.sort((o1, o2) -> Float.compare(o2.getRating(), o1.getRating()));

        return new HashSet<>(relatedMovies.subList(0, N+1));
    }

    private List<Movie> getMovieRecommendations(
        Movie movie, Map<Integer, Boolean> alreadySeenMovie, List<Movie> relatedMovies
    )
    {
        if (alreadySeenMovie.get(movie.getId()) != null) {
            return relatedMovies;
        }

        alreadySeenMovie.put(movie.getId(), true);
        relatedMovies.add(movie);
        if (movie.getSimilarMovies() == null) {
            return relatedMovies;
        }

        movie.getSimilarMovies()
            .forEach(similarMovie -> getMovieRecommendations(similarMovie, alreadySeenMovie, relatedMovies));
        return relatedMovies;
    }
}


