package CarRace;

/**
 *
 * @author Malek Mohamed
 */
import CarRace.Maps;
import CarRace.Levels;
import com.sun.opengl.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.media.opengl.*;
import javax.swing.*;

/**
 *
 * @author Malek Mohamed
 */
public class Levels extends JFrame implements ActionListener {

    public JButton easy;
    public JButton medium;
    public JButton hard;
    public JButton back;
    public JLabel jLabel1;
    public JLabel jLabel2;
    public JPanel jPanel1;

    public GLCanvas glcanvas;
    public Animator animator;

    public boolean flagEasyButton;
    public boolean flagMediumButton;
    public boolean flagHardButton;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Levels();
    }

    public Levels() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
        setSize(900, 900);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        easy = new JButton();
        medium = new JButton();
        hard = new JButton();
        back = new JButton();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();

        flagEasyButton = false;
        flagMediumButton = false;
        flagHardButton = false;

        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new Color(0, 0, 0));
        jLabel1.setFont(new Font("Yu Gothic UI Semilight", 3, 48));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Levels");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 50, 600, 64);

        easy.setFont(new Font("Yu Gothic UI Semilight", 3, 24));
        easy.setText("Easy");
        easy.addActionListener(this::easyActionPerformed);
        jPanel1.add(easy);
        easy.setBounds(320, 190, 254, 48);

        medium.setFont(new Font("Yu Gothic UI Semilight", 3, 24));
        medium.setText("Medium");
        medium.addActionListener(this::mediumActionPerformed);
        jPanel1.add(medium);
        medium.setBounds(320, 320, 254, 48);

        hard.setFont(new Font("Yu Gothic UI Semilight", 3, 24));
        hard.setText("Hard");
        hard.addActionListener(this::hardActionPerformed);
        jPanel1.add(hard);
        hard.setBounds(320, 460, 254, 48);

        back.setFont(new Font("Yu Gothic UI Semilight", 3, 18));
        back.setText("Back");
        back.addActionListener(this::backAction);
        jPanel1.add(back);
        back.setBounds(30, 623, 80, 30);

        //jLabel2.setIcon(new ImageIcon(getClass().getResource("/project/pngtree-vector-car-race-png-image_3170136.jpg")));
        jLabel2.setText("Put background here");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 900);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 900);
    }

    private void easyActionPerformed(ActionEvent evt) {
        flagEasyButton = true;
        //Add the easy game here
        MainMenu menu = new MainMenu();
        Maps maps = new Maps();
        Levels levels = new Levels();

        if (menu.onePlayer.isEnabled() == true && maps.mapOne.isEnabled() == true && levels.easy.isEnabled() == true) {
            setVisible(false);
            new SEM1();
        }

        if (menu.onePlayer.isEnabled() == true && maps.mapTwo.isEnabled() == true && levels.easy.isEnabled() == true) {
            setVisible(false);
            new SEM2();
        }

        if (menu.onePlayer.isEnabled() == true && maps.mapThree.isEnabled() == true && levels.easy.isEnabled() == true) {
            setVisible(false);
            new SEM3();
        }

        if (menu.twoPlayers.isEnabled() == true && maps.mapOne.isEnabled() == true && levels.easy.isEnabled() == true) {
            setVisible(false);
            new MEM1();
        }

        if (menu.twoPlayers.isEnabled() == true && maps.mapTwo.isEnabled() == true && levels.easy.isEnabled() == true) {
            setVisible(false);
            new MEM2();
        }

        if (menu.twoPlayers.isEnabled() == true && maps.mapThree.isEnabled() == true && levels.easy.isEnabled() == true) {
            setVisible(false);
            new MEM3();
        }
    }

    private void mediumActionPerformed(ActionEvent evt) {
        //easy.isEnabled();
        flagMediumButton = true;
        //Add the medium game here
        MainMenu menu = new MainMenu();
        Maps maps = new Maps();
        Levels levels = new Levels();

        if (menu.onePlayer.isEnabled() == true && maps.mapOne.isEnabled() == true && levels.medium.isEnabled() == true) {
            setVisible(false);
            new SMM1();
        }

        if (menu.onePlayer.isEnabled() == true && maps.mapTwo.isEnabled() == true && levels.medium.isEnabled() == true) {
            setVisible(false);
            new SMM2();
        }

        if (menu.onePlayer.isEnabled() == true && maps.mapThree.isEnabled() == true && levels.medium.isEnabled() == true) {
            setVisible(false);
            new SEM3();
        }

        if (menu.onePlayer.isEnabled() == true && maps.mapThree.isEnabled() == true && levels.medium.isEnabled() == true) {
            setVisible(false);
            new SEM2();
        }

        if (menu.twoPlayers.isEnabled() == true && maps.mapOne.isEnabled() == true && levels.medium.isEnabled() == true) {
            setVisible(false);
            new MMM1();
        }

        if (menu.twoPlayers.isEnabled() == true && maps.mapTwo.isEnabled() == true && levels.medium.isEnabled() == true) {
            setVisible(false);
            new MMM2();
        }

        if (menu.twoPlayers.isEnabled() == true && maps.mapThree.isEnabled() == true && levels.medium.isEnabled() == true) {
            setVisible(false);
            new MMM3();
        }
    }

    private void hardActionPerformed(ActionEvent evt) {
        flagHardButton = true;
        //Add the hard game here
        MainMenu menu = new MainMenu();
        Maps maps = new Maps();
        Levels levels = new Levels();

        if (menu.onePlayer.isEnabled() == true && maps.mapOne.isEnabled() == true && levels.hard.isEnabled() == true) {
            setVisible(false);
            new SHM1();
        }

        if (menu.onePlayer.isEnabled() == true && maps.mapTwo.isEnabled() == true && levels.hard.isEnabled() == true) {
            setVisible(false);
            new SHM2();
        }

        if (menu.onePlayer.isEnabled() == true && maps.mapThree.isEnabled() == true && levels.hard.isEnabled() == true) {
            setVisible(false);
            new SHM3();
        }

        if (menu.twoPlayers.isEnabled() == true && maps.mapOne.isEnabled() == true && levels.hard.isEnabled() == true) {
            setVisible(false);
            new MHM1();
        }

        if (menu.twoPlayers.isEnabled() == true && maps.mapTwo.isEnabled() == true && levels.hard.isEnabled() == true) {
            setVisible(false);
            new MHM2();
        }

        if (menu.twoPlayers.isEnabled() == true && maps.mapThree.isEnabled() == true && levels.hard.isEnabled() == true) {
            setVisible(false);
            new MHM3();
        }
    }

    private void backAction(ActionEvent evt) {
        // Revert Map buttons' flags to false
        setVisible(false);
        new Maps().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
