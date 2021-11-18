public class Test {
    public static void main(String[] args) {
        Thread obj = Thread.currentThread();
        obj.setName("Aniruddha");
        //checked exception
//        System.out.println(10/0);

        System.out.println(obj.isAlive());
        System.out.println(obj.getName());
        System.out.println(obj.isDaemon());//low priority threads are daemon threads
        System.out.println(obj.getPriority());
        obj.setPriority(/* always specify type of priority MIN,MAX,..*/Thread.MAX_PRIORITY);
        System.out.println(obj.getId());
        System.out.println(obj.getState());
        System.out.println(obj.getStackTrace());
        System.out.println(obj.getThreadGroup());
        System.out.println(obj.getUncaughtExceptionHandler());
    }
}
