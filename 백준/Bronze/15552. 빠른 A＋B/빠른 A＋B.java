import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            int T = Integer.parseInt(br.readLine());


            for (int i = 0; i < T; i++) {
                String[] inputs = br.readLine().split(" ");

                int A = Integer.parseInt(inputs[0]);
                int B = Integer.parseInt(inputs[1]);

                bw.write((A + B)+"\n");
            }

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
