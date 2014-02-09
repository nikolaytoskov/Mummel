
package Mummel;

 public class Lion extends Animal {
    private String sex;
 
    public Lion(String sex) {
        super(true); 
        this.sex = sex;
    }
 
    public String getSex() {
        return sex;
    }
 
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public String introduceYourself(){
       String text;
       text = super.introduceYourself();
        return text + " I am a Lion! My sex is: " + sex;        
}
}

