public class Q2 {
    public static void main(String[] args) {
        Mother ob=new Mother();
        ob.show();
        Child oc = new Child();
        oc.show();
    }
}
class Mother {
    void show() {
        System.out.println("Hello World!");
    }
}
class Child extends Mother {
    void show(){
        System.out.println("Hello JUET!");
    }
}