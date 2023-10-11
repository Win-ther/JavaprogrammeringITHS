package se.iths.Uppgifter.Vecka2.Uppgift7;

public class TextBook {
    private final String[] pages;
    private int pageCounter;

    public TextBook() {
        pages = new String[10];
        pageCounter = 0;
    }
    public TextBook(int size){
        if (size <= 0)
            throw new IllegalArgumentException("Felmeddelande");
        pages = new String[size];
        pageCounter = 0;
    }
    public void addPage(String text){
        if (pageCounter >= pages.length)
            throw new ArrayIndexOutOfBoundsException("Slut på sidor");
        pages[pageCounter] = text;
        pageCounter++;
    }
    public int count(){
        return pageCounter;
    }
    public String getPage(int page){
        if (pages[page] == null)
            return "";
        return pages[page];
    }
    public String[] getPages(){
        return getPages(0);
    }
    public String[] getPages(int start){
        String[] clonePages = new String[pageCounter-start];
        System.arraycopy(pages, start, clonePages, 0, pageCounter-start); // Samma sak som for-loop kopiering, inbyggt i Java.
        //for (int i = 0; i < pageCounter; i++)
        //    clonePages[i] = pages[i];
        return clonePages;
    }
    public String[] getPages(int start,int stop){
        String[] clonePages = new String[(stop-start)];
        if (stop >= 0 && stop <= pageCounter)
            System.arraycopy(pages, start, clonePages, 0, (stop-start));
        else
            clonePages = getPages();

        return clonePages;
    }

}
