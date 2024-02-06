package search;

import java.util.Map;

public class Catalog implements Search {
    private Map<String, Object> movieTitles;
    private Map<String, Object> movieLanguages;
    private Map<String, Object> movieGenres;
    private Map<String, Object> movieReleaseDates;
    private Map<String, Object> movieCities;
    @Override
    public void searchByTitle(String title) {
        movieTitles.get(title);
    }

    @Override
    public void searchByLanguage(String language) {
        movieLanguages.get(language);
    }

    @Override
    public void searchByGenre(String genre) {
        movieGenres.get(genre);
    }

    @Override
    public void searchByReleaseDate(String relDate) {
        movieReleaseDates.get(relDate);
    }

    @Override
    public void searchByCity(String cityName) {
        movieCities.get(cityName);
    }
}
