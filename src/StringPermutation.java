import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public List<String> permute(String input) {
        List<String> res = new ArrayList<String>();
            permuteHelper(input, "", res);


        return res;
    }

    public void permuteHelper(String input, String chosen, List<String> res) {
        if(input.isEmpty()) {
            res.add(chosen);
            System.out.println(chosen);
            return;
        }
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            chosen = chosen + c;
            String oldInput = input;
            input = input.substring(0,i) + input.substring(i + 1);
            permuteHelper(input, chosen, res);
            input = oldInput;
            chosen = chosen.substring(0, chosen.length() - 1);
        }
    }
}
