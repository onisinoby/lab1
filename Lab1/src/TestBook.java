public class TestBook
{
    public static void main(String[] args)
    {
        Book book = new Book("The Witcher: Sword of Destiny", 384);
        Book book2 = new Book("The Witcher: The Last Wish", 288);
        System.out.println(book);
        System.out.println(book2);
        book2.setName("The Witcher 2, Kinglayer");
        book2.setNameOfPages(350);
        System.out.println(book2);
    }
}
