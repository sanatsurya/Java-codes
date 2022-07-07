package BasicsSpring;
interface Subject{
    public void subj_name(String name);
}
class Chemistry implements Subject{
    @Override
    public void subj_name(String name) {
        System.out.println("Subject name is Chemistry" + name);
    }
}
class Physics implements Subject{
    @Override
    public void subj_name(String name) {
        System.out.println("Subject name is Physics" + name);
    }
}
class Mathmatics implements Subject{

    @Override
    public void subj_name(String name) {
        System.out.println("Subject name is mathematics" + name);
    }
}
class FactorySubject{
    public Subject newSubject(String subjname){
        try {
            if (subjname.equals("physics")) {
                return new Physics();
            } else if (subjname.equals("chemistry") ) {
                return new Chemistry();
            } else if (subjname.equals("mathematics")) {
                return new Mathmatics();
            }
        }catch (RuntimeException e){
            throw new RuntimeException("Invalid Subject !"+subjname);
        }

        return null;
    }

}
public class FactoryPatternEx {
    public static void main(String[] args) {
         FactorySubject s1 = new FactorySubject();
        Subject subj1 = s1.newSubject("physics");
        subj1.subj_name(" ");
    }
}
