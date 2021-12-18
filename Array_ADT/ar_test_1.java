package DSA;

import java.util.*;

public class ar_test_1
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);

        Array_ADT ob1 = new Array_ADT(8);
        ob1.append(1);
        ob1.append(2);
        ob1.append(8);
        ob1.display();
        
        Array_ADT ob2 = new Array_ADT(8);
        ob2.append(2);
        ob2.append(5);
        ob2.append(6);
        ob2.display();
        
        Array_ADT c = ob1.diff(ob2);
        System.out.println(c.getSize());
        System.out.println(c.getLength());
        c.display();
        /*ob.display();
        ob.set(2,-5);
        ob.display();

        /*System.out.println(ob.recb_search(0,ob.length,2));
        System.out.println(ob.get(0));
        System.out.println(ob.max());
        System.out.println(ob.min());
        System.out.println(ob.sum());
        System.out.println(ob.avg());
        ob.reverse();
        ob.display();

        ob.left_rotate();
        ob.display();

        ob.right_rotate();
        ob.display();

        ob.insert_sorted(20);
        ob.insert_sorted(3);
        ob.display();
        System.out.println(ob.isSorted());*/
        /*ob.append(-3);
        ob.append(-13);
        //ob.rearrange();
        ob.display();
        ob.rearrange();
        ob.display();*/
    }
}
