package problema4_6;

public class Reader {
    static int count = 0;
    private String name;
    private Integer id;

    public Reader(String name) {
        this.name = name;
        this.id = ++count;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void borrow (Book book){
        if (book.getBorrow() == false) {// daca e libera cartea in biblioteca
            book.setBorrow(true) ;
            book.setReader(this);
        }
        else {
            System.out.println("Cartea este deja imprumutata altcuiva, va rugam sa alegeti alta carte");
        }

    }
}
