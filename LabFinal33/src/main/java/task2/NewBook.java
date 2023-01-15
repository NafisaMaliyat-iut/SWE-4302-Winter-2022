package task2;

public class NewBook extends Book{
    public NewBook(String title, String author){
        super.title = title;
        super.author = author;
    }

    void setDiscountPercentage(){
        super.discountPercentage = 30;
    }
}
