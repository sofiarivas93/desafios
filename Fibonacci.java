import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

        public static Fibonacci getInstance() {
            return new Fibonacci();
        }

        static public int fib(int num) {
            HashMap<Integer, Integer> memoizedMap = new HashMap<>();
            if(num == 0){
                memoizedMap.put(0, 0);
                System.out.print(0 + " ");
                
            }else{
                memoizedMap.put(0, 0);
                System.out.print(0 + " ");
                memoizedMap.put(1, 1);
                System.out.print(1 + " ");
            }
            
            
            return fib(num, memoizedMap);
        }

        static private int fib(int num, Map<Integer, Integer> map) {
            if (map.containsKey(num))
                return map.get(num);
            int fibFromN = fib(num - 1, map) + fib(num - 2, map);
            map.put(num, fibFromN); //Memorizar el valor calculado
            System.out.print(fibFromN + " ");
            return fibFromN;
        }

        public static void main(String[] args){
            fib(15);
            System.out.print("\n");
        }
    
}

