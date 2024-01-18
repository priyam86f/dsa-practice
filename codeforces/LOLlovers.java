import java.util.Scanner;

public class LOLlovers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();

        for (int i = 1; i < n; i++) {
            int l1 = 0, o1 = 0, l2 = 0, o2 = 0;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == 'L') {
                    l1++;
                } else {
                    o1++;
                }
            }

            for (int j = i; j < n; j++) {
                if (s.charAt(j) == 'L') {
                    l2++;
                } else {
                    o2++;
                }
            }

            if (l1 != l2 && o1 != o2) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }

    
}