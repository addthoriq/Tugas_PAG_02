import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Grafik extends JFrame implements ActionListener {

    JButton btn_bar = new JButton();
    JButton btn_line = new JButton();
    JButton btn_pie = new JButton();
    JButton btn_hapus = new JButton();
    JTextField tx_Jan = new JTextField();
    JTextField tx_Feb = new JTextField();
    JTextField tx_Mar = new JTextField();
    JTextField tx_Apr = new JTextField();
    JTextField tx_Mei = new JTextField();
    JTextField tx_Jun = new JTextField();
    Canvas c = new Canvas();

    int[] arrValue;

    public void setValue(int ja, int fe, int mr, int ap, int me, int jn){
        arrValue = new int[] {ja, fe, mr, ap, me, jn};
    }

    Grafik(){
        setTitle("Thoriq, Fajri, Yunika");
        setSize(650, 365);
        setLayout(null);

        c.setBounds(222, 30, 275, 272);
        c.setBackground(Color.white);
        c.setVisible(true);
        

        String[] namaBulan = { "Januari", "Februari", "Maret", "April", "Mei", "Juni" };

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
        
        tx_Jan.setText("3");
        tx_Jan.setBounds(120, 62, 60, 30);
        // End Januari

        // Start Februari
        JLabel label_Feb = new JLabel();
        label_Feb.setBounds(20, 111, 80, 15);
        label_Feb.setText(namaBulan[1]);
        
        tx_Feb.setText("2");
        tx_Feb.setBounds(120, 103, 60, 30);
        // End Februari

        // Start Maret
        JLabel label_Mar = new JLabel();
        label_Mar.setBounds(20, 151, 80, 15);
        label_Mar.setText(namaBulan[2]);
        
        tx_Mar.setText("7");
        tx_Mar.setBounds(120, 144, 60, 30);
        // End Maret

        // Start April
        JLabel label_Apr = new JLabel();
        label_Apr.setBounds(20, 192, 80, 15);
        label_Apr.setText(namaBulan[3]);
        
        tx_Apr.setText("5");
        tx_Apr.setBounds(120, 185, 60, 30);
        // End April

        // Start Mei
        JLabel label_Mei = new JLabel();
        label_Mei.setBounds(20, 233, 80, 15);
        label_Mei.setText(namaBulan[4]);
        
        tx_Mei.setText("11");
        tx_Mei.setBounds(120, 226, 60, 30);
        // End Mei

        // Start Juni
        JLabel label_Jun = new JLabel();
        label_Jun.setBounds(20, 274, 80, 15);
        label_Jun.setText(namaBulan[5]);
        
        tx_Jun.setText("4");
        tx_Jun.setBounds(120, 267, 60, 30);
        // End Juni
        /* End Data Penjualan 6 Bulan */

        

        /* Start Tombol-Tombol */
        // Start Tombol Bar
        
        btn_bar.setBounds(542, 62, 80, 30);
        btn_bar.setText("Bar");
        btn_bar.addActionListener(this);
        // End Tombol Bar
        // Start Tombol Line
        btn_line.setBounds(542, 103, 80, 30);
        btn_line.setText("Line");
        btn_line.addActionListener(this);
        // End Tombol Line
        // Start Pie
        
        btn_pie.setBounds(542, 144, 80, 30);
        btn_pie.setText("Pie");
        btn_pie.addActionListener(this);
        // End Pie
        // Start Hapus
        
        btn_hapus.setBounds(542, 267, 80, 30);
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(this);
        // End Hapus
        /* End Tombol */

        // Start Canvas
        int ja = Integer.parseInt(tx_Jan.getText());
        int fe = Integer.parseInt(tx_Feb.getText());
        int mr = Integer.parseInt(tx_Mar.getText());
        int ap = Integer.parseInt(tx_Apr.getText());
        int me = Integer.parseInt(tx_Mei.getText());
        int jn = Integer.parseInt(tx_Jun.getText());
        setValue(ja, fe, mr, ap, me, jn);
        // End Canvas

        // Start Config
        /* Start Data Penjualan Add */
        add(tx_Jan);
        add(label_Jan);
        add(tx_Feb);
        add(label_Feb);
        add(tx_Mar);
        add(label_Mar);
        add(tx_Apr);
        add(label_Apr);
        add(tx_Mei);
        add(label_Mei);
        add(tx_Jun);
        add(label_Jun);
        /* End Data Penjualan Add */

        /* Start Tombol */
        add(btn_bar);
        add(btn_line);
        add(btn_pie);
        add(btn_hapus);
        /* End Tombol */

        add(c);

        add(titlePenjualan);
        add(titleMode);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        // End Frame Config
    }

    int minValue = 0, maxValue = 0;

    public void getMaxMin() {
        for (int i = 0; i < this.arrValue.length; i++) {
            if (this.minValue > this.arrValue[i])
                this.minValue = this.arrValue[i];
            if (this.maxValue < this.arrValue[i])
                this.maxValue = this.arrValue[i];
        }
    }

    public int getMid() {
        return this.maxValue / 2;
    }

    public void getBar(Graphics g) {
        int tepiAtas = 45;
        int tepiBawah = 240;

        // Start Warna Garis
        g.setColor(Color.blue);
        // End Warna Garis
        // Start Garis Y
        g.drawLine(25, tepiBawah - 7, 25, tepiAtas);
        // End Garis
        // Start Garis X
        g.drawLine(25, tepiBawah - 7, 247, tepiBawah - 7);
        // End Garis X

        /*
         * Full = 187
         * Spasi = 1
         * Koordinat Y (Atas) = 45
         * Koordinat Y (Bawah) = 240
         */

        // Start Bar Grafik
        g.setColor(Color.red);

        /*
         * Example
         * max = 20
         * min = 2
         * ukuran = (240 - 45) / (20 - 2) = 195 / 18 = 10
         * tinggi = 20 * 10 = 200
         * koorY = 45 + ((20-20) * 10) = 45 + 0 = 45
         * 187 = (20*10) - 20 + 7
         * 
         * ukuran = 10
         * tinggi = 2 * 10 + 7 = 27
         * koorY = 45 + ((27-2) * 10) = 45 + 250 = 295
         * 187 = (2*10) - 2 + 7 = 25
         */


        int ukuran = (tepiBawah - tepiAtas) / (this.maxValue - this.minValue);
        int lebarBatang = 37;
        String[] namaBulan = { "Jan", "Feb", "Mar", "Apr", "Mei", "Jun" };

        for (int index = 0; index < this.arrValue.length; index++) {
            int koorX = index * lebarBatang + 27;
            int koorY = (int) ((this.maxValue - this.arrValue[index]) * ukuran) + tepiAtas;
            int tinggi = (int) (this.arrValue[index] * ukuran);
            g.fillRect(koorX, koorY, lebarBatang - 1, tinggi);
            g.drawString(namaBulan[index], koorX + 7, 250);
        }
        // End Bar Grafik
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Graphics g = c.getGraphics();
        if (source == btn_bar){
            int ja = Integer.parseInt(tx_Jan.getText());
            int fe = Integer.parseInt(tx_Feb.getText());
            int mr = Integer.parseInt(tx_Mar.getText());
            int ap = Integer.parseInt(tx_Apr.getText());
            int me = Integer.parseInt(tx_Mei.getText());
            int jn = Integer.parseInt(tx_Jun.getText());
            setValue(ja, fe, mr, ap, me, jn);
            getMaxMin();
            getMid();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, c.getWidth(), c.getHeight());
            g.setColor(Color.BLACK);
            // Start Judul Atas
            g.drawString("Grafik Penjualan 6 Bulan", 60, 25);
            // End Judul Atas
            /* Start Nilai Samping */
            // Nilai Samping Max
            g.drawString(Integer.toString(this.maxValue), (25 / 2) - 3, 45);
            // Nilai Samping Mid
            int nilaiMid = (45 /2) + (240 / 2);
            g.drawString(Integer.toString(getMid()), (25 / 2) - 3, nilaiMid);
            /* End Nilai Samping */
            getBar(g);
            this.maxValue = 0;
            this.minValue = 0;
        } else if (source == btn_line){
            System.exit(0);
        } else if (source == btn_pie){
            System.exit(0);
        } else {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, c.getWidth(), c.getHeight());
            this.maxValue = 0;
            this.minValue = 0;
        }
    }


    public static void main(String[] args) {
        new Grafik();
    }
}
