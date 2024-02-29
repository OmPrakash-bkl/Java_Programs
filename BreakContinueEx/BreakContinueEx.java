
public class BreakContinueEx {
    public static void main(String[] args)     {
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                break;
            }
            System.out.println("Iteration: " + i);
        }

        for(int j = 1; j <= 5; j++) {
            if(j == 2 || j == 4) {
                continue;
            }
            System.out.println("Iteration: "+j);
        }
    }

    
}
