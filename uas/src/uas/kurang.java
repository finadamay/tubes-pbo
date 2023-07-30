package uas;

import javax.swing.JButton;

public class kurang extends rumus{
    // variable hitung nilai
        String operasi = "-";
        private JButton btnKurang;
        public double kurang(double jumlah, double input){
            return jumlah-input;
        }
        public javax.swing.JButton getBtnKurang(JButton btnKurang) {
            return btnKurang;
        }

        public void setBtnKurang(javax.swing.JButton btnKurang) {
            this.btnKurang = btnKurang;
        }
        public double hitung(){
            return 0;
        }
}
