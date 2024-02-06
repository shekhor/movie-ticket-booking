package cinema;

public class CinemaHallSeat {
    private int hall_seat_id;
    private String seat_type;

    public CinemaHallSeat(int hall_seat_id, String seat_type) {
        this.hall_seat_id = hall_seat_id;
        this.seat_type = seat_type;
    }

    public int getHall_seat_id() {
        return hall_seat_id;
    }

    public void setHall_seat_id(int hall_seat_id) {
        this.hall_seat_id = hall_seat_id;
    }

    public String getSeat_type() {
        return seat_type;
    }

    public void setSeat_type(String seat_type) {
        this.seat_type = seat_type;
    }
}
