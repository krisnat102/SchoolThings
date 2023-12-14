package Abstract.Interface.Business;

public class Product{
    public Product(float priceTax, float salePrice, float productionPrice, String type) {
        this.priceTax = priceTax;
        this.salePrice = salePrice;
        this.productionPrice = productionPrice;
        this.type = type;
    }

    public float priceTax;
    public float salePrice;
    public float productionPrice;
    public String type;

    public void PrintInfo() {
        System.out.println("prices are " + priceTax + salePrice + productionPrice);
        System.out.println("Type is " + type);
    }
}
