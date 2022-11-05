public class DailyCoding1102 {

    public static void main(String[] args) {
        int[][] distance = {{0, 0}, {1, 1}, {1, 5}};
        getDistance(distance);

    }

    public static void getDistance(int[][] distance) {

        int count = 0;

        for (int row = 0; row < distance.length-1; row++) {

            for (int col = 0; col < distance[0].length; col++) {


                    if (Math.abs(distance[row][col] - distance[row + 1][col]) > 1) {

                        count += Math.abs(distance[row + 1][col] - distance[row][col]);

                    }



            }
            count++;

        }

        System.out.println(count - 1);


    }


}
