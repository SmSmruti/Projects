
class Parents {
     void display () {
        System.out.println("I am Parent");
    }
}
class Child extends Parents {
     void display () {
        System.out.println("I am Child");
    }
}
public class RunTimePolymerphysm {

    public static void main(String[] args) {
        

        Parents obj = new Child();
        obj.display();
    }

}