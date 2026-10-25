# SuperHDL Compiler

Java 21 Maven project for the SuperHDL compiler.

## Build

Install JDK 21 or newer and set `JAVA_HOME` to its installation directory.
The included [Maven Wrapper](https://maven.apache.org/wrapper/) downloads the
pinned Maven version on first use; a separate Maven installation is unnecessary.

From the repository root:

```sh
cd SuperHDL
./mvnw clean verify
```

On macOS, select an installed JDK 21 before building:

```sh
export JAVA_HOME="$(/usr/libexec/java_home -v 21)"
```

On Windows, use `mvnw.cmd clean verify` instead.

Build output is written to `target/`, which is ignored by Git.

## Source layout

- `src/main/java/`: compiler source code.
- `src/test/java/`: test source code.
- `pom.xml`: project metadata and Java compiler configuration.

The project is an empty scaffold. No compiler implementation, entry point, or
test framework has been added yet. Open `pom.xml` to import it into a Java IDE.
