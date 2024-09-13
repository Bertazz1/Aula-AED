all: build run

build:
	javac -d bin Main.java
	javac -d bin aulas/aula*.java
	javac -d bin libs/entrada.java
	javac -d bin libs/matematica.java

run:
	@java -cp bin Main


clear:
	rm bin/*

git:
	git config --global user.email "gustavobertuzziif@gmail.com"
	git config --global user.name "Gustavo Bertuzzi"


