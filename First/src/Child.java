public class Child extends  Parent{

    public  void chidlPrint(){
        System.out.println("this i s from child");
    }
    public Child(){
        this.id=1;
        this.name="Cname";
        this.setPhone("01234");
    }
    public void  print_all(){
        System.out.println("id "+this.id+" Name "+this.name+" phone "+this.getPhone());
    }
}
