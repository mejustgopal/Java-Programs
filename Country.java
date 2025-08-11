class Country {
    // Static variable
    static int countryCounter;
    String name;
    int counter;

    Country() // Constructor function
    {
        countryCounter++;
    }

    public static void main(String[] args) {
        Country ob1 = new Country();
        // Creating first instance
        // Assigning values to object's data variables.
        ob1.name = "India";
        ob1.counter = 1;
        Country ob2 = new Country(); // Creating second instance
        ob2.name = "South Africa";
        ob2.counter = 1;
        System.out.println("ob1.countryCounter = " + ob1.countryCounter);
        System.out.println("ob2.countryCounter = " + ob2.countryCounter);
        System.out.println("Country.countryCounter = " + Country.countryCounter);
    }
}
