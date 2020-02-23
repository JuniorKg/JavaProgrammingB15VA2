package day51_abstraction.student;

public class CampusStudent extends Student {


    @Override
    public void attendClass() {
        System.out.println("CampusStudent is attending a class in Campus");
    }

    public void playPingPong(){
        System.out.println("CampusStudent is playing ping pong");
    }
}
