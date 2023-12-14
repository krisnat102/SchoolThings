package Abstract.Interface.Business;

public class Journal extends Product implements Publisher{
    public Journal(float priceTax, float salePrice, float productionPrice, String type, String title, int pageNumber, String group) {
        super(priceTax, salePrice, productionPrice, type);
        this.title = title;
        this.pageNumber = pageNumber;
        this.group = group;
    }

    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("title is " + title + " page num is " + pageNumber + " group is " + group );
    }
    public String title;
    public int pageNumber;
    public String group;
}
