import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Bar extends Canvas{
    public Bar(String jan, String feb, String mar, String apr, String mei, String jun){
        int ja = Integer.parseInt(jan);
        int fe = Integer.parseInt(feb);
        int mr = Integer.parseInt(mar);
        int ap = Integer.parseInt(apr);
        int mi = Integer.parseInt(mei);
        int jn = Integer.parseInt(jun);
        getMax(ja, fe, mr, ap, mi, jn);
        setBounds(222, 30, 275, 272);
        setBackground(Color.white);
        setVisible(true);
        setFocusable(false);
    }

    int max;

    public void getMax(int jan, int feb, int mar, int apr, int mei, int jun){
        int[] arr = {jan, feb, mar, apr, mei, jun};
        int m = arr[0];
        for (int i = 0; i < 6; i++) {
            if (arr[i] > m){
                m = arr[i];
            }
        }
        max = m;
    }

    public String getMid(){
        return Integer.toString(max / 2);
    }

    @Override
    public void paint (Graphics g){
        // Start Judul Atas
        g.drawString("Grafik Penjualan 6 Bulan", 60, 30);
        // End Judul Atas
        /* Start Nilai Samping */
        // Nilai Samping Max
        g.drawString(Integer.toString(max), (25 / 2) - 3, 45);
        // Nilai Samping Mid
        int nilaiMid = (237 - 45) / 2 + 45;
        g.drawString(getMid(), (25 / 2) - 3, nilaiMid);
        /* End Nilai Samping */

        // Start Warna Garis
        g.setColor(Color.red);
        // End Warna Garis
        // Start Garis Y
        g.drawLine(25, 237, 25, 45);
        // End Garis 
        // Start Garis X
        g.drawLine(25, 237, 247, 237);
        // End Garis X
        
        /*
        * Full = 192
        * Spasi = 1
        * Koordinat Y (Atas) = 45
        * Koordinat Y (Bawah) = 237
        */

        // Start Bar Grafik
        g.setColor(Color.blue);
        g.fillRect(27, 45, 35, (237 - 45) - 1); // Bar Full
        g.fillRect(64, 45 + 96, 35, 237 - 141 - 1); // 237 Garis Bawah - koor Y - spasi
        g.fillRect(101, 45 + 120, 35, 237 - (45 + 120) - 1);
        g.fillRect(138, 45 + 140, 35, 237 - (45 + 140) - 1);
        g.fillRect(175, 45 + 169, 35, 237 - (45 + 169) - 1);
        g.fillRect(212, 45 + 180, 35, 237 - (45 + 180) - 1);
        // End Bar Grafik
    }
}
