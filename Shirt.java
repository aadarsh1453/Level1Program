public class Shirt {
    
    String size;
    String color;
    double price;
    double discount_percentage; 
    double discount_price;

    public Shirt(String size,String color,double price){

        this.size = size;
        this.color = color;
        this.price = price;
    }

    public double shirtDiscount(){

       if(size == "S"){
         discount_percentage = 5;
         discount_price = price * (discount_percentage/100);  
       }
       else if(size == "M"){
        discount_percentage = 7;
        discount_price = price * (discount_percentage/100);
       }
       else if(size == "L"){
        discount_percentage = 10;
        discount_price = price * (discount_percentage/100);
       }
       else if(size == "XL"){
        discount_percentage = 13;
        discount_price = price * (discount_percentage/100);
       }
       return price ;

    } 
    
    public void shirtInfo(){
        System.out.println("Shirt :");
        System.out.println("Size : "+size);
        System.out.println("Color : "+color);
        System.out.println("Discount price : "+discount_price);
        System.out.println("Final price : "+(price-discount_price));
    }

    public static void main(String[] args) {
        
        Shirt s1 = new Shirt("M", "red", 500);
        System.out.println(s1.shirtDiscount());
        s1.shirtInfo();
        System.out.println();
        Shirt s2 = new Shirt("XL", "white", 800);
        System.out.println(s2.shirtDiscount());
        s2.shirtInfo();
    }
}
