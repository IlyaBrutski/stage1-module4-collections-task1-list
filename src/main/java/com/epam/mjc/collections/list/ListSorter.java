package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x = (int) Math.pow(5 * Integer.valueOf(a), 2) + 3;
        int y = (int) Math.pow(5 * Integer.valueOf(b), 2) + 3;
        return x == y ? -1 : x - y;
    }
}
