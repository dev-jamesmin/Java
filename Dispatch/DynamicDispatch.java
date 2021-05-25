public class DynamicDispatch{

    static abstract class Service{
        abstract void run();
    }

    static class ServiceTest extends Service{
        @Override
        void run() {
            System.out.println("ServiceTest run");
        }
    }

    public static void main(String[] args) {
        Service svc = new ServiceTest();
        svc.run();
    }

}