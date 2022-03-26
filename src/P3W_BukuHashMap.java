import java.util.HashMap;
import java.util.Map;

public class P3W_BukuHashMap {
    public static void main(String[] args) {
        // mmebuat objek hashmap
        HashMap<String, P3W_Buku> books = new HashMap<>();

        // membuat objek buku
        P3W_Buku bukuJava = new P3W_Buku("Tutorial Java", "Petani Kode");
        P3W_Buku bukuKotlin = new P3W_Buku("Pemogrman Kotlin", "Petani Kode");
        P3W_Buku bukuAndroid = new P3W_Buku("Pemograman Android", "Petani Kode");

        // mengisi objek hashmap dengan objek buku
        books.put("java", bukuJava);
        books.put("kotling", bukuKotlin);
        books.put("android", bukuAndroid);

        //print key
        System.out.println("\nDaftar key : ");
        for (String i : books.keySet()) {
            System.out.println(i);
        }

        // print values
        System.out.println("\nDaftar values : ");
        for (P3W_Buku aBook : books.values()) {
            System.out.println("Title : " + aBook.getTitle() + ",Author :" + aBook.getAuthor());
        }

        // cetak semua buku
        for (Map.Entry b : books.entrySet()) {
            P3W_Buku buku = (P3W_Buku) b.getValue();
            System.out.println(b.getKey() + ": " + buku.getTitle());
        }
    }
}