Follow the beloe instructions
mvn clean install 
mvn clean test-compile   
mvn dependency:copy-dependencies   
java -cp "target/test-classes:target/dependency/*" io.cucumber.core.cli.Main --glue Runner --glue Testcases --tags "@Run" src/test/resources/DesignProject.feature 