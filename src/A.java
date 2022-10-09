class A {
    static void b(int x){
        System.out.println("argument="+x );
    }
    static void b(int y,int z){
        System.out.println("argument="+y +"and "+z );
    }
    public static void main(String[] args) {
        b(1,2);
        b(8);

    }
}
