/*WAP to read age from command line argument :  
1) if entered data isnot number, raise exception
2) if age <18 raise exception too young show message =>too young to get married
3)if age >60 raise exception too old show msg=>too old to get married
*/
class TooYoung extends RuntimeException{
    TooYoung(){
        super("Too young to get married");
    }
}
class TooOld extends RuntimeException{
    TooOld(){
        super("Too old to get married");
    }
}
public class CustomException2 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("no age specified!!");
        }else{
            int age;
            try{
                age = Integer.parseInt(args[0]);
                if(age<18){
                    throw new TooYoung();
                }if(age>60){
                    throw new TooOld();
                }
            }catch(TooYoung e){
                System.out.println(e.getMessage());
            }catch(TooOld e){
                System.out.println(e.getMessage());
            }catch(Exception e){
                System.out.println("Entered data is not a number");
            }
        }
    }
}
