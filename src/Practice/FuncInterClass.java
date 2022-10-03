package Practice;

public class FuncInterClass {

    public static void main(String[] args) {
        FuncInter<Boolean,String ,String> funcInter = (s1,s2) -> s1.equals(s2);
        System.out.println(funcInter.take("Aslıhan", "Aslıhan"));
    }

}
