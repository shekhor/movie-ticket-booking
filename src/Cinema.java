import java.util.List;

public class Cinema {
    private String name;
    private int total_cinema_hall;
    private String location;
    private List<CinemaHall> halls;

    public Cinema(String name, int total_cinema_hall, String location, List<CinemaHall> halls) {
        this.name = name;
        this.total_cinema_hall = total_cinema_hall;
        this.location = location;
        this.halls = halls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal_cinema_hall() {
        return total_cinema_hall;
    }

    public void setTotal_cinema_hall(int total_cinema_hall) {
        this.total_cinema_hall = total_cinema_hall;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<CinemaHall> getHalls() {
        return halls;
    }

    public void setHalls(List<CinemaHall> halls) {
        this.halls = halls;
    }
}
