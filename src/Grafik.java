import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Grafik {
    public static void main ( String [] args ) {
        JFrame frame = new JFrame();
        frame.setTitle("Thoriq, Fajri, Yunika");
        frame.setSize(650, 365);
        frame.setLayout(null);
        
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni"};
        
        /* Start Judul Diatas */
        // Start Penjualan
        JLabel titlePenjualan = new JLabel();
        titlePenjualan.setBounds(20, 25, 200, 15);
        titlePenjualan.setText("Data Penjualan 6 Bulan");
        // End Penjualan
        // Start Tombol
        JLabel titleMode = new JLabel();
        titleMode.setBounds(542, 25, 200, 15);
        titleMode.setBounds(542, 25, 200, 15);
        titleMode.setText("Mode Grafis");
        // End Tombol
        /* End Judul Diatas */


        /* Data Penjualan 6 Bulan */
        // Start Januari
        JLabel label_Jan = new JLabel();
        label_Jan.setBounds(20, 70, 80, 15);
        label_Jan.setText(namaBulan[0]);
        JTextField tx_Jan = new JTextField();
        tx_Jan.setText("3");
        tx_Jan.setBounds(120, 62, 60, 30);
        // End Januari

        // Start Februari
        JLabel label_Feb = new JLabel();
        label_Feb.setBounds(20, 111, 80, 15);
        label_Feb.setText(namaBulan[1]);
        JTextField tx_Feb = new JTextField();
        tx_Feb.setText("2");
        tx_Feb.setBounds(120, 103, 60, 30);
        // End Februari

        // Start Maret
        JLabel label_Mar = new JLabel();
        label_Mar.setBounds(20, 151, 80, 15);
        label_Mar.setText(namaBulan[2]);
        JTextField tx_Mar = new JTextField();
        tx_Mar.setText("7");
        tx_Mar.setBounds(120, 144, 60, 30);
        // End Maret

        // Start April
        JLabel label_Apr = new JLabel();
        label_Apr.setBounds(20, 192, 80, 15);
        label_Apr.setText(namaBulan[3]);
        JTextField tx_Apr = new JTextField();
        tx_Apr.setText("5");
        tx_Apr.setBounds(120, 185, 60, 30);
        // End April

        // Start Mei
        JLabel label_Mei = new JLabel();
        label_Mei.setBounds(20, 233, 80, 15);
        label_Mei.setText(namaBulan[4]);
        JTextField tx_Mei = new JTextField();
        tx_Mei.setText("11");
        tx_Mei.setBounds(120, 226, 60, 30);
        // End Mei

        // Start Juni
        JLabel label_Jun = new JLabel();
        label_Jun.setBounds(20, 274, 80, 15);
        label_Jun.setText(namaBulan[5]);
        JTextField tx_Jun = new JTextField();
        tx_Jun.setText("4");
        tx_Jun.setBounds(120, 267, 60, 30);
        // End Juni
        /* End Data Penjualan 6 Bulan */

        /* Start Tombol-Tombol */
        // Start Tombol Bar
        JButton btn_bar = new JButton();
        btn_bar.setBounds(542, 62, 80, 30);
        btn_bar.setText("Bar");
        btn_bar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // End Tombol Bar
        // Start Tombol Line
        JButton btn_line = new JButton();
        btn_line.setBounds(542, 103, 80, 30);
        btn_line.setText("Line");
        btn_line.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        // End Tombol Line
        // Start Pie
        JButton btn_pie = new JButton();
        btn_pie.setBounds(542, 144, 80, 30);
        btn_pie.setText("Pie");
        btn_pie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // End Pie
        // Start Hapus
        JButton btn_hapus = new JButton();
        btn_hapus.setBounds(542, 267, 80, 30);
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // End Hapus
        /* End Tombol */
        
        // Start Canvas
        Bar kanvas_Bar = new Bar(tx_Jan.getText(), tx_Feb.getText(), tx_Mar.getText(), tx_Apr.getText(), tx_Mei.getText(), tx_Jun.getText());
        // End Canvas
        
        // Start Frame Config
        /* Start Data Penjualan Add Frame */
        frame.add(tx_Jan);
        frame.add(label_Jan);
        frame.add(tx_Feb);
        frame.add(label_Feb);
        frame.add(tx_Mar);
        frame.add(label_Mar);
        frame.add(tx_Apr);
        frame.add(label_Apr);
        frame.add(tx_Mei);
        frame.add(label_Mei);
        frame.add(tx_Jun);
        frame.add(label_Jun);
        /* End Data Penjualan Add Frame */
        
        /* Start Tombol Frame */
        frame.add(btn_bar);
        frame.add(btn_line);
        frame.add(btn_pie);
        frame.add(btn_hapus);
        /* End Tombol Frame */

        frame.add(titlePenjualan);
        frame.add(titleMode);
        frame.add(kanvas_Bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // End Frame Config
    }
}
