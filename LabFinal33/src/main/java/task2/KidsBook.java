package task2;

public class KidsBook extends Book{

    public KidsBook(String title, String author){
        super.title = title;
        super.author = author;
    }

    void setDiscountPercentage(){
        super.discountPercentage = 10;
    }


}
