/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Joseph Schiavone)
 * @version (02/09/2026)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;

    /**
     * Set the author, title, pages, and refNumber fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        refNumber = ("");
        pages = bookPages;
    }

    // Add the methods here ...
    /**
     * Returns the author field to the repective result
     * Satisfies the requirement of problem 2.83
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Returns the title field to the repective result
     * Satisfies the requirement of problem 2.83
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns the refNumber field to the repective result
     * Satisfies the requirement of problem 2.88
     */
    public String getRefNumber() {
        return refNumber;
    }
    
    /**
     * Returns the pages field to the respective result
     * Satisfies the requirement of problem 2.85
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Prints author to terminal
     * Satisfies the requirement of problem 2.84
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /**
     * Prints title to terminal
     * Satisfies the requirement of problem 2.84
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * Assigns the value of the parameter to the refNumber field
     * Satisfies the requirement of problem 2.88
     */
    public void setRefNumber(String ref) 
    {
     refNumber = ref;   
    }
    
    /**
     * Prints deatils of the book entered to the terminal
     * Satisfies the requirement of problem 2.87
     */
    public void printDetails() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        if (refNumber.length() > 0){
        System.out.println("Reference Number: " + refNumber);
    }
    else {
        System.out.println ("Reference Number: " + "ZZZ");
    }
}
}
