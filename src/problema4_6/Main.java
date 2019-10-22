package problema4_6;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Morometii", "Marin Preda", 1955);
        Book b2 = new Book("Viata ca o prada", "Marin Preda", 1977);
        Book[] books = new Book[2];
        books[0] = b1;
        books[1] = b2;

        Author a = new Author("Marin Preda", 2, books);
        Reader r = new Reader("Eusebiu");
        Reader[] cls11A = new Reader[]{new Reader("Eugen"), new Reader("Bogdan"), new Reader("Alina"), new Reader("Alexandra"), new Reader("Bianca"), new Reader("Lucian")};

        // biblioteca anunta un concurs pentru membrii clasei 11 A, iar castigatorul este persoana cu id ul 5 va putea imprumuta singurul exemplar
        // Marin Preda - Viata ca o prada

        for (int i = 0; i < 6; i++) {
            if (cls11A[i].getId() == 5) {
                System.out.println("Felicitari " + cls11A[i].getName() + ",  ai castigat !");
                cls11A[i].borrow(b2);
            }
        }


    }
}