public class TesTugas {
    public static void main(String[] args) {

        Truk truk1 = new Truk();
        truk1.setJmlRoda(4);
        truk1.setWarna("kuning");
        truk1.setBahanBakar("solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks("1000");

        Truk truk2 = new Truk();
        truk2.setJmlRoda(6);
        truk2.setWarna("merah");
        truk2.setBahanBakar("solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks("5000");


        Taksi taksi1 = new Taksi();
        taksi1.setJmlRoda(4);
        taksi1.setWarna("oranye");
        taksi1.setBahanBakar("bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKm(5000);

        Taksi taksi2 = new Taksi();
        taksi2.setJmlRoda(4);
        taksi2.setWarna("biru");
        taksi2.setBahanBakar("bensin");
        taksi2.setKapasitasMesin(1300);
        taksi2.setTarifAwal(7000);
        taksi2.setTarifPerKm(3500);


        Sepeda sepeda1 = new Sepeda();
        sepeda1.setJmlRoda(3);
        sepeda1.setWarna("hitam");
        sepeda1.setJmlSadel("1");
        sepeda1.setJmlGir(2);

        Sepeda sepeda2 = new Sepeda();
        sepeda2.setJmlRoda(2);
        sepeda2.setWarna("putih");
        sepeda2.setJmlSadel("2");
        sepeda2.setJmlGir(5);


        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("| Objek   | jmlRoda | warna  | bahanBakar | kapasitasMesin | muatanMaks | tarifAwal | tarifPerKm | jmlSadel | jmlGir |");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.printf("| %-7s | %-7d | %-6s | %-10s | %-14d | %-10s | %-9s | %-10s | %-8s | %-6s |\n",
                "truk1", truk1.getJmlRoda(), truk1.getWarna(), truk1.getBahanBakar(), truk1.getKapasitasMesin(), truk1.getMuatanMaks(), "", "", "", "");
        System.out.printf("| %-7s | %-7d | %-6s | %-10s | %-14d | %-10s | %-9s | %-10s | %-8s | %-6s |\n",
                "truk2", truk2.getJmlRoda(), truk2.getWarna(), truk2.getBahanBakar(), truk2.getKapasitasMesin(), truk2.getMuatanMaks(), "", "", "", "");
        System.out.printf("| %-7s | %-7d | %-6s | %-10s | %-14d | %-10s | %-9d | %-10d | %-8s | %-6s |\n",
                "taksi1", taksi1.getJmlRoda(), taksi1.getWarna(), taksi1.getBahanBakar(), taksi1.getKapasitasMesin(), "", taksi1.getTarifAwal(), taksi1.getTarifPerKm(), "", "");
        System.out.printf("| %-7s | %-7d | %-6s | %-10s | %-14d | %-10s | %-9d | %-10d | %-8s | %-6s |\n",
                "taksi2", taksi2.getJmlRoda(), taksi2.getWarna(), taksi2.getBahanBakar(), taksi2.getKapasitasMesin(), "", taksi2.getTarifAwal(), taksi2.getTarifPerKm(), "", "");
        System.out.printf("| %-7s | %-7d | %-6s | %-10s | %-14s | %-10s | %-9s | %-10s | %-8s | %-6d |\n",
                "sepeda1", sepeda1.getJmlRoda(), sepeda1.getWarna(), "", "", "", "", "", sepeda1.getJmlSadel(), sepeda1.getJmlGir());
        System.out.printf("| %-7s | %-7d | %-6s | %-10s | %-14s | %-10s | %-9s | %-10s | %-8s | %-6d |\n",
                "sepeda2", sepeda2.getJmlRoda(), sepeda2.getWarna(), "", "", "", "", "", sepeda2.getJmlSadel(), sepeda2.getJmlGir());
        System.out.println("---------------------------------------------------------------------------------------------------");
    }
}