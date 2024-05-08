public class Dog {

    String breed;
    int age;
    double weight;
    int humanAge;
    
    public Dog(String breed,int age,double weight){

        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int ageHumanYears() {
        if(this.age>=2){
            humanAge = age * 11;
        }
        else{
             humanAge = 22 + (age-2)*5;
        }
        return humanAge;
    }

    public void printDogInfo(){
        System.out.println("Dog breed : "+ breed);
        System.out.println("Dog age : "+age+ " \nHuman years :"+ageHumanYears());
        System.out.println("Dog weight : "+weight);
    }

    public static void main(String[] args) {
        
        Dog d1 = new Dog("Akita", 2, 25);
        Dog d2 = new Dog("Afghan Hound", 7, 52);
        d1.ageHumanYears();
        d1.printDogInfo();
        d2.ageHumanYears();
        d2.printDogInfo();
    }
}
