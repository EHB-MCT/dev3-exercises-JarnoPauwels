import java.sql.*
import java.util.*

fun main() {
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()
    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.user
    connectionProps["password"] = credentials.password

    // Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

    val statement = connection.prepareStatement("SELECT * FROM rides")
    statement.setString(1, search)
    val result = statement.executeQuery()
    while(result.next()) {
        println(result.getString("destination_city"))
    }

}