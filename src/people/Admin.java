package people;

import datatype.Address;
import movie.Movie;
import movie.Show;

public class Admin extends Person {

    public Admin(String name, Address address, String email, String phone, Account account) {
        super(name, address, email, phone, account);
    }
    public void addMovie(Movie movie){
        System.out.println("movie.Movie is added");
    }
    public void addShow(Show show){
        System.out.println("movie.Movie.Show is created");
    }
    public void blockUser(Customer customer){
        System.out.println("User is blocked");
    }
}
