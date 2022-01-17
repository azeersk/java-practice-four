public interface newInter {
    void ShowOf(int a);
}

//class SecondClass implements newInter{
//    public void ShowOf(){
//        System.out.println("SecondMethod Implemented the Show of Method!!");
//    }
//}


class MainImplement{
    public static void main(String[] args){
        newInter objOf;
        //objOf = ()->System.out.println("this Show of method in Lambda!!");
        objOf = new newInter(){
                public void ShowOf(int a){
            System.out.println("lambda in newInter method!! " + a);
        }
        };
        objOf.ShowOf(5);
        System.out.println("Successfully executed!!");

    }
}
