package week1;

import java.net.StandardSocketOptions;

interface vehicle{
    abstract public void car();
}
interface make{
    abstract public void model();
}
class Nissan implements vehicle, make{
    @Override
    public void car() {
        System.out.println("this is implementation method of interface car()");
    }

    @Override
    public void model() {
        System.out.println("this is implemntation method of interface model()");
    }
}

class usingInterfaces {
    public static void main(String args[])
    {
        Nissan n = new Nissan();
        n.car();
        n.model();

    }
}
