# java_azure_utilities
java codes for various azure native services <br>

# Microsoft Doc References
<b>https://docs.microsoft.com/en-us/azure/app-service/quickstart-java?tabs=javase&pivots=platform-windows-development-environment-maven </b>
<b>https://docs.microsoft.com/en-us/azure/cosmos-db/sql/sql-api-java-application</b>


# Configure the Maven plugin
Run the Maven command below to configure the deployment. This command will help you to set up the App Service operating system, Java version, and Tomcat version <br>
<b>> mvn com.microsoft.azure:azure-webapp-maven-plugin:2.5.0:config</b>

# Deploy the webapp
With all the configuration ready in your pom file, you can deploy your Java app to Azure with one single command<br>
<b>> mvn package azure-webapp:deploy</b>
