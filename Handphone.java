public class Handphone {
    String jenis_hp;
    int tahun_pembuatan;

    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp; 
        this.tahun_pembuatan = tahun_pembuatan; 
    }
    
    String getJenisHP(){
        return jenis_hp;
    }

    int getTahunPembuatan(){
        return tahun_pembuatan;
    }

    public static void main(String[] args){
        Handphone hp = new Handphone(); 
        hp.setDataHP("IPHONE XR", 2021); 
        System.out.println("Jenis HP: " + hp.getJenisHP()); 
        System.out.println("Tahun Pembuatan: " + hp.getTahunPembuatan()); 
    }
}