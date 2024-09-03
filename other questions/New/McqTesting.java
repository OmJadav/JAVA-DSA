
   class McqTesting {
    public static void main(String args[]) {
    Bird a1 = new Bird();
    Bird a2 = new Bird();
    a1.setA(300);
    a2.display(a1);
    System.out.println(a2.a); } 

   
} class Bird {
    int a;
    void display(Bird a1) {
    this.a = 20; }
    void setA(int a1) {
    this.a = a1; } }