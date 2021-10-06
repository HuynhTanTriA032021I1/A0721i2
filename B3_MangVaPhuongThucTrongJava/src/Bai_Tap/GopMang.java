package Bai_Tap;

public class GopMang {

    public static void main(String s[]) {
        int arr[] ={2,3};
        int add[] = new int[arr.length+1];
        for(int i=0;i<add.length;i++){
            if(i==add.length-1){
                add[i]=4;
            }else{
                add[i]=arr[i];
            }
            System.out.println(add[i]);
        }
    }
}
