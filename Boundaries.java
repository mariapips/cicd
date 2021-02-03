public class Boundaries {


    public static int Maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
       return (max);
    }
    public static int Minimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return (min);
    }
    /*public static int sumMinMax(int[] array) {
        int max = Maximum(array);
        int min = Minimum(array);*/
        public void sumMinMax(int max){
            max = 7;
            int min = 0;
            int sum = min;
            for (int i = 1; i <=max; i++){
            sum = sum + 1;
        };
            //return (sum);
            System.out.println(sum);}
        /*return (sum);
    }*/
    public static void main (String[] args){
        int[] array = {13,12,3,-5,10,6,15,8,100};
        int max = Maximum(array);
        int min = Minimum(array);
        //nt sum = sumMinMax(n);
        System.out.println(max);
        System.out.println(min);
    }
}
