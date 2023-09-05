import java.util.HashMap;

public class VarOper {

    public int finalValueAfterOperations(String[] operations) {

        //Map our potential string values with 1 if its adding or negative 1 if subtracting.
        HashMap<String, Integer> map = new HashMap<>();
        int num = 0;

        //Add our keys which are our strings representing operations, and then their value.
        map.put("++X", 1);
        map.put("X++", 1);
        map.put("X--", -1);
        map.put("--X", -1);

        //Loop through the string array performing the operations on our number, num.
        for(int i = 0; i < operations.length; i++){
            num = num + map.get(operations[i]);
        }

        return num;
    }
}
