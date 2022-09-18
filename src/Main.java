public class Main {

    public static void main(String[] args) {
        addFunction(10, 20, 30);
        Coche miCoche = new Coche();
        miCoche.addDoor();
        System.out.println("Total Doors " + miCoche.doors);
    }

    public static void addFunction(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Result " + result);
    }
}
class Coche{
    public int doors = 4;

    public void addDoor(){
        this.doors++;
    }
}
