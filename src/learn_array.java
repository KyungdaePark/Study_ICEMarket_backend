import java.util.ArrayList;
import java.util.Arrays;

public class learn_array {
    public static void main(String[] args){

        // 배열 만들기
        String[] arr1 = {"1","2","3","4","5"};
        System.out.println(arr1[2]);

        // 리스트 만들기
        ArrayList arr2 = new ArrayList();
        for(int i=1;i<=5;i++){
            arr2.add(i);
        }


        // 리스트:제네릭스 (J2SE 5.0 이후)
        // ArrayList<int> arr3 = new ArrayList<int>();
        ArrayList<String> arr3 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            arr3.add((Integer.toString(i)));
        }

        // 배열을 리스트에 넣기
        ArrayList<String> arr4 = new ArrayList<>(Arrays.asList(arr1));

        for(int i=0;i<5;i++){
            System.out.println(arr1[i]);
            System.out.println(arr2.get(i)); //리스트의 값을 참조할때는 get메서드를 이용해야 한다.
            System.out.println(arr3.get(i));
            System.out.println(arr4.get(i));
        }
    }
}
