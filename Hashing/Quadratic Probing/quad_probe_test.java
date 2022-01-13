package DSA;



public class quad_probe_test
{
    public static void main()
    {
        quadratic_probing h = new quadratic_probing();

        h.insert(23);
        h.insert(43);
        h.insert(13);
        h.insert(27);
        //h.insert(1);
        //h.insert(99);
        h.display();
        System.out.println("key found at " +h.search(43));
        System.out.println("key found at " +h.search(16));
        System.out.println(h.loading_factor());
    }
}
