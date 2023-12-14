package Abstract.Interface.Business;

public class Book extends Product implements Publisher{
    public Book(float priceTax, float salePrice, float productionPrice, String type, String title, String author) {
        super(priceTax, salePrice, productionPrice, type);
        this.title = title;
        this.author = author;
    }

    public String title;
    public String author;

    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("title is" + title + " author is " + author);
    }
}
