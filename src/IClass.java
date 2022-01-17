public interface IClass {
    default void Show(){
        System.out.println("Show method in I Interface!!");
    }
    default void I(){
        System.out.println("this is I Interface!!");
    }
}

class AClass{
    public void Show(){
        System.out.println("Show method in AClass!!");
    }
    public void AMethod(){
        System.out.println("this is AClass!!");
    }
}

class BClass extends  AClass implements IClass{
    public void Show(){
        System.out.println("Iclass method implemented in BClass");
    }
    public void BMethod(){
        System.out.println("this is BClass!!");
    }
}

class MainOne {
    public static void main(String[] args){
        BClass BObj = new BClass();
        BObj.BMethod();
        BObj.Show();
        BObj.AMethod();
        BObj.I();
    }
}
