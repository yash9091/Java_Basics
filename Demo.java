class A{
    public void progA(){
        System.out.println("class A");
    }

}

class B extends A{
    int a,b;
    public void progB(){
        System.out.println("class B");
    }

    public B(int a, int b){
        a.this = a;
        b.this = b;

        
    }

}

class C extends B{

    public C(int a, int b){
        super(a,b) // Calls B's constructor
    }
    public void cMethod(){
        System.out.println("C class method called");
    }
    
}

class Demo{

    public static void main(String args[])
    {
        C obj = new C(10, 20);
        obj.progA(); // from A
        obj.progB(); // from B
        obj.cMethod(); // from C

        // Accessing values
        System.out.println("a: " + obj.a + ", b: " + obj.b);   
    }
}