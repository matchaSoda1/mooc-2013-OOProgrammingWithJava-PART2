
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(build(t));

    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder("");
        sb.append("{ ");
        String prefix = "";
        for (int i = 0; i < t.length; i++) {
            sb.append(prefix);

            if (i % 4 == 0) {
                sb.append("\n ");
            }

            sb.append(t[i]);
            prefix = ", ";
        }
        sb.append("\n}");

        return sb.toString();
    }
}
