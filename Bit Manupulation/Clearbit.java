public class Clearbit {

    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;

        int bitmask = 1 << pos; //0100
        int notBitmask = ~(bitmask); //1011

        int newNumber = notBitmask & n; //1011 & 0101 = 0001
        System.out.println(newNumber); 
    }
}

/* 
   In this first we perform NOT operation on bitmask,
   then we perform AND opertaion on notBitmask and n,
   AND operation covert the check which values are matching,
   If the values are not matched then it will become zero,
   else the AND operation change to 1
*/
