package Ques_1a;

public class UG_SuperStudent extends Student implements TA, RA{
    String professor, research;
    int salary;
    UG_SuperStudent(String firstName, String lastName, String studentID, int age,String professor,String research,int salary) {
        super(firstName, lastName, studentID, age);
        this.professor=professor;
        this.research=research;
        this.salary=salary;
    }

    @Override
    public void register(){
        System.out.println("Registered course");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Professor name: "+professor);
        System.out.println("Research name: "+research);
        System.out.println("Total Salary: "+salary);
    }

    @Override
    public void assistProfessor(){
        System.out.println(" The name of professor the TA is assisting this semester is "+professor);
    }
    @Override
    public void conductResearch(){
        System.out.println("The name of research work the RA is currently working on is "+research);
    }

}

//Instruction
//Which Part WE will write only
