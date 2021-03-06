import java.util.Arrays;
import java.util.List;

public class PaginationHelper<I>
{
    private List<I> collection;

    private int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage)
    {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount()
    {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount()
    {
        double v = Math.ceil((double) collection.size() / itemsPerPage);
        return Double.valueOf(v).intValue();
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex)
    {
        if (pageIndex < 0 || pageIndex >= pageCount()) {
            return -1;
        }

        if (pageIndex == pageCount() - 1) {
            if (itemsPerPage * pageIndex == itemCount()) {
                return itemsPerPage;
            }
            else{
                return itemCount() - itemsPerPage * pageIndex;
            }
        }

        return itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex)
    {
        if (itemIndex < 0 || collection.size() == 0 || itemIndex > collection.size()) {
            return -1;
        }

        return itemIndex / itemsPerPage;
    }

    public static void main(String[] args)
    {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList(), 4);

        System.out.println(helper.pageCount()); //should == 2
        System.out.println(helper.itemCount()); //should == 6
        System.out.println(helper.pageItemCount(0)); //should == 4
        System.out.println(helper.pageItemCount(1)); // last page - should == 2
        System.out.println(helper.pageItemCount(2)); // should == -1 since the page is invalid

        // pageIndex takes an item index and returns the page that it belongs on
        System.out.println(helper.pageIndex(0)); //should == 1 (zero based index)
        System.out.println(helper.pageIndex(5)); //should == 1 (zero based index)
        System.out.println(helper.pageIndex(2)); //should == 0
        System.out.println(helper.pageIndex(8)); //should == 2
        System.out.println(helper.pageIndex(20)); //should == -1
        System.out.println(helper.pageIndex(-10)); //should == -1


    }
}


