
package githuntest;

public class Movie {
    private String movieName = null;
    private int movieYear = 0;
    
    public Movie(String name, int year) {
        this.movieName = name;
        this.movieYear = year;
    }
    
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }
    
    
}
