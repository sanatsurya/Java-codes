package BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReaderExmpl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //for input
//        System.out.print("Enter your character: ");
//        char ch = (char) br.read();
//        //output
//        System.out.print("You entered : ");
//        System.out.println(ch);
//        System.out.print("Enter your Name: ");
//        String name = br.readLine();
//        System.out.println("Name:"+name);
//        System.out.print("Enter your age: ");
//        int age = Integer.parseInt(br.readLine());
//        System.out.print("Your age: "+age);
//        System.out.print("Enter your temperature: ");
//         float temp = Float.parseFloat(br.readLine());
//        System.out.print("Your temperature is: "+temp);
        System.out.print("Enter your text: ");
           String text = br.readLine();
        StringTokenizer st = new StringTokenizer(text,"+");
        String s4 = st.nextToken().replace("satya","bishnu");
        System.out.println(s4);
//        String s3 = String.valueOf(st.countTokens());
        String s1 = st.nextToken();
//        String s2 = st.nextToken();
//        String s5 = st.nextToken();
//        String s6 = st.nextToken();
//        String s7 = st.nextToken();
//        System.out.println(s3);
        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s5);
//        System.out.println(s6);
//        System.out.println(s7);
//        String s4 = String.valueOf(st.hasMoreElements());
//        System.out.println(s4);



    }
}
