public class LibrarySystem {
    public static void main(String[] args) {
        LibraryUser kidUser = new KidUser(10, "Kids");
        kidUser.registerAccount();
        kidUser.requestBook();

        LibraryUser adultUser = new AdultUser(23, "Fiction");
        adultUser.registerAccount();
        adultUser.requestBook();
    }
}
