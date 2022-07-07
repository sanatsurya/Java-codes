abstract class DisplayName {
   abstract void printName();
    public void printResult(){
        int num1 = 10;
        int num2 = 150;
        int sum = num1+num2;
        System.out.println(sum);
    }
}
class AbstractionExample extends DisplayName{
        public void printName(){
        String fName = "Sanat";
        String lName = "Mallick";
        String fullName = fName+lName;
        System.out.println(fullName);
    }
    public static void main(String[] args) {
        AbstractionExample ae = new AbstractionExample();
        ae.printResult();
        ae.printName();

    }
}
