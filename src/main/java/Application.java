import commands.Action;
import commands.Decrypt;
import commands.Encrypt;

public class Application {


    public static void main(String[] args) {
        Action encrypt = new Encrypt(3);
        Action decrypt = new Decrypt(3);
        String text = "тысячи лет происходили вакханаллии";
        System.out.println("Length: " + text.length());
        System.out.println("Before encrypt " + text);
        text = encrypt.doAction(text);
        System.out.println("After encrypt " + text);
        System.out.println("-----------------");
        System.out.println("Before decrypt " + text);
        String text2 = decrypt.doAction(text);
        System.out.println("After decrypt "+text2);
        System.out.println("Length: " + text2.length());

    }
}
