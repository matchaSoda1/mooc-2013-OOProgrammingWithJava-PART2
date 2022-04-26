package noticeboard;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        NoticeBoard nb = new NoticeBoard();
        SwingUtilities.invokeLater(nb);
    }
}
