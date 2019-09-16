package thirdTask;

public class ThirdTask {

    public static void main(String[] args) {

        IncrementSynchronize is = new IncrementSynchronize();

        Thread th1 = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    is.getNextValueBlockSync();
                    System.out.println(is.getValue());
                }
            }
        };

        Thread th2 = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    is.getNextValueSync();
                    System.out.println(is.getValue());
                }
            }
        };


        th1.run();

        th2.run();


    }
}
