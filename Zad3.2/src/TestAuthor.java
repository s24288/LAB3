public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Jan", "Kowalski", 25);
        Author author2 = new Author("Janusz", "Nowak", 30);
        Author author3 = new Author("Robert", "Wolski", 40);

        author1.toString();
        author1.setSurname("Jagiełło");
        author1.toString();
        
        author2.toString();
        author3.toString();
    }
}
