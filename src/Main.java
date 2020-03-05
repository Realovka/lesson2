public class Main {

    public static void main(String[] args) {
        long count = 1122222111444L;
        char symbol='z';

        String stringName="Feofan";
        String namesake=stringName;


        System.out.println(symbol);
        System.out.println(namesake);

        int a=5;
        int b=3;
      boolean res=a<=b;
        System.out.println(a);
        System.out.println(b);

        System.out.println(res);
        int[] array = new int [5];
        array [0]=2;
        array [1]=1;
        array [2]=0;
        array [3]=5;
        array [4]=3;
        for (int i=array.length; i>0;i--){
        System.out.println(array [i-1]);}
        System.out.println("Демонстрация switch");
        for (int i=0; i<array.length; i++){
            System.out.print ("В " +(i+1) +"-м матч");
            switch (array[i]){
                case 0:
                    System.out.println("не забил ни одного гола" );
                    break;
                case 1:
                    System.out.println(" забил один гол" );
                    break;
                case 2:
                    System.out.println(" оформил дубль" );
                    break;
                case 3:
                    System.out.println(" охормил хет-трик" );
                    break;
                default:
                    System.out.println(" играл как Боженька" );
            }
        }


    }
}
