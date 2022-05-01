public class GuGu {
    public void dan(int n) {
        for(int i=3;i<10;i++){
            System.out.println(n*i);
        }
    }


    public static void main(String[] args){
        int n;

        // dan메소드를 사용해보자
        GuGu gugu = new GuGu();
        gugu.dan(3);

        /*
            public void dan에서 public static void dan()으로 함수를 만들면
            dan 메소드를 사용할때 위처럼 객체를 만들지 않고
            바로 dan(n); 으로 사용 가능하다.
            static 키워드는 프로그램에서 그 변수를 위한 메모리를 한 번만 할당하기 때문.
         */

    }
}
