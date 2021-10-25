package Thuc_Hanh.AccessModifier;

public class main {
    public static void main(String[] args) {

        // Private
        Private objPrivate = new Private();
        System.out.println("Private");
        System.out.println(objPrivate.data);//Compile Time Error
        objPrivate.msgPrivate();//Compile Time Error
        System.out.println("-----");

        // Default
        Default objDefault = new Default();
        System.out.println("Default");
        objDefault.msgDefault();
        System.out.println("-----");

        // Protected
        Protected objProtected = new Protected();
        System.out.println("Protected");
        objProtected.msgProteced();
        System.out.println("-----");

        // Public
        Public objPublic = new Public();
        System.out.println("Public");
        objPublic.msgPublic();

    }
}
