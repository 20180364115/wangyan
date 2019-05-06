package Wre;

public class A {
    int age;
    String name;

    public A(String c, int f) {
        age = f;
        name = c;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof S) {
            S s = (S) obj;
            return this.name == s.name;
        }
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        else
            return false;
    }
    public String toString(){
        return name;
    }

}


