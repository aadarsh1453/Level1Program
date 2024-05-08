
public class Furniture {
    
    String type;
    String material;
    double price;
    double discount_price;
    double discount_percentage;

    public Furniture(String type, String material, double price){

        this.type = type;
        this.material = material;
        this.price = price;
    }

    public double calculateDiscountFurniture() {
         
        // discount_price = price * (discount_percentage/100);

         if(material == "plastic"){
            discount_percentage = 10;
            discount_price = price * (discount_percentage/100);
            return price - discount_price;
         }
         else if(material == "wooden"){
            discount_percentage = 15;
            discount_price = price * (discount_percentage/100);
            return price - discount_price;
         }
         else if(material == "metalic"){
            discount_percentage = 22;
            discount_price = price * (discount_percentage/100);
            return price - discount_price;
         }
         return discount_price;
    }

    public void furnitureInfo(){
        System.out.println("Furniture Type : "+type);
        System.out.println("Furniture Material : "+material);
        System.out.println("Furniture Price : "+price);
        System.out.println("Discount Price : "+discount_price);
    }

    public static void main(String[] args) {
        
        Furniture f1 = new Furniture("Bed", "metalic", 12000);
        System.out.println("Final price : "+f1.calculateDiscountFurniture());
        f1.furnitureInfo();
        System.out.println();
        Furniture f2 = new Furniture("chair", "wooden", 5000);
        System.out.println("Final price : "+f2.calculateDiscountFurniture());
        f2.furnitureInfo();
    }
}
