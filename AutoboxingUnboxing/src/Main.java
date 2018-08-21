import java.util.ArrayList;

class IntClass {
    private int mYValue;

    public IntClass(int mYValue) {
        this.mYValue = mYValue;
    }

    public int getmYValue() {
        return mYValue;
    }

    public void setmYValue(int mYValue) {
        this.mYValue = mYValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Paweł");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(55));
        System.out.println(intClassArrayList.get(0).getmYValue());

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.24);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

//        for(int i=0; i<=10; i++){
//            integerArrayList.add(Integer.valueOf(i));
//        }

//        for(int i=0; i<=10; i++){
//            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56;
        int myInt = myIntValue;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for(double dbl=0.0; dbl<=10.0; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
