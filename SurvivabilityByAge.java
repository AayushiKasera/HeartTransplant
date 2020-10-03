public class SurvivabilityByAge {

    // Example for age = 50, years = 5, rate = 74.7
    // 5 years after the transplant people with age less 
    // than 50 years old have a survivability rate of 74.7%
    private int age;        // people with age less than age
    private int years;      // years post transplant
    private double rate;    // survival rate

    public SurvivabilityByAge(int age, int years, double rate) {
        this.age = age;
        this.years = years;
        this.rate = rate;
    }

    /*
     * Returns age 
     */
    public int getAge() {
        return age;
    }

    /*
     * Returns yearsPostTransplant
     */
    public int getYears() {
        return years;
    }

    /*
     * Returns rate
     */
    public double getRate() {
        return rate;
    }

    /*
     * Returns the string representation
     */
    public String toString() {
        return age + ", " + years + ", " + rate;
    }
}