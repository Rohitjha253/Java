package CollectionDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        List<Integer> list1=new ArrayList<>();
        list1.add(12);
        list1.add(23);
        list1.add(34);

        list.addAll(list1);

        /*  System.out.println(list);
         for(int num:list)
        {
            System.out.println(num);
            
        }   */
        
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(2);
        System.out.println(set);

        Iterator<Integer> itr=set.iterator();

        List<String> list2=new ArrayList<>();
        list2.add("111");
        list2.add("222");
        list2.add("333");
        Iterator<String> itr1=list2.iterator();

       /*  while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
 */
   Map<String,Integer> empWages=new HashMap<>();
   empWages.put("Rohit", 100000);
   empWages.put("nkdebug", 200000);
   empWages.put("pkdebug", 300000);
   empWages.put("skdebug", 400000);

   System.out.println(empWages);
   System.out.println(empWages.keySet());
   System.out.println(empWages.values());
   
   for(String name:empWages.keySet())
   {
    System.out.println(name+"----->"+empWages.get(name));
   }


    }
}
