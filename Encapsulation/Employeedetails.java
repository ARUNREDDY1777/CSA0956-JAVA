

public class Employeedetails {
    private String EmpName;
    private int Salary;
    private int credit;
    public String getEmpName(){
        return EmpName;
    }
    public int getSalary(){
        return Salary;
    }
    public int getcredit(){
        return credit+=Salary;
    }
    public void setEmpname(String name){
        EmpName=name;
       // return EmpName;
    }
    public void setsalary(int sala){
        Salary=sala;
       // return Salary;
    }
    public int setcredit(int cred){
        credit=cred;
        return credit;
    }
    public static void main(String[] arunreddy){
        Employeedetails emp=new Employeedetails();
        emp.setEmpname("Arun reddy");
        emp.setsalary(100000);
        emp.setcredit(25000);
        System.out.println("Name : "+emp.getEmpName());
         System.out.println("Salary: "+emp.getSalary());
          System.out.println(" total credit: "+emp.getcredit());
    }

    
}
