package booking;

import movie.Movie;

import java.util.Date;

public class Booking {
    private String bookingNumber;
    private int numberOfSeats;
    private Date createdDate;
    private String status;
    private Movie.Show show;
    private ShowSeat[] seats;
    private Payment payment;

    public Booking(String bookingNumber, int numberOfSeats, Date createdDate, String status, Movie.Show show, ShowSeat[] seats, Payment payment) {
        this.bookingNumber = bookingNumber;
        this.numberOfSeats = numberOfSeats;
        this.createdDate = createdDate;
        this.status = status;
        this.show = show;
        this.seats = seats;
        this.payment = payment;
    }

    public void makePayment(Payment payment){

    }

    public void assignSeats(ShowSeat[] seats){

    }

    public void cancel(){

    }
}
