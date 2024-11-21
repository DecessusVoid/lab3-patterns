public class Singleton {
    private static Singleton inctance;
    private Singleton()
    {
        //constructor if needed
    }
    public static Singleton GetInctance (){
        if (inctance == null )
        {
            inctance= new Singleton();    
        }
        return inctance;
    }
    public void Some_Method()
    {
        // realization
    }
}
