public class Validations {

    public static void verifyText(String expected, String actual){
        if((expected.toLowerCase()).contains(actual.toLowerCase())){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }

}
