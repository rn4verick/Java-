package Assessment2;

import javax.swing.*;
import java.util.List;

public class Leaderboard extends JFrame {

    public Leaderboard() {
        setTitle("Top Players");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        List<User> topList = DBManager.getTopPlayers();

        DefaultListModel<String> model = new DefaultListModel<>();
        int rank = 1;
        for (User u : topList) {
            model.addElement(rank + ". " + u.getUsername() + " - " + u.getScore());
            rank++;
        }

        JList<String> list = new JList<>(model);
        JScrollPane scroll = new JScrollPane(list);

        add(scroll);
        setVisible(true);
    }
}