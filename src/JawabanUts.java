import java.util.Random;
import java.util.Scanner;

public class JawabanUts {
    int prodi = 3;
    static int totalMahasiswa = 1050;
    static String[] TI = new String[500];
    public static String[] DKV = new String[300];
    public static String[] TK = new String[250];

    public static void printInfoMAhasiswa(){
        int totalTI = 0;
        int sisaKursi = 0;
        for (int index = 0; index < TI.length; index++) {
            if (TI[index] != null) {
                totalTI++;
            }
        }
        int totalDKV=0;
        for (int index=0;index< DKV.length;index++){
            if (DKV[index]!= null){
                totalDKV++;
            }
        }
        int totalTK=0;
        for (int index=0;index< TK.length;index++){
            if (TK[index] != null){
                totalTK++;
            }
        }
        sisaKursi = totalMahasiswa - totalTI - totalDKV - totalTK;
        System.out.println("Prodi TI :" + totalTI + "| Prodi DKV :" + totalDKV + "| Prodi TK :" + totalTK);
        System.out.println("Jumlah Mahasiswa :" + totalMahasiswa + "| Sisa Kursi :" + sisaKursi);
        System.out.println();
    }

    public static void CheckIndexArray(String[] myArray,String pasien){
        int indexNow=0;
        for (int index=0; index<myArray.length; index++){
            if (myArray[index] !=null){
                indexNow = index + 1;
            }
        }
        if (indexNow < myArray.length){
            myArray[indexNow] = pasien;
        }
    }

    public static void simpanMahasiswa( String nama, String prodi) {
        switch (prodi) {
            if (nama == null)
                CheckIndexArray(TI, prodi);
            System.out.println("Anda masuk TI");
            printInfoMAhasiswa();
            break;
            case 2:
                CheckIndexArray(DKV, prodi);
                System.out.println("Anda masuk DKV");
                printInfoMAhasiswa();
                break;
            case 3:
                CheckIndexArray(TK, prodi);
                System.out.println("Anda masuk TK");
                printInfoMAhasiswa();
                break;
        }
    }
    public static void inputMahasiswa(){
        Scanner inputData = new Scanner(System.in);
        while (true){
            System.out.print("Nama Mahasiswa :");
            String namaMahasiswa = inputData.nextLine();
            System.out.print("Prodi :");

            if (namaMahasiswa.isBlank()){
                System.out.println("Nama Mahasiswa Wajib Di Isi");
                inputMahasiswa();
            }else {
                String namaProdi =inputData.nextLine();
                String Prodi = namaProdi.length();
                simpanMahasiswa(Prodi,namaMahasiswa);
            }
        }
    }

    public static void main(String[] args){
        inputMahasiswa();
    }
}
