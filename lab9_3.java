//Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void.
interface Playable{
    void play();
}
//Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports.
class Football implements Playable{
    public void play(){
        System.out.println("Playing Football");
    }
}
class Volleyball implements Playable{
    public void play(){
        System.out.println("Playing Vollyball");
    }
}
class Basketball implements Playable{
    public void play(){
        System.out.println("Playing Basketball");
    }
}
public class lab9_3 {
    public static void main(String[] args) {
        Football fb= new Football();
        Volleyball vb= new Volleyball();
        Basketball bb= new Basketball();

        fb.play();
        vb.play();
        bb.play();
    }
}
