package uas;

import javax.swing.JButton;

public class kali extends rumus{
    // variable hitung nilai
        String operasi = "*";
        private JButton btnKali;
        public double kurang(double jumlah, double input){
            return jumlah*input;
        }
        public javax.swing.JButton getBtnKali(JButton btnKali) {
        return btnKali;
        }

        public void setBtnKali(javax.swing.JButton btnKali) {
            this.btnKali = btnKali;
        }
        @Override
        public double hitung() {
            return 0;
        }
}
