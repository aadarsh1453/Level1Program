public class Tv {
    
    String brand;
    double size;
    double price;
    double discount_price;

    public Tv(String brand,double size,double price){

        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public double calculateDiscountTv(double discount_percentage){
        
        discount_price = price * (discount_percentage /100);

        if(size == 32){
            discount_percentage = 15;
            return price - discount_price;
        }
        else if(size == 42)
        return price - discount_price;
        return discount_price;
    }

    public void TvInfo(){

        System.out.println("Tv Brand : "+brand);
        System.out.println("Tv Size : "+size);
        System.out.println("Price of the Tv : "+price);
        System.out.println("Discount Price : "+discount_price);
    }

    public static void main(String[] args) {
        
        Tv t1 = new Tv("Samsung", 32, 15000);
        System.out.println( "Tv price with discount : "+t1.calculateDiscountTv(15));
        t1.TvInfo();
    }
}
