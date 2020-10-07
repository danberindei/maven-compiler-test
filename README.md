# maven-compiler-test
Reproducer for MCOMPILER-434

`mvn clean compile` fails but says only

```
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project maven-compiler-test: Compilation failure -> [Help 1]
```

After commenting out the `<fork>true</fork>` line in pom.xml, the failure message includes the annotation processor's exception:

```
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project maven-compiler-test: Fatal error compiling: java.lang.NoClassDefFoundError: javax/annotation/Generated: javax.annotation.Generated -> [Help 1]
```
