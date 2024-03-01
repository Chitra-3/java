class Tests{
    public static void main(String[] args) {
        Student student=new Student();
        student.journey();
        try{
            student.learning();
        }catch(PSDSessionException e){
            System.out.println(e);
        }
    }
}
