public class reverseonlyletters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        String res = revletters(s);
        System.out.println(res);
    }

    public static String revletters(String s) {
        char[] reverse = s.toCharArray();
        char temp;

        // ascii range uppercase : 65-90 and lowercase : 97-122

        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (Character.isLetter(reverse[l]) && Character.isLetter(reverse[r])) {
                temp = reverse[l];
                reverse[l] = reverse[r];
                reverse[r] = temp;

            } else if (!Character.isLetter(reverse[l])) {
                l++;
                continue;
            } else if (!Character.isLetter(reverse[r])) {
                r--;
                continue;
            }
            l++;
            r--;

        }
        return new String(reverse);
    }
}
