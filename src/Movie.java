import java.util.List;

public class Movie {
    private String title;
    private String description;
    private int durationInMinutes;
    private String language;
    private String releaseDate;
    private String country;
    private String genre;
    private Person movieAddedBy;
    private List<Show> shows;

    public Movie(String title, String description, int durationInMinutes, String language, String releaseDate, String country, String genre, Person movieAddedBy, List<Show> shows) {
        this.title = title;
        this.description = description;
        this.durationInMinutes = durationInMinutes;
        this.language = language;
        this.releaseDate = releaseDate;
        this.country = country;
        this.genre = genre;
        this.movieAddedBy = movieAddedBy;
        this.shows = shows;
    }

    public List<Show> getShows(){
        return shows;
    }
}
