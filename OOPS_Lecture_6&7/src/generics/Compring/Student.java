package generics.Compring;

public class  Student implements Comparable<Student>{
    int RollNo;
    float Marks;
    public Student(int rollNo, float marks) {
        RollNo = rollNo;
        Marks = marks;
    }

    @Override
    public String toString() {
        return Marks + " " + RollNo ;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.Marks - o.Marks);

        // if diff == 0: means both are equal
        // if this is < 0: means o is bigger else o is smaller

        return diff;
    }
}

