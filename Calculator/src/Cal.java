import java.util.Scanner;

public class Cal {

    //Problem statement - Build a basic calculator that can perform operations like addition, subtraction,
    //multiplication, and division. This will give you practice with functions and control
    //flow.

    private int n;
    private int add = 0;
    private int div = 0;
    private int mul = 0;
    private int sub = 0;
    private String operator;
    int total;

    public Cal(int n){
        this.n = n;
        for(int i =0; i < n; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter operation : ");
            String opr = sc.next();
            operator = opr;

            switch (operator.toUpperCase()){
                case "ADD" ->{
                    addition(num1);
                }
                case "SUB" ->{
                    subtraction(num1);
                }
                case "MUL"->{
                    multiplication(num1);
                }
                case "DIV" ->{
                    division(num1);
                }
                default -> {
                    System.out.println("Invalid request");
                }
            }
        }
    }

    public void addition(int num1){
        add += num1;
    }
    public void subtraction(int num1){
        if(sub != 0){
            sub -= num1;
        }else
        sub = num1;
    }
    public void multiplication(int num1){
        if(mul != 0){
            mul *= num1;
        }
        else{
            mul = num1;
        }
    }
    public void division(int num1){
        if(div != 0){
            div /= num1;
        }
        else{
            div = num1;
        }
    }

    public int totalValue(){
        total = add + sub + mul + div;
        return total;
    }



}
