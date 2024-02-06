package search;

public interface Search {
    void searchByTitle(String title);
    void searchByLanguage(String language);
    void searchByGenre(String genre);
    void searchByReleaseDate(String relDate);
    void searchByCity(String cityName);
}
