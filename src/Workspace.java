import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Workspace extends JFrame {

    private JTabbedPane tabbedPane1;
    private JPanel workspaceContent;
    private JPanel tab1;
    private JPanel tab2;
    private JPanel tab3;
    private JPanel tab4;
    private JPanel tab5;
    private JPanel tab7;
    private JPanel adminPanelInfo;
    private JLabel workspaceTitle;
    private JLabel desc1;
    private JLabel desc2;
    private JLabel desc3;
    private JTable table1;
    private JButton button1;
    private JTable table2;
    private JButton button2;
    private JTable table3;
    private JButton button3;
    private JTable table4;
    private JButton button4;
    private JTable table5;
    private JButton button5;
    private JTable table6;
    private JButton button6;
    private JScrollPane scroll1;
    private JScrollPane scroll2;
    private JScrollPane scroll3;
    private JScrollPane scroll7;
    private JScrollPane scroll4;
    private JScrollPane scroll5;

    public Workspace(){
        initStyles();
        setTitle("Panela de admin");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.DARK_GRAY);
        setContentPane(workspaceContent);
    }

    public void initStyles(){
        workspaceContent.setBackground(Color.DARK_GRAY);
        tabbedPane1.setFont(new Font("Arial", Font.BOLD, 14));
        tabbedPane1.setBorder(BorderFactory.createEmptyBorder());
        tab1.setBackground(Color.darkGray);
        tab1.setForeground(Color.WHITE);
        tab2.setBackground(Color.darkGray);
        tab2.setForeground(Color.WHITE);
        tab3.setBackground(Color.darkGray);
        tab3.setForeground(Color.WHITE);
        tab4.setBackground(Color.darkGray);
        tab4.setForeground(Color.WHITE);
        tab5.setBackground(Color.darkGray);
        tab5.setForeground(Color.WHITE);
        tab7.setBackground(Color.darkGray);
        tab7.setForeground(Color.WHITE);
        tabbedPane1.setSize(new Dimension(50, 25));
        tabbedPane1.setBorder(BorderFactory.createEmptyBorder());
        adminPanelInfo.setBackground(Color.darkGray);
        adminPanelInfo.setForeground(Color.WHITE);
        workspaceTitle.setFont(new Font("Montserrat", 600, 24));
        workspaceTitle.setForeground(Color.WHITE);
        adminPanelInfo.setForeground(Color.WHITE);
        desc1.setForeground(Color.WHITE);
        desc2.setForeground(Color.WHITE);
        desc3.setForeground(Color.WHITE);
        table1.setBackground(Color.DARK_GRAY);
        scroll5.setBackground(Color.DARK_GRAY);
    }

    public static void main(String[] args){
        new Workspace();
    }
}
