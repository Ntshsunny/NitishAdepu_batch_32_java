package week1;

class person{
    public void walk(){
        System.out.println("this is non parameterized walk()");
    }
    public void walk(int a){
        System.out.println("this is parameterized walk() with value" +a);
    }
    public void walk(int a, int b){
        System.out.println("this is parameterized walk() with value" +a);
    }
}
class man extends person{
    @Override
    public void walk() {
        super.walk();
        System.out.println("this is non parameterized using man class");
    }
}
public class polymorphism {
    public static void main(String args[]){
        person p = new person();
        man m = new man();
        m.walk();

    }
}
