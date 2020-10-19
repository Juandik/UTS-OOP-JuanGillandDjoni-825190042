public class mobil {
    String kode;
    String merk;
    double jumlah;
    double harga;
    double diskon;

    public String getKode(){
        return kode;
    }
    public void setKode(String kode){
        this.kode=kode;
    }
    public String getMerk(){
        if(kode.equalsIgnoreCase("1")){
            merk="Agya";
        }else if(kode.equalsIgnoreCase("2")){
            merk="Innova";
        }else if(kode.equalsIgnoreCase("3")){
            merk="Avanza";
        }else if(kode.equalsIgnoreCase("4")){
            merk="Pajero Sport";
        }else if(kode.equalsIgnoreCase("5")){
            merk="Xenia";
        }else if(kode.equalsIgnoreCase("6")){
            merk="Fortuner";
        }
        return merk;
    }
    public void setMerk(String merk){
        this.merk=merk;
    }
    public double getHarga(){
        if(kode.equalsIgnoreCase("1")){
            harga= 1000000;
        }else if(kode.equalsIgnoreCase("2")){
            harga= 1500000;
        }else if(kode.equalsIgnoreCase("3")){
            harga= 1800000;
        }else if(kode.equalsIgnoreCase("4")){
            harga= 2500000;
        }else if(kode.equalsIgnoreCase("5")){
            harga= 2000000;
        }else if(kode.equalsIgnoreCase("6")){
            harga= 2800000;
        }
        return harga;
    }
    public void setHarga(double harga){
        this.harga=harga;
    }

    double getTotal(){
        return getHarga() * jumlah;
    }

    double getDiskon(){
        if (getTotal() >= 4000000){
            diskon = (int)(getTotal() * 0.10);
            System.out.println("Diskon 10%");
        }else{
            diskon = 0;
            System.out.println("Tidak Ada Diskon");
        }
        return diskon;
    }
    double getTotalBayar(){
        return getTotal() - getDiskon();
    }
}
