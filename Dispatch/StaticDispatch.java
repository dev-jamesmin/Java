public class StaticDispatch{

    public void run(){
        System.out.println("run");
    }

    public static void main(String[] args) {
        new StaticDispatch().run();
    }

}