class methodoverloading {
    void kavi(int a,double b ){
        System.out.println("method 1");
    }
    void kavi(int a,double b,double c ){
        System.out.println("method 2");
       //display(1,2,3);
    }
    public static void main(String[] args) {
        methodoverloading  mol=new methodoverloading();
        mol.kavi(1,2);
        mol.kavi(1,4.5,3.8);

    }
}
