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

    }

}