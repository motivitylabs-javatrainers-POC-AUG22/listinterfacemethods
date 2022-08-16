package doctor1;

public class Doctor2 {
    private int pno;
    private String pname;
    private String pdisease;




    public int getPno() {
        return pno;
    }

    @Override
    public String toString() {
        return "Doctor1{" +
                "pno=" + pno +
                ", pname='" + pname + '\'' +
                ", pdisease='" + pdisease + '\'' +
                '}';
    }

    public String getPname() {
        return pname;
    }

    public String getPdisease() {
        return pdisease;
    }

    public  Doctor2(int pno, String pname, String pdisease){
        this.pno=pno;
        this.pname=pname;
        this.pdisease=pdisease;
    }

}


