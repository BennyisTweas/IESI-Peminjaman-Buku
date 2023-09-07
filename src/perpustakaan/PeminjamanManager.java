/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author alvin
 */
public class PeminjamanManager {

    Peminjaman peminjamanCollection;

    PeminjamanManager() {
        this.peminjamanCollection = new Peminjaman();
    }

    boolean save(BukuDipinjam[] bukuDipinjam) {

        for (BukuDipinjam bukuDipinjam1 : bukuDipinjam) {
            peminjamanCollection.daftarBuku.add(bukuDipinjam1);
        }

        return true;
    }
}
