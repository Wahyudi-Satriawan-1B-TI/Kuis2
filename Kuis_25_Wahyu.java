public class Kuis_25_Wahyu {
    public static void main(String[] args) {
    
    int [][] tabelBuku25 = {
        {5, 8, 6, 7, 5, 10, 9},
        {3, 5, 4, 6, 7, 6, 8},
        {7, 6, 5, 8, 9, 7, 10},
        {6, 4, 5, 6, 8, 9, 11}
    };
    
    
    //Banyaknya buku yang terjual setiap harinya pada semua kategori
    System.out.println("============================ LAPORAN PENJUALAN ============================");
    for (int i25 = 0; i25 < 7; i25++) {
        int totalHarian25 = 0;
        for (int j25 = 0; j25 < 4; j25++){
            totalHarian25 += tabelBuku25[j25][i25];
        } if (i25 == 0) {
            System.out.println("Total buku yang terjual pada hari Senin  : " + totalHarian25);
        } else if (i25 == 1) {
            System.out.println("Total buku yang terjual pada hari Selas  : " + totalHarian25); 
        } else if (i25 == 2) {
            System.out.println("Total buku yang terjual pada hari Rabu   : " + totalHarian25); 
        } else if (i25 == 3) {
            System.out.println("Total buku yang terjual pada hari Kamis  : " + totalHarian25); 
        } else if (i25 == 4) {
            System.out.println("Total buku yang terjual pada hari Jumat  : " + totalHarian25); 
        } else if (i25 == 5) {
            System.out.println("Total buku yang terjual pada hari Sabtu  : " + totalHarian25); 
        } else if (i25 == 6) {
            System.out.println("Total buku yang terjual pada hari Minggu : " + totalHarian25); 
        }
    }
    
    //Rata-rata penjualan buku pada kategori sesuai nomor absen
    //25 % 4 = 1 (Non Fiksi)
    double rataBukuNonFiksi25 = 0;
    for (int i25 = 0; i25 < tabelBuku25[1].length; i25++) {
        rataBukuNonFiksi25 += tabelBuku25[1][i25];
    }
    System.out.println("============================================================================");
    System.out.println("Rata-rata penjualan buku Non Fiksi selama 1 minggu adalah " + rataBukuNonFiksi25/7 + " per hari");
    
    //Total pemasukan toko buku selama seminggu
    int hari251 = 45000*tabelBuku25[0][0] + 55000*tabelBuku25[1][0] + 40000*tabelBuku25[2][0] + 35000*tabelBuku25[3][0];
    int hari252 = 45000*tabelBuku25[0][1] + 55000*tabelBuku25[1][1] + 40000*tabelBuku25[2][1] + 35000*tabelBuku25[3][1];
    int hari253 = 45000*tabelBuku25[0][2] + 55000*tabelBuku25[1][2] + 40000*tabelBuku25[2][2] + 35000*tabelBuku25[3][2];
    int hari254 = 45000*tabelBuku25[0][3] + 55000*tabelBuku25[1][3] + 40000*tabelBuku25[2][3] + 35000*tabelBuku25[3][3];
    int hari255 = 45000*tabelBuku25[0][4] + 55000*tabelBuku25[1][4] + 40000*tabelBuku25[2][4] + 35000*tabelBuku25[3][4];
    int hari256 = 55000*tabelBuku25[0][5] + 65000*tabelBuku25[1][5] + 50000*tabelBuku25[2][5] + 45000*tabelBuku25[3][5];
    int hari257 = 55000*tabelBuku25[0][6] + 65000*tabelBuku25[1][6] + 50000*tabelBuku25[2][6] + 45000*tabelBuku25[3][6];

    int totalSeminggu25 = hari251 + hari252 + hari253 + hari254 + hari255 + hari256 + hari257;
    System.out.println("============================================================================");
    System.out.println("Total pemasukan toko buku selama seminggu   : Rp " + totalSeminggu25);
    
    //Kategori buku dan nama hari dengan jumlah penjualan terendah/tertinggi sesuai NIM
    //NIM 244107020137 (Tertinggi)
    System.out.println("============================================================================");
    int nilaiTertinggi25 = 0;
    for (int i25 = 0; i25 < tabelBuku25.length; i25++) {
        for (int j25 = 0; j25 < tabelBuku25[i25].length; j25++){
            if (tabelBuku25[i25][j25] > nilaiTertinggi25) {
                nilaiTertinggi25 = tabelBuku25[i25][j25];
            }
        }
    }
    System.out.println("Kategori buku dan nama hari dengan jumlah penjualan tertinggi terdapat pada kategori Komik pada hari Minggu, sebanyak " + nilaiTertinggi25 + " penjualan");
    System.out.println("============================================================================");

    }
}