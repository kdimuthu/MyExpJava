package ExceptionsHandling;

public class Exceptions {
    public static void main(String[] args) {

        boolean status=true;
        int NuOfRetry=5;

        for(int i=0;i<NuOfRetry;i++){
            try {
                if (status) {
                    System.out.println("Waited with true " + i);
                    break;
                }
            } catch (Exception e) {
                System.out.println("No Such Element Exception");
            }
            System.out.println("Not Executed");
        }
    }

    }



