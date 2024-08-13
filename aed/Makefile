all: build run

build:
	javac -d bin Main.java
	javac -d bin aulas/aula20.java
	javac -d bin libs/Entrada.java
	javac -d bin libs/matematica.java

run:
	@java -cp bin Main


clear:
	rm bin/Main.class

git:
	git config --global user.email "gustavobertuzziif@gmail.com"
	git config --global user.name "Gustavo Bertuzzi"