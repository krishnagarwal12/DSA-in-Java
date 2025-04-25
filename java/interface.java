public class oops{
    public static void main(String args[]) {
        
    }
}
interface herbivore{
    void eats();
}
interface carnivore{
    void eats();
}
class bear implements herbivore,carnivore{
    void eats() {
        System.out.println("Eats grass");
    }
}