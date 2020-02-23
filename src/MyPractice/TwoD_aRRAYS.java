package MyPractice;

public class TwoD_aRRAYS {
    public static void main(String[] args) {

        int [][] lotteryTicket = {{21, 12, 13, 21},
                {10, 12, 14, 15},
                {45,67,43,87,12},
                {67,44,34,76,23},
        };

        for (int i = 0; i < lotteryTicket.length ; i++) {
            for (int j = 0; j < lotteryTicket.length ; j++) {
                System.out.print(lotteryTicket[i][j] + ", ");

            }

        }

//        for (int i = 1; i < 3 ; i++) {
//            for (int j = 1; j < 4 ; j++) {
//                System.out.println("i= " + i + ", j= " +j);
//
//            }
//
//        }

        int [][] numberGrid = { {1,2,3}, {4,5,6}, {7,8,9}, {0,6,8}};

        System.out.println(numberGrid[0][0]);

        for (int i = 0; i < numberGrid.length ; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                System.out.print(numberGrid[i][j] + ", ");



            }

        }
    }
}
