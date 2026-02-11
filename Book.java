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
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author, title, pages, refNumber, and isCourseText fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        refNumber = ("");
        pages = bookPages;
        borrowed = 0;
        courseText = isCourseText;
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
     * Returns the borrowed field to the repective result
     * Satisfies the requirement of problem 2.91
     */
    public int getBorrowed() 
    {
        return borrowed;
    }
    
    /**
     * Returns the courseText field to the repective result
     * Satisfies the requirement of problem 2.92
     */
    public boolean isCourseText()
    {
       return courseText;
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
     * Satisfies the requirement of problem 2.88, 2.90
     */
    public void setRefNumber(String ref) 
    {
        if (ref.length() >=3) {
            refNumber = ref;
        }  
        else {
            System.out.println("Error: Reference Number must be at least three characters long.");
        }
    }
    
    /**
     * Updates the borrowed field by 1 everytime the method is called
     * Satisfies the requirement of problem 2.91
     */
    public void borrow() 
    {
        borrowed++;
    }
    
    /**
     * Prints deatils of the book entered to the terminal
     * Satisfies the requirement of problems 2.87, 2.90, 2.91, 2.93
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
        System.out.println ("Times Borrowed: " + borrowed);
}
}
