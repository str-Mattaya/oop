class Book {

    private String title;
    private int numOfPage;

    public Book(String title, int numOfPage) {
        this.title = title;
        this.numOfPage = numOfPage;
        // there has to be at least 1 page
        if(this.numOfPage < 1)
            this.numOfPage = 1;
    }

    public Book()
    {
        this.title = "";
        this.numOfPage = 1;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage)
    {
        this.numOfPage = numOfPage;
        if(this.numOfPage < 1)
            this.numOfPage = 1;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isMorePages(Book argBook)
    {
        return this.numOfPage > argBook.getNumOfPage();
    }

    public static boolean compareBook(Book argBook1, Book argBook2)
    {
        // if title are the same and pages are the same then true
        return argBook1.getTitle().equals(argBook2.getTitle()) && argBook1.getNumOfPage() == argBook2.getNumOfPage();
    }

    @Override
    public String toString() {
        return "Title: " + this.title + " | Number of Pages: " + this.numOfPage;
    }
}

public class BookMain {
    public static void main(String args[])
    {
        Book b1 = new Book();
        Book b2 = new Book("NAH", 63);
        Book b3 = new Book("NAH", 63);

        System.out.println("START");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b1.setNumOfPage(53);
        b1.setTitle("AABB");

        System.out.println("\n-----");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        if (b1.isMorePages(b2))
        {
            System.out.println(b1.getTitle() + " has more pages than " + b2.getTitle() + ".");
        }else{
            if (b2.isMorePages(b1))
            {
                System.out.println(b2.getTitle() + " has more pages than " + b1.getTitle() + ".");
            }else{
                System.out.println(b1.getTitle() + " has same pages as " + b2.getTitle() + ".");
            }
        }

        if (b3.isMorePages(b2))
        {
            System.out.println(b3.getTitle() + " has more pages than " + b2.getTitle() + ".");
        }else{
            if (b2.isMorePages(b3))
            {
                System.out.println(b2.getTitle() + " has more pages than " + b3.getTitle() + ".");
            }else{
                System.out.println(b3.getTitle() + " has same pages as " + b2.getTitle() + ".");
            }
        }

        if(Book.compareBook(b1,b2))
        {
            System.out.println(b1.getTitle() + " and " + b2.getTitle() + " are the same.");
        }else{
            System.out.println(b1.getTitle() + " is not " + b2.getTitle()+ ".");
        }

        if(Book.compareBook(b3,b2))
        {
            System.out.println(b3.getTitle() + " and " + b2.getTitle() + " are the same.");
        }else{
            System.out.println(b3.getTitle() + " is not " + b2.getTitle()+ ".");
        }
    }
}
