package MovieBookingSystem;

public class Movie {
    private int movieId;
    private String title;
    private int duration;
    private String genre;

    public Movie(int movieId, String title, int duration, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }
}
