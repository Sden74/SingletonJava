public class Singleton {
    private static Singleton sSingleton;
    public static Singleton getInstance(){
        if(sSingleton==null){
            sSingleton = new Singleton();
        }
        return sSingleton;
    }
    private Singleton(){
        //no one can call this outside
        System.out.println("constructor called");
    }
}
