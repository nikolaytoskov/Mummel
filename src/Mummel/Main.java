
package Mummel;

public class Main {
    public static void main(String[] args) {
       
        Animal cattle = new Animal(true);
       
        System.out.println(cattle.introduceYourself());
        
        Lion lion = new Lion("female");
        System.out.println(lion.introduceYourself());
        
        Animal newlion = new Lion("male");
        System.out.println(newlion.introduceYourself());
        
        System.out.println("Нашите млекопитаещи са: " + cattle.getMummelsPopulation());
    }
}
