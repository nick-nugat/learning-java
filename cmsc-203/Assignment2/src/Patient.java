
public class Patient{
        private String firstName, middleName, lastName,
                       stateAddress, city, state, zipCode,
                       emergencyContactName, emergencyPhoneNumber;
        
        public Patient(){
            this.firstName = "John";
            this.middleName = "Green";
            this.lastName = "Mike";
            this.stateAddress = "152 Sample Street";
            this.city = "MyCity";
            this.state = "MyState";
            this.zipCode = "62164";
            this.emergencyContactName = "Gary";
            this.emergencyPhoneNumber = "521-627-9872";
        }

        public Patient(String firstName, String middleName, String lastName){
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.stateAddress = "152 Sample Street";
            this.city = "MyCity";
            this.state = "MyState";
            this.zipCode = "62164";
            this.emergencyContactName = "Gary";
            this.emergencyPhoneNumber = "521-627-9872";
        }

        public Patient(String firstName, String middleName, String lastName, String stateAddress, String city, String state, String zipCode, String emergencyContactName, String emergencyPhoneNumber){
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.stateAddress = stateAddress;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.emergencyContactName = emergencyContactName;
            this.emergencyPhoneNumber = emergencyPhoneNumber;
        }

        //accessors
        public String getFirstName(){ return firstName; }
        public String getMiddleName(){ return middleName; }
        public String getLastName(){ return lastName; }
        public String getStateAddress(){ return stateAddress; }
        public String getCity(){ return city; }
        public String getState(){ return state; }
        public String getZipCode(){ return zipCode; }
        public String getContactName(){ return emergencyContactName; }
        public String getNumber(){ return emergencyPhoneNumber; }

        //mutators
        public void setFirstName(String firstName){ this.firstName = firstName; }
        public void setMiddleName(String middleName){ this.middleName = middleName; }
        public void setLastName(String lastName){ this.lastName = lastName; }
        public void setStateAddress(String stateAddress){ this.stateAddress = stateAddress; }
        public void setCity(String city){ this.city = city; }
        public void setState(String state){ this.state = state; }
        public void setZipCode(String zipCode){ this.zipCode = zipCode; }
        public void setContactName(String emergencyContactName){ this.emergencyContactName = emergencyContactName; }
        public void setNumber(String emergencyPhoneNumber){ this.emergencyPhoneNumber = emergencyPhoneNumber; }

        public String buildFullName(){
            return getFirstName() + " " + getMiddleName() + " " + getLastName();
        }

        public String buildAddress(){
            return getStateAddress() + " " + getCity() + " " + getState() + " " + getZipCode();
        }

        public String buildEmergencyContact(){
            return getContactName() + " " + getNumber();
        }

        public String toString(){
            return "Name: " + buildFullName() + 
                   "\nAddress: " + buildAddress() + 
                   "\nEmergency Contact: " + buildEmergencyContact();
        }
    }

