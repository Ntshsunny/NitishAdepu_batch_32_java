package week1;


abstract class Department1{
    abstract public int getDepartmentSize();
}

class SubDepartment extends Department1{
    public int getDepartmentSize(){
        int size =10;
        System.out.println("This is subDepartment");
        return size;

    }
}

public class Department {
    public static void main(String args[])
    {
        SubDepartment sd = new SubDepartment();
        int x=  sd.getDepartmentSize();
        System.out.println("displaying size of department : " +x);

    }
}