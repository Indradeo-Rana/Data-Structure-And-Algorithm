import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String word =br.readLine();
        System.out.println(word);
        int num=Integer.parseInt(br.readLine());
        System.out.println(num);
    }
}
