
package Mummel;

    public class Animal implements AnimalInerface{
    private boolean suckMilk = true;
    public static int mummelsPopulation = 0;
    
    
    public Animal(boolean suckMilk){
        this.suckMilk = suckMilk;
        mummelsPopulation+=1;
    }
            
    public String introduceYourself(){
        return "I suck milk: " + suckMilk+";";
        
}
    public int getMummelsPopulation(){
        return mummelsPopulation;
    }
}