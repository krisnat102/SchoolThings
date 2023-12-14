package Abstract.Hospital;

public abstract class Patient {
    String name;
    String address;
    int egn;

    public Patient(String name, String address, int egn) {
        this.name = name;
        this.address = address;
        this.egn = egn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEgn() {
        return egn;
    }

    public void setEgn(int egn) {
        this.egn = egn;
    }

    abstract void Cure();
}
