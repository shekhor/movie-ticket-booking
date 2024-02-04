public class CinemaHall {
    private String name;
    private int total_seats;

    public CinemaHall(String name, int total_seats) {
        this.name = name;
        this.total_seats = total_seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal_seats() {
        return total_seats;
    }

    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }
}
