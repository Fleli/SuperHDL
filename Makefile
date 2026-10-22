.PHONY: all

all:
	@cd SuperHDL && ./mvnw -q compile
	@java -cp SuperHDL/target/classes Main x y 123
