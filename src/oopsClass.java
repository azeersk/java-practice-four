class parentClass{
    public static void rules(){
        System.out.println("rule one!!");
        System.out.println("rule two!!");
    }

    public static void activities(){
        System.out.println("activity one!!");
        System.out.println("activity two!!");
    }
}

class childClass extends parentClass{
    public static void ChildRules(){
        System.out.println("child rule one!!");
        System.out.println("child rule two!!");
    }

    public static void childActivities(){
        System.out.println("child activity one!!");
        System.out.println("child activity two!!");
    }
}

class chChildClass extends parentClass{
    public void childActivities(){
        System.out.println("chChildActivities!!!");
    }
    public void ChildRules(){
        System.out.println("chChildRules!!!");
    }
}

public class oopsClass {
    public static void main(String[] args){
       childClass childObj = new childClass();
       childObj.ChildRules();
       childObj.childActivities();
       System.out.println();
       childObj.rules();
       childObj.activities();
       System.out.println();
       chChildClass obj = new chChildClass();
       obj.ChildRules();
       obj.childActivities();
    }
}
