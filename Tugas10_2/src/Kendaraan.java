class Kendaraan {
    protected int jmlRoda;
    protected String warna;

    public void setJmlRoda(int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }
    public int getJmlRoda() {
        return jmlRoda;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return warna;
    }
}

class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    public String getBahanBakar() {
        return bahanBakar;
    }
    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }
}

class Sepeda extends Kendaraan {
    private String jmlSadel;
    private int jmlGir;

    public void setJmlSadel(String jmlSadel) {
        this.jmlSadel = jmlSadel;
    }
    public String getJmlSadel() {
        return jmlSadel;
    }
    public void setJmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }
    public int getJmlGir() {
        return jmlGir;
    }
}

class Truk extends Mobil {
    private String muatanMaks;

    public void setMuatanMaks(String muatanMaks) {
        this.muatanMaks = muatanMaks;
    }
    public String getMuatanMaks() {
        return muatanMaks;
    }
}

class Taksi extends Mobil {
    private int tarifAwal;
    private int tarifPerKm;

    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }
    public int getTarifAwal() {
        return tarifAwal;
    }
    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }
    public int getTarifPerKm() {
        return tarifPerKm;
    }
}

