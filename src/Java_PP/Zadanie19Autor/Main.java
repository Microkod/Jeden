package Java_PP.Zadanie19Autor;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Nowak", "Polak");
        Author author2 = new Author("Kijow", "Czech");
        Author author3 = new Author("Malik", "Bułgar");


        Poem poem1 = new Poem(author1, 11);
        Poem poem2 = new Poem(author2, 13);
        Poem poem3 = new Poem(author3, 7);

        Poem[] poems = {poem1, poem2, poem3};

        int max = 0;
        String name = "";
        for (Poem poem : poems) {
            if (poem.getStropheNumbers() > max) {
                max = poem.getStropheNumbers();
                name = poem.getCreator().getSurname();
            }
        }
        System.out.println(name);
    }
}

