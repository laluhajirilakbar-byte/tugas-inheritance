public class Main {
    public static void main(String[] args) {
        Bentuk bentuk1 = new Bentuk("Hitam");
        bentuk1.printInfo();
        
        System.out.println("--------------------");

        BujurSangkar kotak = new BujurSangkar(5.0, "Merah");
        kotak.printInfo();

        System.out.println("--------------------");

        Lingkaran bulat = new Lingkaran(10.0, "Biru");
        bulat.printInfo();

        System.out.println("--------------------");

        Silinder tabung = new Silinder(10.0, 5.0, "Hijau");
        tabung.printInfo();
    }
}