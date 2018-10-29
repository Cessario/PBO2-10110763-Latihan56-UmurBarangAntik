/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10110763.latihan56.umurbarangantik;

/*
Nama : Cessario Sheva L.P.A
Kelas: IF-2
Nim  : 10117063
Deskripsi Program : Menampilkan umur barang antik
 */
public class Radio extends BarangAntik{
    private String name;

    public Radio(String name, int umur) {
        super(umur);
        this.name = name;
        
        System.out.println("Nama barang Antik : "+name);
        System.out.println("Umur barang Antik ini adalah : "+umur+ " tahun." );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
