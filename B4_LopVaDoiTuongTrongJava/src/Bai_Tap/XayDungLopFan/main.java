package Bai_Tap.XayDungLopFan;

public class main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.fast, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.medium, false, 5, "blue");

        System.out.println(fan1);
        System.out.println(fan2);
    }
}
