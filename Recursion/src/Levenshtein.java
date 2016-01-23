import java.util.HashMap;

//-------------------------------------------------------------------------
/**
 * An implementation of the Levenshtein distance algorithm.
 *
 * @author  Tuan Nguyen tuanhmng
 * @version 2013.11.14
 */
public class Levenshtein
{
    //~ Fields ..........................................................
    private String s1;
    private String s2;
    private HashMap<String, Integer> e;

    // ----------------------------------------------------------
    /**
     * Create a new Levenshtein object.
     * @param string1 is the first string.
     * @param string2 is the second string.
     */
    //~ Constructors ....................................................
    public Levenshtein(String string1, String string2)
    {
        s1 = string1;
        s2 = string2;
        e = new HashMap<String, Integer>();
    }

    //~ Methods .........................................................
    /**
     * Recursive method for getting the distance between two strings.
     * @param index1 is the starting index of string1.
     * @param length1 is the length of the first string.
     * @param index2 is the starting index of string2.
     * @param length2 is the length of the second string.
     * @return an integer indicating the distance.
     */
    private int distance(int index1, int length1, int index2, int length2)
    {
        String key = String.valueOf(index1) + "," +
            String.valueOf(length1) + "," +
            String.valueOf(index2) + "," +
            String.valueOf(length2);
        if (e.containsKey(key)) //if e contains key, return value at key
        {
            return e.get(key);
        }
        if (length1 == 0)
        {
            if (length2 == 0)
            {
                return 0;
            }
            else
            {
                return length2;
            }
        }
        else if (length2 == 0)
        {
            return length1;
        }
        else
        {
            int c;
            if (s1.charAt(index1) == (s2.charAt(index2)))
            {
                c = 0;
            }
            else
            {
                c = 1;
            }
            int d = Math.min(distance(index1 + 1, length1 - 1,
                index2, length2) + 1,
                Math.min(distance(index1, length1,
                    index2 + 1, length2 - 1) + 1,
                    distance(index1 + 1, length1 - 1,
                        index2 + 1, length2 - 1) + c));
            e.put(key, d); //put the distance d into HashMap e at "key"
            return d;
        }
    }

    /**
     * Wrapper method for the recursive distance() method.
     * @return an integer that indicates the distance
     * between the two strings.
     */
    public int distance()
    {
        return distance(0, s1.length(), 0, s2.length());
    }
}
