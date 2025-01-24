public class Q1 {
    public static void main(String[] args) {
        Mother ob=new Mother();
        ob.show();
        Child oc = new Child();
        oc.show();
    }
}
class Mother {
    int x;
    Mother(){
        x=1;
    }
    void show() {
        System.out.println(x);
    }
}
class Child extends Mother {
    Child(){
        super();
    }
    void show(){
        super.show();
    }
}
