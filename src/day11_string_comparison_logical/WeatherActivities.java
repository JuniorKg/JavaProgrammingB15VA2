package day11_string_comparison_logical;

public class WeatherActivities {
    public static void main(String[] args) {
        String weather = "sunny";

        switch (weather){
            case "sunny":
                System.out.println("Go to park");
                System.out.println("Code Java");
            break;
            case "hot":
                System.out.println("Go swimming");
                System.out.println("Code Java");
            break;

            case "windy":
                System.out.println("Fly a kite");
                System.out.println("Code Java");
             break;

            case "snowy":
                System.out.println("Build a snowman");
                System.out.println("Code Java");
            break;

            case "rainy":
                System.out.println("Stay home");
                System.out.println("Code Java");
            default:
                System.out.println("Keep coding Java in any weather");


        }

    }
}
