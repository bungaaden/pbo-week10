package implementasi.phone;

public class CellphoneMain 
{
    public static void main(String[] args)
    {
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();

       cp.volumeUp(); 
       cp.volumeDown();
       cp.volumeUp();
       System.out.println("Volume "+cp.getVolume());

       cp.topupPulsa(25000);
       System.out.println("Sisa pulsa Rp "+cp.getSisaPulsa());

       cp.addContact("Bulan", "0877123445");
       cp.addContact("Bunga", "0879761234");
       cp.addContact("Zayn", "08125678");
       cp.addContact("Dahlia", "0844567896");
       cp.lihatContact();

       cp.cariContact("Bunga");
       cp.cariContact("Hani");

       cp.powerOff();
    }
      
}
