package uas;
import javax.swing.JButton;

class Tambah implements operasi{
        // variable hitung nilai
        private String operasi = "+";
        private JButton btnTambah;
        @Override
        public String getoperasi(){
            return operasi;
        }
        @Override
        public double hitung(double mix, double input, double jumlah){
            return mix + input;
        }
        public javax.swing.JButton getBtnTambah(JButton btnTambah) {
            return btnTambah;
        }

        public void setBtnTambah(javax.swing.JButton btnTambah) {
            this.btnTambah = btnTambah;
        }
}