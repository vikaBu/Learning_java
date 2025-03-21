
# Cat fact app

Simple command line app that fetches a fun fact from  <https://catfact.ninja/#/Facts> - a simple project to start learning java

<img width="703" alt="Screenshot 2025-03-21 at 20 38 13" src="https://github.com/user-attachments/assets/bc599182-f043-43db-a800-102f02335990" />

# Set up repo

brew install maven

this will create a base project
```mvn archetype:generate -DgroupId=com.example -DartifactId=CatFactApp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false```

adding tependancies

``` xml
      <dependency>
      <groupId>org.json</groupId>
      <artifactId>json</artifactId>
      <version>20230227</version>
  </dependency>
  ```

   in pom file (org.json - JSON parser)
   imports unlike python or javascript .. xml is something :D

# how to get a fact?

```mvn exec:java -Dexec.mainClass="com.example.CatFacts"```


personal notes

Java dependencies are scary- spent most of my time on configuration and imports which still appear broken on IDE but it works

had some issues setting project root i did it by hand by running:
command + shift + p & Java: Clean Java Language server

hate the 5 level deep directories :D WHY


