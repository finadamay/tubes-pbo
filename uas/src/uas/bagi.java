package uas;

import javax.swing.JButton;

public class bagi extends rumus{

    // variable hitung nilai
        String operasi = "/";
        private JButton btnBagi;
        public double kurang(double jumlah, double input){
            if (input == 0){
                throw new ArithmeticException();
            }
            return jumlah/input;
        }
        public javax.swing.JButton getBtnBagi(JButton btnBagi) {
            return btnBagi;
        }
    
        public void setBtnBagi(javax.swing.JButton btnBagi) {
            this.btnBagi = btnBagi;
        }
        @Override
        public double hitung(){
            return 0;
        }
    
}
