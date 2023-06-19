import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File binder = new File("TEST");
        String[] dizinTwo = binder.list();

        for(String str:dizinTwo){
            System.out.println(str);
        }
        File newBinder = new File("patika/Test");
        System.out.println(newBinder.mkdirs());
        File dizin = new File("TEST");
        dizin.mkdir();

        File binderTwo = new File("TEST/JAVA.txt");
        try {
            System.out.println(binderTwo.createNewFile());
        }catch (IOException e){
            e.printStackTrace();
        }


        try {
            if(binder.createNewFile()){
                System.out.println(binderTwo.getName()+" BINDER IS CREATED!!");
            }
            else{
                System.out.println(binderTwo.getName()+" BINDER IS ALREADY EXISTS!!");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
