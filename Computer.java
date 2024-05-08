
public class Computer {
    
    String processor;
    int ram;
    int storage;

    public Computer(String processor,int ram,int storage){

        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public double calculateComputerPrice(){
        double processor_price = 0;
        if(processor == "i3"){
            processor_price = 10000;
        }
        else if(processor == "i5"){
            processor_price = 17000;
        }
        else if(processor == "i7"){
            processor_price = 25000;
        }
        
        double ram_price = 0;
        if(ram == 8){
            ram_price = 3500;
        }
        if(ram == 16){
            ram_price = 7000;
        }
        if(ram == 32){
            ram_price = 13000;
        }

        double storage_price = 0;
        if(storage == 128){
            storage_price = 2000;
        }
        else if(storage == 256){
            storage_price = 4000;
        }
        else if(storage == 512){
            storage_price = 6000;
        }
        else if(storage == 1024){
            storage_price = 12000;
        }

        return processor_price + ram_price + storage_price;
    }

    public void printComputerInfo(){
        System.out.println("Computer Specifications");
        System.out.println("Processor : "+processor);
        System.out.println("RAM : "+ram);
        System.out.println("Storage : "+storage);
    }

    public static void main(String[] args) {
        
        Computer c1 = new Computer("i3", 16, 512);
        c1.printComputerInfo();
        System.out.println(c1.calculateComputerPrice());

        Computer c2 = new Computer("i7", 32, 1024);
        c2.printComputerInfo();
        System.out.println(c2.calculateComputerPrice());
    }
}
