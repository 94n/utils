package my.core;

import java.util.Comparator;

/**
 * User: makstitoff
 * Date: 31.05.13
 * Time: 10:41
 * To change this template use File | Settings | File Templates.
 */
public class IgnoreCaseStringComparator<String> implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return (o1).toString().compareToIgnoreCase(o2.toString());
    }
}
