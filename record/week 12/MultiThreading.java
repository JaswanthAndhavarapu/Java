class Reservation { 
 
    int availableSeats = 10; 
 
    synchronized void reserve(String name, int seats) { 
 
        System.out.println(name + " entered."); 
        System.out.println("Available seats: " + availableSeats + 
                           " Requested seats: " + seats); 
 
        if (availableSeats >= seats) { 
            System.out.println("Seat Available. Reserve now :-)"); 
            availableSeats = availableSeats - seats; 
            System.out.println(seats + " seats reserved."); 
        } else { 
            System.out.println("Requested seats not available :-)"); 
        } 
 
        System.out.println(name + " leaving."); 
        System.out.println("----------------------------------------------"); 
    } 
} 
 
class Person extends Thread { 
 
    Reservation r; 
    int seats; 
 
    Person(Reservation r, String name, int seats) { 
        this.r = r; 
        this.seats = seats; 
        setName(name); 
    } 
 
    public void run() { 
        r.reserve(getName(), seats); 
    } 
} 
 
public class MultiThreading { 
 
    public static void main(String[] args) throws InterruptedException { 
 
        Reservation r = new Reservation(); 
 
        Person p1 = new Person(r, "Person-1", 5); 
        Person p2 = new Person(r, "Person-2", 2); 
Person p3 = new Person(r, "Person-3", 4); 
p1.start(); 
p1.join(); 
p2.start(); 
p2.join(); 
p3.start(); 
p3.join(); 
} 
}
