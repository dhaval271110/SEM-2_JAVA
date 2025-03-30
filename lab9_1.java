//Create interface EventListener with performEvent() method.
interface EventListener{
    void performEvent();
}
//Create MouseListener interface which inherits EventListener along with mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), mouseDragged() methods.
interface MouseListener extends EventListener{
    void mouseClicked();
    void mouseDragged();
    void mouseMoved();
    void mousePressed();
    void mouseReleased();
}
//Also create KeyListener interface which inherits EventListener along with keyPressed(), keyReleased() methods.
interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}
//WAP to create EventDemo class which implements MouseListener and KeyListener and demonstrate all the methods of the interfaces. 
class EventDemo implements EventListener{
    public void performEvent(){
        System.out.println("Method called successfully");
    }
    public void mouseClicked(){
        System.out.println("Method called successfully");
    }
    public void mouseDragged(){
        System.out.println("Method called successfully");
    }
    public void mouseMoved(){
        System.out.println("Method called successfully");
    }
    public void mouseReleased(){
        System.out.println("Method called successfully");
    }
    public void mousePressed(){
        System.out.println("Method called successfully");
    }
    public void keyPressed(){
        System.out.println("Method called successfully");
    }
    public void keyReleased(){
        System.out.println("Method called successfully");
    }
}
public class lab9_1{
    public static void main(String[] args){
        EventDemo ed=new EventDemo();
        ed.performEvent();
        ed.mouseClicked();
        ed.mouseDragged();
        ed.mouseMoved();
        ed.mousePressed();
        ed.mouseReleased();
        ed.keyPressed();
        ed.keyReleased();
    }
}