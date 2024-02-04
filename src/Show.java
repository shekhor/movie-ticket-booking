import java.time.LocalDate;

public class Show {
    private int showId;
    private LocalDate createdOn;
    private String startTime;
    private String endTime;
    private String playedAt;
    private String movie;

    public Show(int showId, LocalDate createdOn, String startTime, String endTime, String playedAt, String movie) {
        this.showId = showId;
        this.createdOn = createdOn;
        this.startTime = startTime;
        this.endTime = endTime;
        this.playedAt = playedAt;
        this.movie = movie;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPlayedAt() {
        return playedAt;
    }

    public void setPlayedAt(String playedAt) {
        this.playedAt = playedAt;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
