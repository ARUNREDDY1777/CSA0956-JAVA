public class Student { 
    private String Name;
    private int marks;
    public String getName(){
        return Name;
    }
    public int getmark(){
        return marks;
    }
    public String setName(String Name){
        this.Name=Name;
        return Name;
    }
    public int setmark(int marks){
        this.marks=marks;
        return marks;
    }
    public static void main(String[] arun){
        Student det=new Student();
        det.setName("Sadwik");
        det.setmark(49);
        System.out.println("Student_name: "+det.getName());
        System.out.println("Marks: "+det.getmark());


    }
    
}

    

