package day41_encapsulation;

public class Elevator {

    /*
    CurrentFloor;
    G 1,2,3,4,5,6
    Method:
    gotoFloor(newFloor)
       test if within range

       CurrentFloor -> 2
       newFloor -> 5

    Going up to floor 3
    Going up to floor 4
    Going up to floor 5

        CurrentFloor -> 3
       newFloor -> 0
    Going down to floor 2
    Going down to floor 1
    Going down to floor 0


        CurrentFloor -> 3
       newFloor -> 3
       you are already on 3 floor
     */

    private int currentFloor;

    public void goToFloor(int newFloor) {
        if (newFloor < 0 || newFloor > 6) {
            System.out.println("ERROR: Wrong floor selected: " + newFloor);
            return; //exit method
        }
        if (newFloor > currentFloor) {
            for (int i = currentFloor + 1; i <= newFloor; i++) {
                System.out.println("Going up to floor " + i);
            }
        } else if (newFloor < currentFloor){
            for (int i = currentFloor-1; i > newFloor ; i--) {
                System.out.println("Going down to floor " + i);
            }
    } else {
            System.out.println("WARNING: You are already on floor " +newFloor);
        }

        currentFloor = newFloor;
    }




}
