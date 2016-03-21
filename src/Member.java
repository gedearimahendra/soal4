public class Member {
    private String nama;
    private String team;
    private int umur;
    private double nilaiPenampilan;
    private double nilaiSuara;
    private double nilaiAttitude;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setTeam(String team){
        this.team = team;
    }
    public String getTeam(){
        return team;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public int getUmur(){
        return umur;
    }
    public void setNilaiPenampilan(double nilaiPenampilan) {
        this.nilaiPenampilan = nilaiPenampilan;
    }
    public double getNilaiPenampilan() {
        return nilaiPenampilan;
    }

    public double getNilaiSuara() {
        return nilaiSuara;
    }
    public void setNilaiSuara(double nilaiSuara) {
        this.nilaiSuara = nilaiSuara;
    }

    public double getNilaiAttitude() {
        return nilaiAttitude;
    }

    public void setNilaiAttitude(double nilaiAttitude) {
        this.nilaiAttitude = nilaiAttitude;
    }
    public double getNilai () {
    return (nilaiPenampilan+nilaiSuara+nilaiAttitude)/3;
    }
}