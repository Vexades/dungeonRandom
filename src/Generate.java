import java.util.Random;

public class Generate {
    public void generateDungeon (int row, int col){
        Random rand = new Random();
        int[][] dungeon= new int[row][col];
        if(row < 5 || col < 5 ){
            System.out.println("Dungeon is too small!!");
        }else {
            for (int i = 0; i < dungeon.length; i++) {
                for (int j = 0; j < dungeon[i].length; j++) {
                    dungeon[i][j] = 0;
                }
            }

            int getRandomPositionR = rand.nextInt((row-2)+1)+2;
            int getRandomPositionC = rand.nextInt((col-2)+1)+2;
            int temp = 0;
            temp = getRandomPositionC;
            dungeon = scaffold(dungeon);
            for (int i = 0; i < dungeon[getRandomPositionC].length; i++) {

                if(!(temp==0)){
                    dungeon[getRandomPositionR][i] = 1;
                    temp--;
                }else{
                    dungeon[getRandomPositionR-1][getRandomPositionC] = 1;
                }
            }
            for (int[] x : dungeon)
            {
                for (int y : x)
                {
                    System.out.print(y + " ");
                }
                System.out.println();
            }


        }
    }


    private int[][] scaffold(int[][] scaffold){
        for (int i = 0; i< scaffold.length;i++){
            for (int j = 0; j < scaffold[i].length; j++) {
                scaffold[i][j] = 0;
            }
        }
        return scaffold;
    }
}
