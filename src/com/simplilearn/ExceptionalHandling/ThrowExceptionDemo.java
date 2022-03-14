public class ThrowExceptionDemo {
    public static void main(String[] args) {
        ageValidator(45);
        try {
            ageValidator(12);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        ageValidator(30);
        System.out.println("--------------------");
        try {
            usernameValidator("jyothsna");
            usernameValidator(null);
            usernameValidator("");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    private static void ageValidator(int age){
        if(age > 18){
            System.out.println("You are eligible");
        }else{
            throw new RuntimeException("Your age is "+age+" not Sufficient to vote");
        }
    }
    private static void usernameValidator(String str) throws Exception{
        if(str != null && str.length() > 0){
            System.out.println("Valid user name : "+str);
        }else{
            throw new Exception("Your username "+str+" is not valid!");
        }
    }
}
