public class SurvivabilityByCause {

    // Example for cause = 4, years = 1, rate = 89.4
    // 1 year after the transplant people which had heart muscle disease as
    // the condition cause have a survivability rate of 89.4% 
    private int cause;
    private int years;
    private double rate;

    public SurvivabilityByCause(int cause, int years, double rate) {
        this.cause = cause;
        this.years = years;
        this.rate = rate;
    }
    /*
     * Returns cause 
     */
    public int getCause() {
        return cause;
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
        String ret = "";
        switch (cause) {
            case Person.CAUSE_VIRAL:
            ret = "viral";
            break;

            case Person.CAUSE_CONGENITAL:
            ret = "congenital";
            break;

            case Person.CAUSE_ACCIDENT:
            ret = "accident";
            break;

            case Person.CAUSE_HEART_ARTERY_DISEASE:
            ret = "heart artery disease";
            break;

            case Person.CAUSE_HEART_MUSCLE_DISEASE:
            ret = "heart muscle disease";
            break;
        }
        return ret + ", " + years + ", " + rate;
    }
}