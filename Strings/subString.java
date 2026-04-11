public class subString {
    public static void main(String[] args) {
        String sentance = "My name is Vaibhav";
        String name = sentance.substring(11, sentance.length());

        System.out.println(name);

        //STrings are Immutale

        String sentance2 = "Vaibhav Patil";
        String name2 = sentance2.substring(8);

        System.out.println(name2);
    }
}
