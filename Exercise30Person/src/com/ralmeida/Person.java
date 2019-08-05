package com.ralmeida;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
        if ( age < 0 || age > 100){
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    //    *Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
    public boolean isTeen(){
        return (this.age > 12 && this.age < 20);
    }

    //    *Method named getFullName without any parameters, it needs to return the full name of the person.
    //    *In case both firstName and lastName fields are empty, Strings return an empty String.
    //    *In case lastName is an empty String, return firstName.
    //    *In case firstName is an empty String, return lastName.

    public String getFullName(){
        if (this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        } else if (this.lastName.isEmpty()){
            return this.firstName;
        } else if (this.firstName.isEmpty()){
            return this.lastName;
        } else {
            return this.firstName + " " + this.lastName;
        }

    }
}
