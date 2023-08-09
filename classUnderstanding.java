public class classUnderstanding {
    int a=10;
    int b=20;
    void sum(){
        int c=a+b;
        System.out.println("THE RESULT IS " +c);
    }
    public static void main(String []Args){
        classUnderstanding obj=new classUnderstanding();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.sum();
    }
}
