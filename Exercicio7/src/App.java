
public class App {
    public static void main(String[] args) throws Exception {
        NaturalPerson pedro = new NaturalPerson("Pedro", "Pereira", 12, 'm', "Solteiro", "12345678912", "21234872");
        System.out.println(pedro.toString());
    }
}

class NaturalPerson{
    private String name, lastName, maritalStatus;
    private int age;
    private char gender;
    private String cpf, cep;
    
    public NaturalPerson(String name, String lastName, int age, char gender, String maritalStatus, String cpf,
            String cep) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.cpf = cpf;
        this.cep = cep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) throws Exception {
        if (cep == null || cep.length() != 8 || !cep.matches("\\d+")) {
            throw new Exception("CEP inválido");
        }
        this.cep = cep;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + age;
        result = prime * result + gender;
        result = prime * result + ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((cep == null) ? 0 : cep.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NaturalPerson other = (NaturalPerson) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (age != other.age)
            return false;
        if (gender != other.gender)
            return false;
        if (maritalStatus != other.maritalStatus)
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (cep == null) {
            if (other.cep != null)
                return false;
        } else if (!cep.equals(other.cep))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PhysicalPerson [name=" + name + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
                + ", maritalStatus=" + maritalStatus + ", cpf=" + cpf + ", cep=" + cep + "]";
    }
}
