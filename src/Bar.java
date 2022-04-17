import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Bar extends Canvas{
    int[] arrJum = new int[6];
    int minValue = 0, maxValue = 0;

    public Bar(int[] arrValue){
        arrJum = arrValue;
        // for (int index = 0; index < arrValue.length; index++)
        //     this.arrJum[index] = Integer.parseInt(arrValue[index]);
        getMaxMin();
        setBounds(222, 30, 275, 272);
        setBackground(Color.white);
        setVisible(true);
        setFocusable(false);
    }

    // public void receivedData(String[] arrValue){
        // for (int index = 0; index < arrValue.length; index++)
        //     this.arrJum[index] = Integer.parseInt(arrValue[index]);
        // getMaxMin();
    // }

    public void getMaxMin(){
        for (int i = 0; i < this.arrJum.length; i++) {
            if (this.minValue > this.arrJum[i])
                this.minValue = this.arrJum[i];
            if (this.maxValue < this.arrJum[i])
                this.maxValue = this.arrJum[i];
        }
    }

    public int getMid(){
        return this.maxValue / 2;
    }

    @Override
    public void paint (Graphics g){
        int tepiAtas = 45;
        int tepiBawah = 240;
        // Start Judul Atas
        g.drawString("Grafik Penjualan 6 Bulan", 60, 25);
        // End Judul Atas
        /* Start Nilai Samping */
        // Nilai Samping Max
        g.drawString(Integer.toString(this.maxValue), (25 / 2) - 3, tepiAtas);
        // Nilai Samping Mid
        int nilaiMid = (tepiBawah - tepiAtas) / 2 + (this.maxValue - this.minValue);
        g.drawString(Integer.toString(getMid()), (25 / 2) - 3, nilaiMid);
        /* End Nilai Samping */

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
        * Full = 192
        * Spasi = 1
        * Koordinat Y (Atas) = 45
        * Koordinat Y (Bawah) = 237
        */

        // Start Bar Grafik
        g.setColor(Color.red);

        int ukuran = (tepiBawah - tepiAtas) / (this.maxValue - this.minValue);
        int lebarBatang = 37;
        String[] namaBulan = {"Jan", "Feb", "Mar", "Apr", "Mei", "Jun"};
        
        for (int index = 0; index < this.arrJum.length; index++){
            int koorX = index * lebarBatang + 27;
            int koorY = tepiAtas;
            int tinggi = (int) (this.arrJum[index] * ukuran);
            if (this.arrJum[index] >= 0) {
                koorY += (int) ((this.maxValue - this.arrJum[index]) * ukuran);
            } else {
                koorY += (int) (this.maxValue * ukuran);
                tinggi = -tinggi;
            }
            g.fillRect(koorX, koorY, lebarBatang - 1, tinggi);
            g.drawString(namaBulan[index], koorX + 7, 250);
        }
        // End Bar Grafik
    }

    // public void run(int[] arrValue){
    //     arrJum = arrValue;
    // }
}
