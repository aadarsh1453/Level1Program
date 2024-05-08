public class Phone {
    
    String make;
    String model;
    int storage;

    public Phone(String make,String model,int  storage){

        this.make = make;
        this.model = model;
        this.storage = storage;

    }

    public double calculatePrice(){
        double base_price = 7000;
        double base_storage_price = 400 * storage;
        double make_model_price = 0.0;

        if(make.equalsIgnoreCase("Apple") && make.equalsIgnoreCase("iPhone")){
            make_model_price = 45000;
        }
        else if(make.equalsIgnoreCase("Samsung") && make.equalsIgnoreCase("Galexy")){
            make_model_price = 20000;
        }
        else if(make.equalsIgnoreCase("MI") && make.equalsIgnoreCase("Xiomi")){
            make_model_price = 12000;
        }

        return (base_price + base_storage_price + make_model_price);
    }

    public void printPhoneInfo(){

        System.out.println("Phone model is : "+model);
        System.out.println("Phone Make is : "+make);
        System.out.println("Phone Storage Capacity is : "+storage);
    }

    public static void main(String[] args) {
        
        Phone p1 = new Phone("Apple", "15", 128);
        p1.printPhoneInfo();
        System.out.println("Price of Phone :"+p1.calculatePrice());
        System.out.println();
        Phone p2 = new Phone("Samsung", "s24 ultra", 256);
        p2.printPhoneInfo();
        System.out.println("Price of Phone :"+p2.calculatePrice());
    }
}
