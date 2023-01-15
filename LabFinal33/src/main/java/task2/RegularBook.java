package task2;

public class RegularBook extends Book{
    public RegularBook(String title, String author){
        super.title = title;
        super.author = author;
    }

    void setDiscountPercentage(){
        super.discountPercentage = 20;
    }
}
