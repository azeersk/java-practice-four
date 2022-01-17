import java.lang.reflect.Method;

public interface interfaceClass {
    static void MainOf(){
        System.out.println("inter face method!!");
    }
    abstract void MethodOf();
}

class Main implements interfaceClass{

    public void MethodOf(){
        System.out.println("parent method implemented by Main Class!!");
    }
    public static void main(String[] args){
        interfaceClass.MainOf();
        Main obj = new Main();
        System.out.println();
        obj.MethodOf();
    }
}