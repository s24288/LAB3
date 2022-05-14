public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Jan", "Kowalski", 25);
        Author author2 = new Author("Janusz", "Nowak", 30);
        Author author3 = new Author("Robert", "Wolski", 40);

        System.out.println(author1.toString());
        author1.setSurname("Jagiełło");
        System.out.println(author1.toString());
        
        System.out.println(author2.toString());
        System.out.println(author3.toString());
    }
}
