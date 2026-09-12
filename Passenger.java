public class Passenger extends Person {

    private String passengerId;
    private String idProof;

    public Passenger(String name, int age, String gender,
                     String phone, String email,
                     String passengerId, String idProof) {

        super(name, age, gender, phone, email);

        this.passengerId = passengerId;
        this.idProof = idProof;
    }


    public String getPassengerId() {
        return passengerId;
    }

    public String getIdProof() {
        return idProof;
    }


    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }
}