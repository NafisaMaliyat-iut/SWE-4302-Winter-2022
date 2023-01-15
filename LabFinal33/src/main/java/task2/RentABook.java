package task2;


public class RentABook {
    static int rentID= 0;
    int rentDays;
    Book book;
    double baseRentFee;

    public RentABook(int rentDays, Book book, double baseRentFee){
        this.rentDays = rentDays;
        this.book = book;
        this.baseRentFee = baseRentFee;
        rentID++;
    }

    public double calculateRent(){
        double rent = baseRentFee;
        rent = rent - (book.discountPercentage) * 0.01 * rent;

        if(rentDays <= 7){
            rent = rent * rentDays;
        }
        else {
            rent = rent * 7;
            rent += (rentDays - 7) * 4;
        }


        return rent;
    }
}
