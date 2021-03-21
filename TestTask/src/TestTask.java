import java.util.ArrayList;
import java.util.Scanner;

public class TestTask
{
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<Character>();
        ArrayList<Character> arrayList2 = new ArrayList<Character>();

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        for(int j = 0;j <arr.length;j++){
            arrayList.add(arr[j]);
        }
        long count = str.codePoints().filter(Character::isDigit).count();
        for(int i = 0; i<arrayList.size() && count != 0; i++) {

            if(Character.isDigit(arrayList.get(i))){
                int z = i;
                int z2= i;
                int num = Character.getNumericValue(arrayList.get(i));
                while(arrayList.get(z2) != ']'){
                    z2++;
                }
                while(num!=0){
                    for(int a = z+2; a<z2; a++){
                        arrayList2.add(arrayList.get(a));
                    }num--;
                }
            }
        }
        for(int o = 0; o<arrayList2.size(); o++) {
            char value = arrayList2.get(o);
            System.out.print(value);
        }
    }
}