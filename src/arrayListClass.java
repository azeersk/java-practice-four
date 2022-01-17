import java.util.ArrayList;

public class arrayListClass {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(34);
        arrayList.add(54);
        arrayList.add(23);
        arrayList.add(78);
        arrayList.add(89);
        arrayList.add(68);
        System.out.println(arrayList);
        for(int i : arrayList){
            System.out.print(i+" ");
        }
        System.out.println();
        arrayList.forEach(i -> System.out.print(i+"_ ")); //consumer object
    }
}
