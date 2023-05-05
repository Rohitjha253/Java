package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 20, 76, 43, 24, 11);

        /*
            Using Stream in 4 lines...Breaking the steps

         * Stream<Integer> stream=list.stream();
         * 
         * Stream<Integer> oddstream=stream.filter(n->n%2!=0);
         * Stream<Integer> transformstream=oddstream.map(n->n-5);
         * 
         * int sum=transformstream.reduce(0,(n,k)->n+k);
         * System.out.println(sum);
         */
          
        /*  
        using Stream function in same line..fucntion chaining

        int result = list.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n - 5)
                .reduce(0, (n, k) -> n + k);

        System.out.println(result);

 */



        Predicate<Integer> predicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                if (t % 2 != 0)
                    return true;
                else
                    return false;
            }

        };

        Function<Integer,Integer> function=new Function<Integer,Integer>() {

            @Override
            public Integer apply(Integer t) {
                return t-5;
            }
            
        };

       BinaryOperator<Integer> bin=new BinaryOperator<Integer>() {

        @Override
        public Integer apply(Integer t, Integer u) {
            return t+u;
        }
        
       };
        
        int result = list.stream()
                .filter(predicate)
                .map(function)
                .reduce(0,bin);

        System.out.println(result);


        Stream<Integer> sortedStream = list.stream().filter(k -> k%2!=0).sorted(); // 15,43,11
      sortedStream.forEach(k -> System.out.println(k));







        /*
         * Consumer<Integer> cons=new Consumer<Integer>() {
         * 
         * @Override
         * public void accept(Integer t) {
         * if(t%2!=0)
         * System.out.println(t+10);
         * }
         * 
         * };
         * 
         * //forEach loop takes consumer interface internally
         * list.forEach(n->System.out.println(n));
         * list.forEach(cons);
         * 
         * System.out.println(list);
         */

    }
}
