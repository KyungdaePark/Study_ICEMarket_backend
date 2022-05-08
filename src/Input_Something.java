import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Input_Something {
    public static void main(String[] args) throws IOException{
//        InputStream in = System.in;
//
//        int a;
//        a = in.read(); // read only 1 byte
//
//        System.out.println(a);
//
//        InputStream in2 = System.in;
//        byte[] b = new byte[3];
//        in2.read(b); //배열로 읽을때는 byte배열을 read메소드에 매개함.
//
//        System.out.println(b[0]);
//        System.out.println(b[1]);
//        System.out.println(b[2]);

//        InputStream in3 = System.in;
//        InputStreamReader reader = new InputStreamReader(in3); //byte 대신 문자로 입력 스트림을 읽음
//        char[] c = new char[3];
//        reader.read(c);
//        System.out.println(c);

//        InputStream in4 = System.in;
//        InputStreamReader reader = new InputStreamReader(in4);
//        BufferedReader br  = new BufferedReader(reader);
//
//        String d = br.readLine();
//        System.out.println(d);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());

    }
}
