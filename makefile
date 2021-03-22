all: compile run

compile:
	javac *.java

run: 
	java Game

display:
	export DISPLAY=:0.0
	echo "Open xming"