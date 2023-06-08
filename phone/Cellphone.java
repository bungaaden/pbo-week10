package implementasi.phone;
import java.lang.Math;
import java.util.ArrayList;

public class Cellphone implements Phone{
    String merk;
    String type;
    int batteryLevel;
    int status;
    int volume;
    int pulsa;
    ArrayList<Contact> daftarKontak;

    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);  
        this.pulsa = 0;
        this.daftarKontak = new ArrayList<Contact>();
    }

    public void powerOn()
    {
        this.status = 1;
        System.out.println("Ponsel menyala");
    }
    
    public void powerOff()
    {
        this.status = 0;
        System.out.println("Ponsel mati");
    }

    public void volumeUp()
    {
        if(this.status == 0)
        {
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    public void volumeDown()
    {
        if(this.status == 0)
        {
            System.out.println("Ponsel mati. Tidak dapat menurunkan volume");
        }
        else
        {
            this.volume--;
        }
    }

    public int getVolume()
    {
        return this.volume;
    }

    public void topupPulsa (int jumlah)
    {
           this.pulsa = this.pulsa+jumlah;
           System.out.println("Pulsa berhasil ditop up sebesar Rp "+jumlah);
    }

    public int getSisaPulsa()
    {
        return this.pulsa;
    }

    public void addContact ( String nama, String nomor)
    {
        Contact contact = new Contact(nama, nomor);
        daftarKontak.add(contact);
        System.out.println("Contact berhasil ditambahkan");
    }

    public void lihatContact()
    {
        if(daftarKontak.isEmpty())
        {
            System.out.println("Daftar Kontak kosong");
        }
        else
        {
           System.out.println("Daftar Kontak");
           for (Contact contact : daftarKontak)
           {
                System.out.println("Nama : "+contact.getNama()+" Nomor : "+contact.getNomor());
           } 
        }
    }

    public void cariContact(String nama)
    {
        boolean ada = false;
        for (Contact contact : daftarKontak)
        {
            if(contact.getNama().equalsIgnoreCase(nama))
            {
                System.out.println("Kontak yang dicari berhasil ditemukan");
                System.out.println("Nama : "+contact.getNama()+" Nomor : "+contact.getNomor());
                ada = true;
            }   
        } 
        if (!ada)
        {
            System.out.println("Kontak yang dicari dengan nama "+nama+" tidak ditemukan");
        }
    }

}