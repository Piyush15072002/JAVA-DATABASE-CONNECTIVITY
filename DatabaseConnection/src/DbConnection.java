// * Step-Cycle for the connectivity
// 1. Import
// 2. Load and register the Driver
// 3. Create connection
// 4. Create a statement
// 5. Execute the query
// 6. Process the result
// 7. Close connection

// Step 1 - Importing the java Sql package

import java.sql.*;

public class DbConnection {
    public static void main(String[] args) throws Exception {
        // we need to have the throws exception command in order to catch the sql errors

        // Step 2 - Load and register the driver
        // We could have used the TYPE 1 driver but the new version of JAVA, does not
        // support the TYPE 1 for sql connections so we need to download the SQL Driver
        // separately which is - "com.mysql.jdbc.Driver" which is a type 4

        // download the driver from the MAVEN REPOSITORY, which is a global
        // repository for all libraries

        // Search for "MySQL Connector Jar" -> MVN Repository -> Download driver

        // After downloading the driver, add it to the "Referenced Libraries" of the
        // JAVA PROJECT folder
        // now for VS code, the path to the driver is com.mysql.cj.jdbc.Driver

        // after doing this, don't run the file manually, it will give errors
        // Instead, click on the RUN link on top of the main function.

        Class.forName("com.mysql.cj.jdbc.Driver"); // forName is a method that helps us to load the class

        // Step 3 -

    }

}