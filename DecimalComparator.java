public class DecimalComparator {
    public static void main(String[] args) {
        boolean ans = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(ans);
        
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2)
    {
        int num1Check = (int)(num1 * 1000);
        int num2Check = (int)(num2 * 1000);
        if(num1Check - num2Check == 0)
        {
            return true;
        }
        else
        {
            return false;
        }


    }
    
}
