package ProblemSolving;
public class SumIdentifier {
    public static void main(String[] args) {
        int list[]= {1,4,2,3,7,8,5};
        int target=9;
        for(int i=0; i<list.length;i++){
            for(int j=0; j<list.length;j++){
                if(list[i]+list[j]== target){
                    System.out.println(list[i]+"+"+list[j]+"is made sum"+target);
                }

            }
        }
    }
}
