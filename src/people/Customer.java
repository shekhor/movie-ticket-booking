package people;

import booking.Booking;
import datatype.Address;

import java.util.List;

public class Customer extends Person {
    public Customer(String name, Address address, String email, String phone, Account account) {
        super(name, address, email, phone, account);
    }

    public void makeBooking(Booking booking){

    }

    public List<Booking> getBooking(){
        return null;
    }
}
