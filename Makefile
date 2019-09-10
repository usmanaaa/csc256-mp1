shell: shell.c
	$(CC) -g -o shell shell.c

clean:
	rm -f shell
