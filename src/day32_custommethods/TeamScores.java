package day32_custommethods;

public class TeamScores {
    public static void main(String[] args) {
            /*
                Warm up task:
                Create a 2D int[] array called teamScores with 4 rows and 5 cols each.
                Assign different numbers in 1-10 range
                Each row represents score that team accumulated.
                Loop through each team scores and
                 find the team-row with highest score and print out details.
                 */

        int[][] teamScores = {
                {1, 5, 6, 9, 2},
                {1, 5, 6, 9, 7},
                {9, 2, 5, 5, 3},
                {2, 9, 9, 8, 5},

        };
        int highestScore = 0;
        int winner = -1;

        for (int team = 0; team < teamScores.length ; team++) {
            int sum = 0;
            for (int score = 0; score < teamScores[team].length;score++){
                sum += teamScores[team][score];
            }
            System.out.println("Team: " + team + " Sum: " + sum);
            if (sum > highestScore){
                highestScore= sum;
                winner = team;
            }
        }
        System.out.println("Winner team : " + winner + " With score: " + highestScore);

    }

}




