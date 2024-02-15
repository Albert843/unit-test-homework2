package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    /**
     *      Homework for Seminar 2
     */

    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);

        assertTrue(car instanceof Vehicle);
    }

    @Test
    void wheelsCarIsEqualsFour() {
        Car car = new Car("Dodge", "Ram", 2010);

        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void wheelsMotorcycleIsEqualsTwo() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "New Jawa", 2015);

        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void testDriveCar() {
        Car car = new Car("Dodge", "Ram", 2010);

        car.testDrive();

        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void testDriveMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "New Jawa", 2015);

        motorcycle.testDrive();

        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void parkingCar() {
        Car car = new Car("Dodge", "Ram", 2010);

        car.testDrive();
        car.park();

        assertThat(car.getSpeed()).isEqualTo(0);

    }

    @Test
    void parkingMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "New Jawa", 2015);

        motorcycle.testDrive();
        motorcycle.park();

        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }


}