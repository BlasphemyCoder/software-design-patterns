package lab05.ex03;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String salutation;
    private final String suffix;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isFemale;
    private final boolean isEmployed;
    private final boolean isHomewOwner;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", salutation='" + salutation + '\'' +
                ", suffix='" + suffix + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", isFemale=" + isFemale +
                ", isEmployed=" + isEmployed +
                ", isHomewOwner=" + isHomewOwner +
                '}';
    }

    private Person(Builder builder) {
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.salutation = builder.salutation;
        this.suffix = builder.suffix;
        this.streetAddress = builder.streetAddress;
        this.city = builder.city;
        this.state = builder.state;
        this.isFemale = builder.isFemale;
        this.isEmployed = builder.isEmployed;
        this.isHomewOwner = builder.isHomewOwner;
    }

    public static class Builder {
        // Required parameters
        private final String lastName;
        private final String firstName;
        private final boolean isFemale;

        // Optional parameters - initialized to default values
        private String middleName = "";
        private String salutation = "";
        private String suffix = "";
        private String streetAddress = "";
        private String city = "";
        private String state = "";
        private boolean isEmployed = false;
        private boolean isHomewOwner = false;

        public Builder(String firstName, String lastName, boolean isFemale) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.isFemale = isFemale;
        }

        public Builder middleName(String value) {
            this.middleName = value;
            return this;
        }

        public Builder salutation(String value) {
            this.salutation = value;
            return this;
        }

        public Builder suffix(String value) {
            this.suffix = value;
            return this;
        }

        public Builder streetAddress(String value) {
            this.streetAddress = value;
            return this;
        }

        public Builder city(String value) {
            this.city = value;
            return this;
        }

        public Builder state(String value) {
            this.state = value;
            return this;
        }

        public Builder isEmployed(boolean value) {
            this.isEmployed = value;
            return this;
        }

        public Builder isHomewOwner(boolean value) {
            this.isHomewOwner = value;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
