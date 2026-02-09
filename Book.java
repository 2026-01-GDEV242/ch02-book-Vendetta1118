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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
    /**
     * Satisfies the requirement of problem 2.83
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Satisfies the requirement of problem 2.83
     */
    public String getTitle()
    {
        return title;
    }
}
