import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class r22 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("")) {
                break;
            }
            String arr[] = s.split(" ");
            ArrayList<String> parts = new ArrayList();
            parts.addAll(Arrays.asList(arr));
            boolean go = true;
            while (go) {
                go = false;
                for (int i = parts.size() - 1; i >= 2; i--) {
                    try {
                        int a = Integer.parseInt(parts.get(i) + "");
                        int b = Integer.parseInt(parts.get(i - 1) + "");
                        int c;
                        String ss = parts.get(i - 2);
                        if (ss.equals("+")) {
                            c = b + a;
                        } else if (ss.equals("-")) {
                            c = b - a;
                        } else if (ss.equals("*")) {
                            c = b * a;
                        } else {
                            continue;
                        }
                        parts.set(i - 2, c + "");
                        parts.remove(i - 1);
                        parts.remove(i - 1);
                        go = true;
                    } catch (Exception ex) {
                    }
                }
            }
            String res = "";
            for (int i = 0; i < parts.size(); i++) {
                res += parts.get(i);
                if (i != parts.size() - 1) {
                    res += " ";
                }
            }
            System.out.printf("Case %d: %s\n", cnt, res);
            cnt++;
        }
    }
}
