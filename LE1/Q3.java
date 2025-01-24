public class Q3 {
    public static void main(String[] args) {
        Mother ob=new Mother();
        ob.show();
        Child oc = new Child();
        oc.show();
        Mother m1=new Child();
        m1.show();
    }
}
class Mother {
    static void show() {
        System.out.println("Hello World!");
    }
}
class Child extends Mother {
    static void show(){
        System.out.println("Hello JUET!");
    }
}
