package synchronize_and_asynchronize;

public class SynchronizedBlock {
    public void printTable(int n){
        synchronized(this){
            for(int i =1 ;i<=5; i++){
                System.out.println(i*n);
                try{
                    Thread.sleep(800);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
