import java.util.List;

class MixForLoops{
    public static void main(String[] args){
        List<Integer> nums = List.of(1,2,3,4,5); //A
        String output="";
        for (Integer num : nums) //B
            output += nums + ""; //C
            System.out.println(output);
        
    }
}

//A: this line initializes the 'List' of 'Integer' objects named 'nums' with the values 1 through 5

//B: for each 'Integer' 'num' in 'nums'

//C: adding the string representation of the entire list 'nums' to 'output' during each iteration, instead 
//of adding the current number 'num'. So we're repeatedly adding the entire list to the 'output' string
//Tf, the final representation of 'output' is the string representation of the entire list repeated
//as many times as there are elements in the list
