import java.util.ArrayList;

public class MainMember {
public static ArrayList <Member> anggota = new ArrayList <> ();
    public static void main(String[] args) {

        Member m1 = new Member();
        Member m2 = new Member();
        Member m3 = new Member();
        
        
        m1.setNama("Ari");
        m1.setTeam("National");
        m1.setUmur(18);
        m1.setNilaiPenampilan(90);
        m1.setNilaiSuara(85);
        m1.setNilaiAttitude(95);
        
        
        m2.setNama("Riki");
        m2.setTeam("Champion");
        m2.setUmur(20);
        m2.setNilaiPenampilan(80);
        m2.setNilaiSuara(85);
        m2.setNilaiAttitude(90);
        
        
        m3.setNama("Raka");
        m3.setTeam("Delegation");
        m3.setUmur(16);
        m3.setNilaiPenampilan(80);
        m3.setNilaiSuara(75);
        m3.setNilaiAttitude(90);
        
        anggota.add(m1);
        anggota.add(m2);
        anggota.add(m3);
        displayMessage();
    }
    public static void displayMessage(){
        System.out.println("------------ DAFTAR MEMBER --------------");
        for( int i = 0 ; i < anggota.size(); i++){
            System.out.println("Nama : "+anggota.get(i).getNama());
            System.out.println("Team : "+anggota.get(i).getTeam());
            System.out.println("Umur : "+anggota.get(i).getUmur());
            System.out.println("Nilai: "+anggota.get(i).getNilai());
            System.out.println("------------------------------------");
        }
        
    }
    
}