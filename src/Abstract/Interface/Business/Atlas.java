package Abstract.Interface.Business;

public class Atlas extends Book{

    public String continent;
    public int year;

    public Atlas(float priceTax, float salePrice, float productionPrice, String type, String title, String author, String continet, int year) {
        super(priceTax, salePrice, productionPrice, type, title, author);
        this.continent = continet;
        this.year = year;
    }

    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("continent is" + continent);
        System.out.println("year is " + year);
    }
}
