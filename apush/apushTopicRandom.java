import java.util.Random;
public class apushTopicRandom
{
    public static void main() {
        System.out.println();
        
        Random rand = new Random();
        int unit = rand.nextInt(9); 
        
        int[] p1 = new int[7];
        int[] p2 = new int[8];
        int[] p3 = new int[13];
        int[] p4 = new int[14];
        int[] p5 = new int[12];
        int[] p6 = new int[14];
        int[] p7 = new int[15];
        int[] p8 = new int[15];
        int[] p9 = new int[7];

        int[][] unitArr = new int[][] {p1,p2,p3,p4,p5,p6,p7,p8,p9};
        
        int randTopic = rand.nextInt(unitArr[unit].length)+1;
        
        unit++;
        
        System.out.println("Unit: " + unit);
        System.out.println("Topic: " + randTopic);
        
    }
}
