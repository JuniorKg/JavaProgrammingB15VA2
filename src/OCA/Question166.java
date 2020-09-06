package OCA;

import java.io.IOException;

public class Question166 {
    public String name;
    public int moons;

    public Question166(String name, int moons){
        this.name = name;
        this.moons = moons;
    }


    public static void main(String[] args) {
        Question166 [] planets = {
                new Question166("Mercury",0),
                new Question166("Venus",0),
                new Question166("Earth",1),
                new Question166("Mars",2)
        };

        System.out.println(planets);
        System.out.println(planets.length);
        System.out.println(planets[2].name);
        System.out.println(planets[2].moons);
    }

    public void main(String fileName) throws IOException{

    }
}

