
package Mummel;

    public class Zoo {
        private Animal animal;
    
    public Zoo(Animal animal){
        this.animal = animal;
    }
    
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public Animal getAnimal(){
        return animal;
    }
    
    public void showAnimal(){
        System.out.println(animal.introduceYourself());
    }
}
