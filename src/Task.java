public class Task {

    public static void main(String[] args) {
        System.out.println(isOdd(23));
     sumOfArray();
     toCodes();
        System.out.println(toRandom(23,45));
    }
        public static boolean isOdd ( int value){
          return value%2==0;
        }

        public static void sumOfArray(){
        int[] array={10,20,30,34,567,432,23,-45,35,0,-78};
        int sum=0;
      for(int i:array){
            sum+=i;
        }
            System.out.println(sum);
        }

        public static void toCodes() {
            char[] array = {'a', 'n', 'n', 'a'};
            int[] array1 = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                array1[i] = (int) array[i];
                System.out.println(array1[i]);
            }
        }
        public static double toRandom(int min,int max){
        double random;
          random= Math.random()*(max-min+1);
          return random;

        }
    }
