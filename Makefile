.PHONY: all

all:
	@cd Compilers/SuperHDL && ./mvnw -q compile
	@java -cp Compilers/SuperHDL/target/classes Main x y 123
