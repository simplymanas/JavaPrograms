public class UnitConversion {
    static double  PoundToKilograms(double poundValue){
        return poundValue * 0.45359337;

    }

    static double InchToFeet(double inch){
        return 12 * inch;
    }

    static double FeetToInch(double feet){
        return feet /12;
    }

//    static double IncheToCentimeter(double feet){
//        return feet /12;
//    }

    public static void main(String[] args) {
        System.out.println(PoundToKilograms(200));
    }
}
