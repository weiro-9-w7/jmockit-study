package nomal;

public class SomeService {

    private SomeDAO dao;

    public String fun1(){
        System.out.println("begin to test func1");
        String ret = dao.fun1();
        System.out.println("end to test func1, result=" + ret);
        return ret;
    }
}
