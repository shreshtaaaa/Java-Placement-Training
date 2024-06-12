class Student{
    private int rollno=160;
    String name="Shreshta";
    void getroll(){ //get method
        System.out.println(rollno);
    }
    void setroll(){ //set method
        rollno=100;
    }
}
class encapsulation{
    public static void main(String[] args) {
        Student st=new Student();
        System.out.println(st.name);
        //System.out.println(st.rollno); //Error: rollno has private access in Student  
        st.getroll(); //before calling set method
        st.setroll(); //calling set method
        st.getroll(); //updated roll no
}
}