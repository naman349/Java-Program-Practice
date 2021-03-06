class AutonomousCar {
 private int carId, noOfTestsConducted, noOfTestsPassed;
 private String brand, environment, grade;
 AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
  this.carId = carId;
  this.brand = brand;
  this.noOfTestsConducted = noOfTestsConducted;
  this.noOfTestsPassed = noOfTestsPassed;
  this.environment = environment;
 }
 int getCarId() {
  return carId;
 }
 String getBrand() {
  return brand;
 }
 int getNoOfTestsConducted() {
  return noOfTestsConducted;
 }
 int getNoOfTestsPassed() {
  return noOfTestsPassed;
 }
 String getEnvironment() {
  return environment;
 }
 void setGrade(String grade) {
  this.grade = grade;
 }
 String getGrade() {
  return grade;
 }
}