package sortingcollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingService
{
    public List<AObject> sort(List<AObject> list){
        Collections.sort(list);
        return list;
    }

    public List<AObject> sort(List<AObject> list, Comparator<AObject> comp){
        Collections.sort(list, comp);
        return list;
    }
}
