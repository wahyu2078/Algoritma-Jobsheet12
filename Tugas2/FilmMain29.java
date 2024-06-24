package Tugas2;

import java.util.Scanner;

public class FilmMain29 {
    public static void menu() {
        System.out.println("=================================== ");
        System.out.println("DATA FILM LAYAR LEBAR 29 ");
        System.out.println("=================================== ");
        System.out.println();
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("=================================== ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists29 dll = new DoubleLinkedLists29();

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Posisi Awal");
                    System.out.println("-----------------------------");
                    System.out.print("ID : ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Judul Film : ");
                    String judul = sc.nextLine();
                    System.out.print("Rating (ex. 4.5) : ");
                    double rating = sc.nextDouble();
                    Film29 nb = new Film29(id, judul, rating);
                    dll.addFirst(nb);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.println("-----------------------------");
                    System.out.print("ID : ");
                    int id1 = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Judul Film : ");
                    String judul1 = sc.nextLine();
                    System.out.print("Rating (ex. 4.5) : ");
                    double rating1 = sc.nextDouble();
                    Film29 nb1 = new Film29(id1, judul1, rating1);
                    dll.addLast(nb1);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data FILM");
                    System.out.println("-----------------------------");
                    System.out.print("Urutan ke : ");
                    int index = sc.nextInt();
                    System.out.print("ID : ");
                    int id2 = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Judul Film : ");
                    String judul2 = sc.nextLine();
                    System.out.print("Rating (ex. 4.5) : ");
                    double rating2 = sc.nextDouble();
                    Film29 nb2 = new Film29(id2, judul2, rating2);
                    try {
                        dll.add(nb2, index);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 4:
                    Film29 film = dll.getFirst();
                    System.out.println("Film " + film.judul + " telah dihapus.");
                    dll.removeFirst();
                    System.out.println();
                    break;
                case 5:
                    Film29 film1 = dll.getLast();
                    System.out.println("Film " + film1.judul + " telah dihapus.");
                    dll.removeLast();
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Urutan ke : ");
                    int index1 = sc.nextInt();
                    try {
                        Film29 film2 = dll.get(index1);
                        System.out.println("Film " + film2.judul + " telah dihapus.");
                        dll.remove(index1);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.println("-----------------------------");
                    System.out.println("DATA FILM LAYAR LEBAR");
                    System.out.println("-----------------------------");
                    dll.print();
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Masukkan ID : ");
                    int idSearch = sc.nextInt();
                    try {
                        Film29 search = dll.searchById(idSearch);
                        System.out.println("ID \t: " + search.id);
                        System.out.println("Judul \t: " + search.judul);
                        System.out.println("Rating \t: " + search.rating);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 9:
                    dll.sortByRatingDesc();
                    System.out.println("-----------------------------");
                    System.out.println("DATA FILM LAYAR LEBAR SORTING DESC");
                    System.out.println("-----------------------------");
                    dll.print();
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilih != 10);
    }
}
