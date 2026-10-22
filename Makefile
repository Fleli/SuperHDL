.PHONY: all

all:
	@cd Compiler && ./mvnw -q compile
	@java -cp Compiler/target/classes Main x y 123
	