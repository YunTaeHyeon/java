class Enum {
    public String name;
    public  int career;
    public Name type;

    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.school="Dankook";
        developer.age=23;
        developer.type=Name.Yun;
        System.out.println(developer.age);
        System.out.println(developer.school);
        System.out.println(developer.type);
    }
}

enum Name{
    Yun,Kim,Lee
}
class Developer{
    public java.lang.String school;
    public int age;
    public Name type;
}
