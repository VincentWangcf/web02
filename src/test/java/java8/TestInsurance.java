package java8;

import java.util.Optional;

public class TestInsurance
{
    public static String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }
    public static void main(String[] args) {


        Optional<Person> person = null;
        getCarInsuranceName(person);
        System.out.println( getCarInsuranceName(person));



    }
}
